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
package com.persistent.cloudninja.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.persistent.cloudninja.dao.TenantDao;
import com.persistent.cloudninja.domainobject.TenantEntity;

/**
 * Implementation class for Tenant DAO.
 *
 */
@Repository("tenantDao")
public class TenantDaoImpl implements TenantDao {
	
	private static final Logger LOGGER = Logger.getLogger(TenantDaoImpl.class);
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public TenantEntity find(String tenantId) {
		TenantEntity tenantEntity = null;
		try {
			tenantEntity = hibernateTemplate.get(TenantEntity.class, tenantId);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return tenantEntity;
	}

	@Override
	public void delete(TenantEntity tenantEntity) {
		try {
		hibernateTemplate.delete(tenantEntity);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

	@Override
	public void update(TenantEntity tenantEntity) {
		hibernateTemplate.saveOrUpdate(tenantEntity);
	}

}
