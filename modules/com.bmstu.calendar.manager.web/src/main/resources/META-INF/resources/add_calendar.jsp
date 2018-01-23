<%@include file="/init.jsp"%>

<%
	Calendar calendar = null;
%>

<portlet:renderURL var="viewURL">

	<portlet:param name="mvcPath" value="/view.jsp" />

</portlet:renderURL>

<portlet:actionURL name="addCalendar" var="addCalendarURL" />

<aui:form action="<%=addCalendarURL%>" name="<portlet:namespace />fm">

	<aui:model-context bean="<%=calendar%>"
		model="<%=Calendar.class%>" />

	<aui:fieldset>

		<aui:input name="name" />
		<aui:input name="file" />
		<aui:input name="calendarAttributes" />

	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit" />
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>" />

	</aui:button-row>
</aui:form>