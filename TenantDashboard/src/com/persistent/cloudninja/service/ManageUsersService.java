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

import java.util.List;

import com.persistent.cloudninja.domainobject.IdentityProviderEntity;
import com.persistent.cloudninja.domainobject.Member;
import com.persistent.cloudninja.exception.SystemException;

public interface ManageUsersService {

	/*
	 *   Manage Users List
	 *   @param String TenantID
	 *   
	 * */
	List<Member> getManageUsersList(String tenantId) throws SystemException;
	
	
	/*
	 *   Create User
	 *   @param Member Object
	 *   
	 * */
	void createUser(Member member)throws SystemException;

	/*
	 *   Delete User
	 *   @param Member Object
	 * */
	void deleteUser(Member member)throws SystemException;
	
	/*
	 *   Update User
	 *   @param Member Object
	 * */

	void updateUser(Member member)throws SystemException;

	/**
	 *   Find User for given Invitation Code and 
	 *   if found update the Live GUID
	 *   @param String invitationCode
	 *   @param String liveGuid
	 *   @return boolean
	 * 
	 */
	boolean findAndUpdateMember(String invitationCode, String liveGuid);
	
	/**
	 * Returns the list of Identity Providers
	 * 
	 * @return IdentityProviderEntity List
	 */
	public List<IdentityProviderEntity> getIdentityProviderList();

}
