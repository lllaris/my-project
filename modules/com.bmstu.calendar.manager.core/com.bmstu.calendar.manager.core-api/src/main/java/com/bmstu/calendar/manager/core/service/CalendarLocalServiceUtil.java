/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.bmstu.calendar.manager.core.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Calendar. This utility wraps
 * {@link com.bmstu.calendar.manager.core.service.impl.CalendarLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Salbieva
 * @see CalendarLocalService
 * @see com.bmstu.calendar.manager.core.service.base.CalendarLocalServiceBaseImpl
 * @see com.bmstu.calendar.manager.core.service.impl.CalendarLocalServiceImpl
 * @generated
 */
@ProviderType
public class CalendarLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.bmstu.calendar.manager.core.service.impl.CalendarLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the calendar to the database. Also notifies the appropriate model listeners.
	*
	* @param calendar the calendar
	* @return the calendar that was added
	*/
	public static com.bmstu.calendar.manager.core.model.Calendar addCalendar(
		com.bmstu.calendar.manager.core.model.Calendar calendar) {
		return getService().addCalendar(calendar);
	}

	public static com.bmstu.calendar.manager.core.model.Calendar addCalendar(
		long userId, java.lang.String name, java.lang.String file,
		java.lang.String calendarAttributes,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .addCalendar(userId, name, file, calendarAttributes,
			serviceContext);
	}

	/**
	* Creates a new calendar with the primary key. Does not add the calendar to the database.
	*
	* @param calendarId the primary key for the new calendar
	* @return the new calendar
	*/
	public static com.bmstu.calendar.manager.core.model.Calendar createCalendar(
		long calendarId) {
		return getService().createCalendar(calendarId);
	}

	/**
	* Deletes the calendar from the database. Also notifies the appropriate model listeners.
	*
	* @param calendar the calendar
	* @return the calendar that was removed
	*/
	public static com.bmstu.calendar.manager.core.model.Calendar deleteCalendar(
		com.bmstu.calendar.manager.core.model.Calendar calendar) {
		return getService().deleteCalendar(calendar);
	}

	/**
	* Deletes the calendar with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param calendarId the primary key of the calendar
	* @return the calendar that was removed
	* @throws PortalException if a calendar with the primary key could not be found
	*/
	public static com.bmstu.calendar.manager.core.model.Calendar deleteCalendar(
		long calendarId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCalendar(calendarId);
	}

	public static com.bmstu.calendar.manager.core.model.Calendar fetchCalendar(
		long calendarId) {
		return getService().fetchCalendar(calendarId);
	}

	/**
	* Returns the calendar matching the UUID and group.
	*
	* @param uuid the calendar's UUID
	* @param groupId the primary key of the group
	* @return the matching calendar, or <code>null</code> if a matching calendar could not be found
	*/
	public static com.bmstu.calendar.manager.core.model.Calendar fetchCalendarByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchCalendarByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the calendar with the primary key.
	*
	* @param calendarId the primary key of the calendar
	* @return the calendar
	* @throws PortalException if a calendar with the primary key could not be found
	*/
	public static com.bmstu.calendar.manager.core.model.Calendar getCalendar(
		long calendarId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCalendar(calendarId);
	}

	/**
	* Returns the calendar matching the UUID and group.
	*
	* @param uuid the calendar's UUID
	* @param groupId the primary key of the group
	* @return the matching calendar
	* @throws PortalException if a matching calendar could not be found
	*/
	public static com.bmstu.calendar.manager.core.model.Calendar getCalendarByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCalendarByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the calendar in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param calendar the calendar
	* @return the calendar that was updated
	*/
	public static com.bmstu.calendar.manager.core.model.Calendar updateCalendar(
		com.bmstu.calendar.manager.core.model.Calendar calendar) {
		return getService().updateCalendar(calendar);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of calendars.
	*
	* @return the number of calendars
	*/
	public static int getCalendarsCount() {
		return getService().getCalendarsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmstu.calendar.manager.core.model.impl.CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmstu.calendar.manager.core.model.impl.CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the calendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmstu.calendar.manager.core.model.impl.CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of calendars
	* @param end the upper bound of the range of calendars (not inclusive)
	* @return the range of calendars
	*/
	public static java.util.List<com.bmstu.calendar.manager.core.model.Calendar> getCalendars(
		int start, int end) {
		return getService().getCalendars(start, end);
	}

	public static java.util.List<com.bmstu.calendar.manager.core.model.Calendar> getCalendars(
		long groupId, int start, int end) {
		return getService().getCalendars(groupId, start, end);
	}

	/**
	* Returns all the calendars matching the UUID and company.
	*
	* @param uuid the UUID of the calendars
	* @param companyId the primary key of the company
	* @return the matching calendars, or an empty list if no matches were found
	*/
	public static java.util.List<com.bmstu.calendar.manager.core.model.Calendar> getCalendarsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getCalendarsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of calendars matching the UUID and company.
	*
	* @param uuid the UUID of the calendars
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of calendars
	* @param end the upper bound of the range of calendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching calendars, or an empty list if no matches were found
	*/
	public static java.util.List<com.bmstu.calendar.manager.core.model.Calendar> getCalendarsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.bmstu.calendar.manager.core.model.Calendar> orderByComparator) {
		return getService()
				   .getCalendarsByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static CalendarLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CalendarLocalService, CalendarLocalService> _serviceTracker =
		ServiceTrackerFactory.open(CalendarLocalService.class);
}