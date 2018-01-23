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

package com.bmstu.calendar.manager.core.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Calendar}.
 * </p>
 *
 * @author Salbieva
 * @see Calendar
 * @generated
 */
@ProviderType
public class CalendarWrapper implements Calendar, ModelWrapper<Calendar> {
	public CalendarWrapper(Calendar calendar) {
		_calendar = calendar;
	}

	@Override
	public Class<?> getModelClass() {
		return Calendar.class;
	}

	@Override
	public String getModelClassName() {
		return Calendar.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("calendarId", getCalendarId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("name", getName());
		attributes.put("file", getFile());
		attributes.put("calendarAttributes", getCalendarAttributes());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long calendarId = (Long)attributes.get("calendarId");

		if (calendarId != null) {
			setCalendarId(calendarId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String file = (String)attributes.get("file");

		if (file != null) {
			setFile(file);
		}

		String calendarAttributes = (String)attributes.get("calendarAttributes");

		if (calendarAttributes != null) {
			setCalendarAttributes(calendarAttributes);
		}
	}

	@Override
	public Calendar toEscapedModel() {
		return new CalendarWrapper(_calendar.toEscapedModel());
	}

	@Override
	public Calendar toUnescapedModel() {
		return new CalendarWrapper(_calendar.toUnescapedModel());
	}

	/**
	* Returns <code>true</code> if this calendar is approved.
	*
	* @return <code>true</code> if this calendar is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _calendar.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _calendar.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this calendar is denied.
	*
	* @return <code>true</code> if this calendar is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _calendar.isDenied();
	}

	/**
	* Returns <code>true</code> if this calendar is a draft.
	*
	* @return <code>true</code> if this calendar is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _calendar.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _calendar.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this calendar is expired.
	*
	* @return <code>true</code> if this calendar is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _calendar.isExpired();
	}

	/**
	* Returns <code>true</code> if this calendar is inactive.
	*
	* @return <code>true</code> if this calendar is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _calendar.isInactive();
	}

	/**
	* Returns <code>true</code> if this calendar is incomplete.
	*
	* @return <code>true</code> if this calendar is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _calendar.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _calendar.isNew();
	}

	/**
	* Returns <code>true</code> if this calendar is pending.
	*
	* @return <code>true</code> if this calendar is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _calendar.isPending();
	}

	/**
	* Returns <code>true</code> if this calendar is scheduled.
	*
	* @return <code>true</code> if this calendar is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _calendar.isScheduled();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _calendar.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Calendar> toCacheModel() {
		return _calendar.toCacheModel();
	}

	@Override
	public int compareTo(Calendar calendar) {
		return _calendar.compareTo(calendar);
	}

	/**
	* Returns the status of this calendar.
	*
	* @return the status of this calendar
	*/
	@Override
	public int getStatus() {
		return _calendar.getStatus();
	}

	@Override
	public int hashCode() {
		return _calendar.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _calendar.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CalendarWrapper((Calendar)_calendar.clone());
	}

	/**
	* Returns the calendar attributes of this calendar.
	*
	* @return the calendar attributes of this calendar
	*/
	@Override
	public java.lang.String getCalendarAttributes() {
		return _calendar.getCalendarAttributes();
	}

	/**
	* Returns the file of this calendar.
	*
	* @return the file of this calendar
	*/
	@Override
	public java.lang.String getFile() {
		return _calendar.getFile();
	}

	/**
	* Returns the name of this calendar.
	*
	* @return the name of this calendar
	*/
	@Override
	public java.lang.String getName() {
		return _calendar.getName();
	}

	/**
	* Returns the status by user name of this calendar.
	*
	* @return the status by user name of this calendar
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _calendar.getStatusByUserName();
	}

	/**
	* Returns the status by user uuid of this calendar.
	*
	* @return the status by user uuid of this calendar
	*/
	@Override
	public java.lang.String getStatusByUserUuid() {
		return _calendar.getStatusByUserUuid();
	}

	/**
	* Returns the user name of this calendar.
	*
	* @return the user name of this calendar
	*/
	@Override
	public java.lang.String getUserName() {
		return _calendar.getUserName();
	}

	/**
	* Returns the user uuid of this calendar.
	*
	* @return the user uuid of this calendar
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _calendar.getUserUuid();
	}

	/**
	* Returns the uuid of this calendar.
	*
	* @return the uuid of this calendar
	*/
	@Override
	public java.lang.String getUuid() {
		return _calendar.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _calendar.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _calendar.toXmlString();
	}

	/**
	* Returns the create date of this calendar.
	*
	* @return the create date of this calendar
	*/
	@Override
	public Date getCreateDate() {
		return _calendar.getCreateDate();
	}

	/**
	* Returns the modified date of this calendar.
	*
	* @return the modified date of this calendar
	*/
	@Override
	public Date getModifiedDate() {
		return _calendar.getModifiedDate();
	}

	/**
	* Returns the status date of this calendar.
	*
	* @return the status date of this calendar
	*/
	@Override
	public Date getStatusDate() {
		return _calendar.getStatusDate();
	}

	/**
	* Returns the calendar ID of this calendar.
	*
	* @return the calendar ID of this calendar
	*/
	@Override
	public long getCalendarId() {
		return _calendar.getCalendarId();
	}

	/**
	* Returns the company ID of this calendar.
	*
	* @return the company ID of this calendar
	*/
	@Override
	public long getCompanyId() {
		return _calendar.getCompanyId();
	}

	/**
	* Returns the group ID of this calendar.
	*
	* @return the group ID of this calendar
	*/
	@Override
	public long getGroupId() {
		return _calendar.getGroupId();
	}

	/**
	* Returns the primary key of this calendar.
	*
	* @return the primary key of this calendar
	*/
	@Override
	public long getPrimaryKey() {
		return _calendar.getPrimaryKey();
	}

	/**
	* Returns the status by user ID of this calendar.
	*
	* @return the status by user ID of this calendar
	*/
	@Override
	public long getStatusByUserId() {
		return _calendar.getStatusByUserId();
	}

	/**
	* Returns the user ID of this calendar.
	*
	* @return the user ID of this calendar
	*/
	@Override
	public long getUserId() {
		return _calendar.getUserId();
	}

	@Override
	public void persist() {
		_calendar.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_calendar.setCachedModel(cachedModel);
	}

	/**
	* Sets the calendar attributes of this calendar.
	*
	* @param calendarAttributes the calendar attributes of this calendar
	*/
	@Override
	public void setCalendarAttributes(java.lang.String calendarAttributes) {
		_calendar.setCalendarAttributes(calendarAttributes);
	}

	/**
	* Sets the calendar ID of this calendar.
	*
	* @param calendarId the calendar ID of this calendar
	*/
	@Override
	public void setCalendarId(long calendarId) {
		_calendar.setCalendarId(calendarId);
	}

	/**
	* Sets the company ID of this calendar.
	*
	* @param companyId the company ID of this calendar
	*/
	@Override
	public void setCompanyId(long companyId) {
		_calendar.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this calendar.
	*
	* @param createDate the create date of this calendar
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_calendar.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_calendar.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_calendar.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_calendar.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the file of this calendar.
	*
	* @param file the file of this calendar
	*/
	@Override
	public void setFile(java.lang.String file) {
		_calendar.setFile(file);
	}

	/**
	* Sets the group ID of this calendar.
	*
	* @param groupId the group ID of this calendar
	*/
	@Override
	public void setGroupId(long groupId) {
		_calendar.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this calendar.
	*
	* @param modifiedDate the modified date of this calendar
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_calendar.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this calendar.
	*
	* @param name the name of this calendar
	*/
	@Override
	public void setName(java.lang.String name) {
		_calendar.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_calendar.setNew(n);
	}

	/**
	* Sets the primary key of this calendar.
	*
	* @param primaryKey the primary key of this calendar
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_calendar.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_calendar.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this calendar.
	*
	* @param status the status of this calendar
	*/
	@Override
	public void setStatus(int status) {
		_calendar.setStatus(status);
	}

	/**
	* Sets the status by user ID of this calendar.
	*
	* @param statusByUserId the status by user ID of this calendar
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_calendar.setStatusByUserId(statusByUserId);
	}

	/**
	* Sets the status by user name of this calendar.
	*
	* @param statusByUserName the status by user name of this calendar
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_calendar.setStatusByUserName(statusByUserName);
	}

	/**
	* Sets the status by user uuid of this calendar.
	*
	* @param statusByUserUuid the status by user uuid of this calendar
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_calendar.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Sets the status date of this calendar.
	*
	* @param statusDate the status date of this calendar
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_calendar.setStatusDate(statusDate);
	}

	/**
	* Sets the user ID of this calendar.
	*
	* @param userId the user ID of this calendar
	*/
	@Override
	public void setUserId(long userId) {
		_calendar.setUserId(userId);
	}

	/**
	* Sets the user name of this calendar.
	*
	* @param userName the user name of this calendar
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_calendar.setUserName(userName);
	}

	/**
	* Sets the user uuid of this calendar.
	*
	* @param userUuid the user uuid of this calendar
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_calendar.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this calendar.
	*
	* @param uuid the uuid of this calendar
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_calendar.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CalendarWrapper)) {
			return false;
		}

		CalendarWrapper calendarWrapper = (CalendarWrapper)obj;

		if (Objects.equals(_calendar, calendarWrapper._calendar)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _calendar.getStagedModelType();
	}

	@Override
	public Calendar getWrappedModel() {
		return _calendar;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _calendar.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _calendar.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_calendar.resetOriginalValues();
	}

	private final Calendar _calendar;
}