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

package com.bmstu.calendar.manager.core.service.impl;

import java.util.Date;
import java.util.List;

import com.bmstu.calendar.manager.core.model.Calendar;
import com.bmstu.calendar.manager.core.service.base.CalendarLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

/**
 * The implementation of the calendar local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.bmstu.calendar.manager.core.service.CalendarLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Salbieva
 * @see CalendarLocalServiceBaseImpl
 * @see com.bmstu.calendar.manager.core.service.CalendarLocalServiceUtil
 */
public class CalendarLocalServiceImpl extends CalendarLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.bmstu.calendar.manager.core.service.CalendarLocalServiceUtil} to access the calendar local service.
	 */
	
	@Override
	public Calendar addCalendar(long userId, String name, String file, String calendarAttributes, ServiceContext serviceContext) throws PortalException {
		verifyFileName(file);
		
		String finalName = nullToEmpty(name);
		String finalCalendarAttributes = nullToEmpty(calendarAttributes);

		long groupId = serviceContext.getScopeGroupId();
		User user = userLocalService.getUserById(userId);
		Date currentDate = new Date();

		Calendar calendar = calendarPersistence.create(counterLocalService.increment());

		calendar.setUuid(serviceContext.getUuid());
		calendar.setUserId(userId);
		calendar.setGroupId(groupId);
		calendar.setCompanyId(user.getCompanyId());
		calendar.setUserName(user.getFullName());
		calendar.setCreateDate(serviceContext.getCreateDate(currentDate));
		calendar.setModifiedDate(serviceContext.getModifiedDate(currentDate));
		calendar.setName(finalName);
		calendar.setFile(file);
		calendar.setCalendarAttributes(finalCalendarAttributes);
		calendar.setExpandoBridgeAttributes(serviceContext);

		calendarPersistence.update(calendar);
		
		return calendar;
	}
	
	@Override
	public List<Calendar> getCalendars(long groupId, int start, int end) {

		return calendarPersistence.findByGroupId(groupId, start, end);
	}

	@Override
	public int getCalendarsCount() {
		return calendarPersistence.countAll();
	}

	private void verifyFileName(String file) {
		if (file == null || file.isEmpty())
		{
			throw new IllegalArgumentException("File can't be null");
		}
	}

	private String nullToEmpty(String string) {
		return string == null ? "" : string;
	}

}