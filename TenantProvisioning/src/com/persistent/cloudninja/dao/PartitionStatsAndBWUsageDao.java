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
package com.persistent.cloudninja.dao;

import java.util.List;

import com.persistent.cloudninja.domainobject.DBBandwidthUsageEntity;

/**
 * Interface for PartitionStatsAndBWUsage DAO.
 *
 */
public interface PartitionStatsAndBWUsageDao {

	/**
	 * Get the DB size for a tenant.
	 * 
	 * @param tenantId.
	 * @return the DB size.
	 */
	public long getDBSize(String tenantId);
	
	/**
	 * Get database bandwidth usage for all databases other than master.
	 * 
	 * @return the list of DBBandwidthUsageEntity.
	 */
	public List<DBBandwidthUsageEntity> getBandwidthUsage();
}
