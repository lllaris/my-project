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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CalendarLocalService}.
 *
 * @author Salbieva
 * @see CalendarLocalService
 * @generated
 */
@ProviderType
public class CalendarLocalServiceWrapper implements CalendarLocalService,
	ServiceWrapper<CalendarLocalService> {
	public CalendarLocalServiceWrapper(
		CalendarLocalService calendarLocalService) {
		_calendarLocalService = calendarLocalService;
	}

	/**
	* Adds the calendar to the database. Also notifies the appropriate model listeners.
	*
	* @param calendar the calendar
	* @return the calendar that was added
	*/
	@Override
	public com.bmstu.calendar.manager.core.model.Calendar addCalendar(
		com.bmstu.calendar.manager.core.model.Calendar calendar) {
		return _calendarLocalService.addCalendar(calendar);
	}

	@Override
	public com.bmstu.calendar.manager.core.model.Calendar addCalendar(
		long userId, java.lang.String name, java.lang.String file,
		java.lang.String calendarAttributes,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _calendarLocalService.addCalendar(userId, name, file,
			calendarAttributes, serviceContext);
	}

	/**
	* Creates a new calendar with the primary key. Does not add the calendar to the database.
	*
	* @param calendarId the primary key for the new calendar
	* @return the new calendar
	*/
	@Override
	public com.bmstu.calendar.manager.core.model.Calendar createCalendar(
		long calendarId) {
		return _calendarLocalService.createCalendar(calendarId);
	}

	/**
	* Deletes the calendar from the database. Also notifies the appropriate model listeners.
	*
	* @param calendar the calendar
	* @return the calendar that was removed
	*/
	@Override
	public com.bmstu.calendar.manager.core.model.Calendar deleteCalendar(
		com.bmstu.calendar.manager.core.model.Calendar calendar) {
		return _calendarLocalService.deleteCalendar(calendar);
	}

	/**
	* Deletes the calendar with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param calendarId the primary key of the calendar
	* @return the calendar that was removed
	* @throws PortalException if a calendar with the primary key could not be found
	*/
	@Override
	public com.bmstu.calendar.manager.core.model.Calendar deleteCalendar(
		long calendarId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _calendarLocalService.deleteCalendar(calendarId);
	}

	@Override
	public com.bmstu.calendar.manager.core.model.Calendar fetchCalendar(
		long calendarId) {
		return _calendarLocalService.fetchCalendar(calendarId);
	}

	/**
	* Returns the calendar matching the UUID and group.
	*
	* @param uuid the calendar's UUID
	* @param groupId the primary key of the group
	* @return the matching calendar, or <code>null</code> if a matching calendar could not be found
	*/
	@Override
	public com.bmstu.calendar.manager.core.model.Calendar fetchCalendarByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _calendarLocalService.fetchCalendarByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the calendar with the primary key.
	*
	* @param calendarId the primary key of the calendar
	* @return the calendar
	* @throws PortalException if a calendar with the primary key could not be found
	*/
	@Override
	public com.bmstu.calendar.manager.core.model.Calendar getCalendar(
		long calendarId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _calendarLocalService.getCalendar(calendarId);
	}

	/**
	* Returns the calendar matching the UUID and group.
	*
	* @param uuid the calendar's UUID
	* @param groupId the primary key of the group
	* @return the matching calendar
	* @throws PortalException if a matching calendar could not be found
	*/
	@Override
	public com.bmstu.calendar.manager.core.model.Calendar getCalendarByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _calendarLocalService.getCalendarByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the calendar in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param calendar the calendar
	* @return the calendar that was updated
	*/
	@Override
	public com.bmstu.calendar.manager.core.model.Calendar updateCalendar(
		com.bmstu.calendar.manager.core.model.Calendar calendar) {
		return _calendarLocalService.updateCalendar(calendar);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _calendarLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _calendarLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _calendarLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _calendarLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _calendarLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _calendarLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of calendars.
	*
	* @return the number of calendars
	*/
	@Override
	public int getCalendarsCount() {
		return _calendarLocalService.getCalendarsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _calendarLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _calendarLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _calendarLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _calendarLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
	@Override
	public java.util.List<com.bmstu.calendar.manager.core.model.Calendar> getCalendars(
		int start, int end) {
		return _calendarLocalService.getCalendars(start, end);
	}

	@Override
	public java.util.List<com.bmstu.calendar.manager.core.model.Calendar> getCalendars(
		long groupId, int start, int end) {
		return _calendarLocalService.getCalendars(groupId, start, end);
	}

	/**
	* Returns all the calendars matching the UUID and company.
	*
	* @param uuid the UUID of the calendars
	* @param companyId the primary key of the company
	* @return the matching calendars, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.bmstu.calendar.manager.core.model.Calendar> getCalendarsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _calendarLocalService.getCalendarsByUuidAndCompanyId(uuid,
			companyId);
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
	@Override
	public java.util.List<com.bmstu.calendar.manager.core.model.Calendar> getCalendarsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.bmstu.calendar.manager.core.model.Calendar> orderByComparator) {
		return _calendarLocalService.getCalendarsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _calendarLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _calendarLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public CalendarLocalService getWrappedService() {
		return _calendarLocalService;
	}

	@Override
	public void setWrappedService(CalendarLocalService calendarLocalService) {
		_calendarLocalService = calendarLocalService;
	}

	private CalendarLocalService _calendarLocalService;
}