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

package com.bmstu.calendar.manager.core.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.bmstu.calendar.manager.core.model.Calendar;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the calendar service. This utility wraps {@link com.bmstu.calendar.manager.core.service.persistence.impl.CalendarPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Salbieva
 * @see CalendarPersistence
 * @see com.bmstu.calendar.manager.core.service.persistence.impl.CalendarPersistenceImpl
 * @generated
 */
@ProviderType
public class CalendarUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Calendar calendar) {
		getPersistence().clearCache(calendar);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Calendar> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Calendar> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Calendar> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Calendar> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Calendar update(Calendar calendar) {
		return getPersistence().update(calendar);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Calendar update(Calendar calendar,
		ServiceContext serviceContext) {
		return getPersistence().update(calendar, serviceContext);
	}

	/**
	* Returns all the calendars where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching calendars
	*/
	public static List<Calendar> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the calendars where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of calendars
	* @param end the upper bound of the range of calendars (not inclusive)
	* @return the range of matching calendars
	*/
	public static List<Calendar> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the calendars where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of calendars
	* @param end the upper bound of the range of calendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching calendars
	*/
	public static List<Calendar> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Calendar> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the calendars where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of calendars
	* @param end the upper bound of the range of calendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching calendars
	*/
	public static List<Calendar> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Calendar> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first calendar in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching calendar
	* @throws NoSuchCalendarException if a matching calendar could not be found
	*/
	public static Calendar findByUuid_First(java.lang.String uuid,
		OrderByComparator<Calendar> orderByComparator)
		throws com.bmstu.calendar.manager.core.exception.NoSuchCalendarException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first calendar in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching calendar, or <code>null</code> if a matching calendar could not be found
	*/
	public static Calendar fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Calendar> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last calendar in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching calendar
	* @throws NoSuchCalendarException if a matching calendar could not be found
	*/
	public static Calendar findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Calendar> orderByComparator)
		throws com.bmstu.calendar.manager.core.exception.NoSuchCalendarException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last calendar in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching calendar, or <code>null</code> if a matching calendar could not be found
	*/
	public static Calendar fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Calendar> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the calendars before and after the current calendar in the ordered set where uuid = &#63;.
	*
	* @param calendarId the primary key of the current calendar
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next calendar
	* @throws NoSuchCalendarException if a calendar with the primary key could not be found
	*/
	public static Calendar[] findByUuid_PrevAndNext(long calendarId,
		java.lang.String uuid, OrderByComparator<Calendar> orderByComparator)
		throws com.bmstu.calendar.manager.core.exception.NoSuchCalendarException {
		return getPersistence()
				   .findByUuid_PrevAndNext(calendarId, uuid, orderByComparator);
	}

	/**
	* Removes all the calendars where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of calendars where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching calendars
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the calendar where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCalendarException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching calendar
	* @throws NoSuchCalendarException if a matching calendar could not be found
	*/
	public static Calendar findByUUID_G(java.lang.String uuid, long groupId)
		throws com.bmstu.calendar.manager.core.exception.NoSuchCalendarException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the calendar where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching calendar, or <code>null</code> if a matching calendar could not be found
	*/
	public static Calendar fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the calendar where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching calendar, or <code>null</code> if a matching calendar could not be found
	*/
	public static Calendar fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the calendar where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the calendar that was removed
	*/
	public static Calendar removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.bmstu.calendar.manager.core.exception.NoSuchCalendarException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of calendars where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching calendars
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the calendars where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching calendars
	*/
	public static List<Calendar> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the calendars where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of calendars
	* @param end the upper bound of the range of calendars (not inclusive)
	* @return the range of matching calendars
	*/
	public static List<Calendar> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the calendars where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of calendars
	* @param end the upper bound of the range of calendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching calendars
	*/
	public static List<Calendar> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Calendar> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the calendars where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of calendars
	* @param end the upper bound of the range of calendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching calendars
	*/
	public static List<Calendar> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Calendar> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first calendar in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching calendar
	* @throws NoSuchCalendarException if a matching calendar could not be found
	*/
	public static Calendar findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Calendar> orderByComparator)
		throws com.bmstu.calendar.manager.core.exception.NoSuchCalendarException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first calendar in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching calendar, or <code>null</code> if a matching calendar could not be found
	*/
	public static Calendar fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Calendar> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last calendar in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching calendar
	* @throws NoSuchCalendarException if a matching calendar could not be found
	*/
	public static Calendar findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Calendar> orderByComparator)
		throws com.bmstu.calendar.manager.core.exception.NoSuchCalendarException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last calendar in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching calendar, or <code>null</code> if a matching calendar could not be found
	*/
	public static Calendar fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Calendar> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the calendars before and after the current calendar in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param calendarId the primary key of the current calendar
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next calendar
	* @throws NoSuchCalendarException if a calendar with the primary key could not be found
	*/
	public static Calendar[] findByUuid_C_PrevAndNext(long calendarId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Calendar> orderByComparator)
		throws com.bmstu.calendar.manager.core.exception.NoSuchCalendarException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(calendarId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the calendars where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of calendars where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching calendars
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the calendars where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching calendars
	*/
	public static List<Calendar> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the calendars where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of calendars
	* @param end the upper bound of the range of calendars (not inclusive)
	* @return the range of matching calendars
	*/
	public static List<Calendar> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the calendars where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of calendars
	* @param end the upper bound of the range of calendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching calendars
	*/
	public static List<Calendar> findByGroupId(long groupId, int start,
		int end, OrderByComparator<Calendar> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the calendars where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of calendars
	* @param end the upper bound of the range of calendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching calendars
	*/
	public static List<Calendar> findByGroupId(long groupId, int start,
		int end, OrderByComparator<Calendar> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first calendar in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching calendar
	* @throws NoSuchCalendarException if a matching calendar could not be found
	*/
	public static Calendar findByGroupId_First(long groupId,
		OrderByComparator<Calendar> orderByComparator)
		throws com.bmstu.calendar.manager.core.exception.NoSuchCalendarException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first calendar in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching calendar, or <code>null</code> if a matching calendar could not be found
	*/
	public static Calendar fetchByGroupId_First(long groupId,
		OrderByComparator<Calendar> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last calendar in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching calendar
	* @throws NoSuchCalendarException if a matching calendar could not be found
	*/
	public static Calendar findByGroupId_Last(long groupId,
		OrderByComparator<Calendar> orderByComparator)
		throws com.bmstu.calendar.manager.core.exception.NoSuchCalendarException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last calendar in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching calendar, or <code>null</code> if a matching calendar could not be found
	*/
	public static Calendar fetchByGroupId_Last(long groupId,
		OrderByComparator<Calendar> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the calendars before and after the current calendar in the ordered set where groupId = &#63;.
	*
	* @param calendarId the primary key of the current calendar
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next calendar
	* @throws NoSuchCalendarException if a calendar with the primary key could not be found
	*/
	public static Calendar[] findByGroupId_PrevAndNext(long calendarId,
		long groupId, OrderByComparator<Calendar> orderByComparator)
		throws com.bmstu.calendar.manager.core.exception.NoSuchCalendarException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(calendarId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the calendars where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of calendars where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching calendars
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the calendars where calendarId = &#63;.
	*
	* @param calendarId the calendar ID
	* @return the matching calendars
	*/
	public static List<Calendar> findByCalendarId(long calendarId) {
		return getPersistence().findByCalendarId(calendarId);
	}

	/**
	* Returns a range of all the calendars where calendarId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param calendarId the calendar ID
	* @param start the lower bound of the range of calendars
	* @param end the upper bound of the range of calendars (not inclusive)
	* @return the range of matching calendars
	*/
	public static List<Calendar> findByCalendarId(long calendarId, int start,
		int end) {
		return getPersistence().findByCalendarId(calendarId, start, end);
	}

	/**
	* Returns an ordered range of all the calendars where calendarId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param calendarId the calendar ID
	* @param start the lower bound of the range of calendars
	* @param end the upper bound of the range of calendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching calendars
	*/
	public static List<Calendar> findByCalendarId(long calendarId, int start,
		int end, OrderByComparator<Calendar> orderByComparator) {
		return getPersistence()
				   .findByCalendarId(calendarId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the calendars where calendarId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param calendarId the calendar ID
	* @param start the lower bound of the range of calendars
	* @param end the upper bound of the range of calendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching calendars
	*/
	public static List<Calendar> findByCalendarId(long calendarId, int start,
		int end, OrderByComparator<Calendar> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCalendarId(calendarId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first calendar in the ordered set where calendarId = &#63;.
	*
	* @param calendarId the calendar ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching calendar
	* @throws NoSuchCalendarException if a matching calendar could not be found
	*/
	public static Calendar findByCalendarId_First(long calendarId,
		OrderByComparator<Calendar> orderByComparator)
		throws com.bmstu.calendar.manager.core.exception.NoSuchCalendarException {
		return getPersistence()
				   .findByCalendarId_First(calendarId, orderByComparator);
	}

	/**
	* Returns the first calendar in the ordered set where calendarId = &#63;.
	*
	* @param calendarId the calendar ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching calendar, or <code>null</code> if a matching calendar could not be found
	*/
	public static Calendar fetchByCalendarId_First(long calendarId,
		OrderByComparator<Calendar> orderByComparator) {
		return getPersistence()
				   .fetchByCalendarId_First(calendarId, orderByComparator);
	}

	/**
	* Returns the last calendar in the ordered set where calendarId = &#63;.
	*
	* @param calendarId the calendar ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching calendar
	* @throws NoSuchCalendarException if a matching calendar could not be found
	*/
	public static Calendar findByCalendarId_Last(long calendarId,
		OrderByComparator<Calendar> orderByComparator)
		throws com.bmstu.calendar.manager.core.exception.NoSuchCalendarException {
		return getPersistence()
				   .findByCalendarId_Last(calendarId, orderByComparator);
	}

	/**
	* Returns the last calendar in the ordered set where calendarId = &#63;.
	*
	* @param calendarId the calendar ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching calendar, or <code>null</code> if a matching calendar could not be found
	*/
	public static Calendar fetchByCalendarId_Last(long calendarId,
		OrderByComparator<Calendar> orderByComparator) {
		return getPersistence()
				   .fetchByCalendarId_Last(calendarId, orderByComparator);
	}

	/**
	* Removes all the calendars where calendarId = &#63; from the database.
	*
	* @param calendarId the calendar ID
	*/
	public static void removeByCalendarId(long calendarId) {
		getPersistence().removeByCalendarId(calendarId);
	}

	/**
	* Returns the number of calendars where calendarId = &#63;.
	*
	* @param calendarId the calendar ID
	* @return the number of matching calendars
	*/
	public static int countByCalendarId(long calendarId) {
		return getPersistence().countByCalendarId(calendarId);
	}

	/**
	* Caches the calendar in the entity cache if it is enabled.
	*
	* @param calendar the calendar
	*/
	public static void cacheResult(Calendar calendar) {
		getPersistence().cacheResult(calendar);
	}

	/**
	* Caches the calendars in the entity cache if it is enabled.
	*
	* @param calendars the calendars
	*/
	public static void cacheResult(List<Calendar> calendars) {
		getPersistence().cacheResult(calendars);
	}

	/**
	* Creates a new calendar with the primary key. Does not add the calendar to the database.
	*
	* @param calendarId the primary key for the new calendar
	* @return the new calendar
	*/
	public static Calendar create(long calendarId) {
		return getPersistence().create(calendarId);
	}

	/**
	* Removes the calendar with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param calendarId the primary key of the calendar
	* @return the calendar that was removed
	* @throws NoSuchCalendarException if a calendar with the primary key could not be found
	*/
	public static Calendar remove(long calendarId)
		throws com.bmstu.calendar.manager.core.exception.NoSuchCalendarException {
		return getPersistence().remove(calendarId);
	}

	public static Calendar updateImpl(Calendar calendar) {
		return getPersistence().updateImpl(calendar);
	}

	/**
	* Returns the calendar with the primary key or throws a {@link NoSuchCalendarException} if it could not be found.
	*
	* @param calendarId the primary key of the calendar
	* @return the calendar
	* @throws NoSuchCalendarException if a calendar with the primary key could not be found
	*/
	public static Calendar findByPrimaryKey(long calendarId)
		throws com.bmstu.calendar.manager.core.exception.NoSuchCalendarException {
		return getPersistence().findByPrimaryKey(calendarId);
	}

	/**
	* Returns the calendar with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param calendarId the primary key of the calendar
	* @return the calendar, or <code>null</code> if a calendar with the primary key could not be found
	*/
	public static Calendar fetchByPrimaryKey(long calendarId) {
		return getPersistence().fetchByPrimaryKey(calendarId);
	}

	public static java.util.Map<java.io.Serializable, Calendar> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the calendars.
	*
	* @return the calendars
	*/
	public static List<Calendar> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the calendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of calendars
	* @param end the upper bound of the range of calendars (not inclusive)
	* @return the range of calendars
	*/
	public static List<Calendar> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the calendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of calendars
	* @param end the upper bound of the range of calendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of calendars
	*/
	public static List<Calendar> findAll(int start, int end,
		OrderByComparator<Calendar> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the calendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of calendars
	* @param end the upper bound of the range of calendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of calendars
	*/
	public static List<Calendar> findAll(int start, int end,
		OrderByComparator<Calendar> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the calendars from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of calendars.
	*
	* @return the number of calendars
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CalendarPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CalendarPersistence, CalendarPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CalendarPersistence.class);
}