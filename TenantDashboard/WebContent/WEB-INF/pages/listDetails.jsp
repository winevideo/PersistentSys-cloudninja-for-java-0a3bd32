<%--
Copyright 2012 Persistent Systems Ltd.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div id="main">
        <div id="mainContainer">
            

<h2>Details</h2>

<fieldset>
    <legend>MyTask</legend>

<c:forEach items="${taskListDTO.taskList}" var="task" varStatus="varStatus">
<% %>

    <div class="display-label">TaskId</div>
    <div class="display-field">${ task.taskId }</div>

    <div class="display-label">Subject</div>
    <div class="display-field">${ task.subject }</div>

    <div class="display-label">StartDate</div>
    <div class="display-field">${ task.startDate }</div>

    <div class="display-label">DueDate</div>
    <div class="display-field">${ task.dueDate }</div>

    <div class="display-label">Priority</div>
    <div class="display-field">${ task.priority }</div>

    <div class="display-label">Details</div>
    <div class="display-field">${ task.details }</div>
    </c:forEach>
</fieldset>
<p>
<!--    <a href="editListPage.htm">Edit</a> |-->
    <a href="showTenantHomePageList.htm">Back to List</a>
</p>


            <div id="footer">
            </div>
            </div>
        </div>
