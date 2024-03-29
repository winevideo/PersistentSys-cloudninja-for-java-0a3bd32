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
package com.persistent.cloudninja.service;

import com.persistent.cloudninja.transferObjects.UsageDTO;

public interface UsageService {
	/**
     * List monthly Metering  
     * @param month The entity mapped to DB
     * @param year The Year
     */
	public UsageDTO getMetering (int month, String year);

	/**
     * List daily tenant Metering in specific month and year 
     * @param tenantId The entity mapped to DB
     * @param month The entity mapped to DB
     * @param year The entity mapped to DB
     */
	public UsageDTO getTenantMetering(String tenantId, int month,int year);
	
	/**
	 * Runs metering tasks manually.
	 */
	public void runMeteringTasksManually();
}
