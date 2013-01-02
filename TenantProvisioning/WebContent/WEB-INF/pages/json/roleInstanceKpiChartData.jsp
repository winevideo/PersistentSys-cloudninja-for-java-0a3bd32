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
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json"%>

${callback}(
<json:object>
	<json:property name="success" value="true"></json:property>
	<json:array name="list" items="${kpiRoles}" var="roles">
		<json:object>
			<json:property name="Id" value="${roles.roleId}" />
			<json:property name="Instance" value="${roles.instance}" />
			<json:property name="Name" value="${roles.roleName}" />
			<json:array name="KpiType" items="${kpiTypes}" var="item">
				<json:object>
					<json:property name="Id" value="${item.kpiId}" />
					<json:property name="Name" value="${item.kpiName}" />
				</json:object>
			</json:array>
		</json:object>
	</json:array>
</json:object>
);