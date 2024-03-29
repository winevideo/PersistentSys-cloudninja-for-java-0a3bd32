/*******************************************************************************
 * Copyright 2012 Persistent Systems Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.persistent.cloudninja.scheduler;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.microsoft.windowsazure.services.core.storage.StorageException;
import com.microsoft.windowsazure.services.queue.client.CloudQueueMessage;
import com.persistent.cloudninja.utils.SchedulerSettings;

/**
 * Schedules the generator and processor for
 * tenant storage bandwidth calculation task.
 *
 */
@Component
public class TenantStorageBWScheduler {
	
	private static final Logger LOGGER = Logger.getLogger(TenantStorageBWScheduler.class);
	
	@Autowired
	private TenantStorageBWGenerator tenantStorageBWGenerator;
	
	@Autowired
	private TenantStorageBWProcessor tenantStorageBWProcessor;
	
	@Autowired
	private StorageUtility storageUtility;

	/**
	 * This is a generator task which will listen to taskscheduler-storagebandwidth 
	 * for a message, if message exists then call execute() and delete the message 
	 * from taskscheduler-storagebandwidth 
	 */
	@Scheduled(fixedDelay=SchedulerSettings.GeneratorInterval)
	public void generator() {
		LOGGER.debug("SCH-generator : enter");
		CloudQueueMessage message;
		try {
			message = storageUtility.getMessage("taskscheduler-" 
					+ SchedulerSettings.StorageBandwidthTask.toLowerCase());
			if (message != null) {
				LOGGER.debug("SCH-generator : msg is not null");
				if(tenantStorageBWGenerator.execute()) {
					storageUtility.deleteMessage("taskscheduler-" 
							+ SchedulerSettings.StorageBandwidthTask.toLowerCase(), message);
					LOGGER.debug("SCH-generator : msg deleted");
				}
			}
			LOGGER.debug("SCH-generator : exit");
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
	}
	
	/**
	 * This will call execute() on processor. 
	 * If execute returns true then delete the message from the 
	 * queue shared between generator and processor.
	 */
	@Scheduled(fixedDelay=SchedulerSettings.ProcessorInterval)
	public void processor() {
		LOGGER.debug("SCH-processor : enter");
		if (tenantStorageBWProcessor.execute()) {
			try {
				LOGGER.debug("SCH-processor : execute");
				ActivityWorkQueue workQueue = tenantStorageBWProcessor.getWorkQueue();
				workQueue.complete();
				LOGGER.debug("SCH-processor : complete");
			} catch (StorageException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
		LOGGER.debug("SCH-processor : exit");
	}
}
