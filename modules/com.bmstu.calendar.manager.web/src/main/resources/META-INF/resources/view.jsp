<%@include file="/init.jsp"%>

<%
	Calendar calendarVar = null;
%>

<aui:button-row cssClass="traccar-buttons">

	<portlet:renderURL var="addCalendarURL">
		<portlet:param name="mvcPath" value="/add_calendar.jsp" />
	</portlet:renderURL>

	<aui:button onClick="<%=addCalendarURL.toString()%>" value="Add Calendar"></aui:button>

</aui:button-row>

<liferay-ui:search-container
	total="<%=CalendarLocalServiceUtil.getCalendarsCount()%>">
	<liferay-ui:search-container-results
		results="<%=CalendarLocalServiceUtil.getCalendars(scopeGroupId.longValue(), searchContainer.getStart(),
						searchContainer.getEnd())%>" />

	<liferay-ui:search-container-row
		className="com.bmstu.calendar.manager.core.model.Calendar"
		modelVar="calendar">

		<liferay-ui:search-container-column-text property="calendarId" />
		
		<liferay-ui:search-container-column-text property="name" />
		
		<liferay-ui:search-container-column-text property="file" />

		<liferay-ui:search-container-column-text property="calendarAttributes" />

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>

<portlet:actionURL name="deleteCalendar" var="deleteCalendarURL" />
<aui:form action="<%=deleteCalendarURL%>" name="<portlet:namespace />fm">

	<aui:model-context bean="<%=calendarVar%>"
		model="<%=Calendar.class%>" />

	<aui:fieldset>

		<aui:input name="calendarId" type="clear"/>

	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit" value="delete"/>

	</aui:button-row>
</aui:form>