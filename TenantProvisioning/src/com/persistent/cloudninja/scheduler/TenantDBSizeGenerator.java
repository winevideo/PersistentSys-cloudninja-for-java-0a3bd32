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

import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import com.microsoft.windowsazure.services.core.storage.StorageException;
import com.persistent.cloudninja.dao.TaskCompletionDao;
import com.persistent.cloudninja.dao.TenantIdMasterDao;
import com.persistent.cloudninja.domainobject.TenantIdMasterEntity;
import com.persistent.cloudninja.utils.SchedulerSettings;
import com.persistent.cloudninja.utils.StorageClientUtility;

/**
 * Generator for tenant DB size calculation task. It generates the
 * messages to be processed by processor.
 *
 */
@Component
public class TenantDBSizeGenerator extends TaskActivityBase {
    
    @Autowired
    private TaskCompletionDao taskCompletionDao;
	
	private static final Logger LOGGER = Logger.getLogger(TenantDBSizeGenerator.class);
	
	@Autowired
	private TenantIdMasterDao tenantIdMasterDao;

	public TenantDBSizeGenerator() throws InvalidKeyException, URISyntaxException {
		//tenantdbsizequeue which is shared between processor and generator.
		super(new TenantDBSizeQueue(SchedulerSettings.DatabaseSizeQueue, StorageClientUtility.getCloudStorageAccount().createCloudQueueClient()));
	}

	/**
	 * Adds message to tenantdbsizequeue which is shared between processor
	 * and generator.
	 */
	@Override
	public boolean execute() {
	    StopWatch watch = new StopWatch();
		boolean retVal = true;
		int tenantIds = 0;
		try {
		    watch.start();
			LOGGER.debug("In generator");
			TenantDBSizeQueue queue = (TenantDBSizeQueue) getWorkQueue();
			List<TenantIdMasterEntity> listTenant = tenantIdMasterDao.getAllTenants();
			tenantIds = listTenant.size();
			for (Iterator<TenantIdMasterEntity> iterator = listTenant.iterator(); iterator.hasNext();) {
				TenantIdMasterEntity tenant = (TenantIdMasterEntity) iterator.next();
				String tenantId = tenant.getTenantId();
				queue.enqueue(tenantId);
				LOGGER.info("Generator : msg added is " + tenantId);
			}
			watch.stop();
			taskCompletionDao.updateTaskCompletionDetails(watch.getTotalTimeSeconds(), "GenerateMeterTenantDBSizeWork", "Measure database size for "+tenantIds+" tenants");
		} catch (StorageException e) {
			retVal = false;
			LOGGER.error(e.getMessage(), e);
		}
		return retVal;
	}

}
