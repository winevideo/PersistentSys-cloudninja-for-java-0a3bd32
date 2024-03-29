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

import com.persistent.cloudninja.domainobject.RoleEntity;

/**
 * Interface for Role DAO.
 *
 */
public interface RoleDao {
	/**
	 * Finds RoleEntity by role name.
	 * 
	 * @param roleName : the roleName to find.
	 * @return RoleEntity having the specified roleName.
	 */
	public RoleEntity findByRoleName(String roleName);
	/**
	 * Adds a RoleEntity.
	 * 
	 * @param roleEntity
	 */
	public void add(RoleEntity roleEntity);
}
