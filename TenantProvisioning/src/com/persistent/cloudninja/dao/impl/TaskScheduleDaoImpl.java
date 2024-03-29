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

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.persistent.cloudninja.dao.TaskScheduleDao;
import com.persistent.cloudninja.domainobject.TaskScheduleEntity;

/**
 * 
 * Implementation of TaskScheduleDao
 * 
 * @author
 * 
 */
@Repository("taskScheduleDao")
public class TaskScheduleDaoImpl implements TaskScheduleDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@SuppressWarnings("unchecked")
    @Override
	public List<TaskScheduleEntity> getTaskScheduledList() {
		List<TaskScheduleEntity> TaskScheduledList = hibernateTemplate.find("from TaskScheduleEntity");
		return TaskScheduledList;
	}

	@Override
	public void updateTaskSchedule(TaskScheduleEntity taskScheduleEntity) {
		hibernateTemplate.saveOrUpdate(taskScheduleEntity);
	}
}
