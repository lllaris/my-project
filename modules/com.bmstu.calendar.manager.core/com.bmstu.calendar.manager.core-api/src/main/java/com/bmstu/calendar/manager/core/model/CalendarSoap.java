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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.bmstu.calendar.manager.core.service.http.CalendarServiceSoap}.
 *
 * @author Salbieva
 * @see com.bmstu.calendar.manager.core.service.http.CalendarServiceSoap
 * @generated
 */
@ProviderType
public class CalendarSoap implements Serializable {
	public static CalendarSoap toSoapModel(Calendar model) {
		CalendarSoap soapModel = new CalendarSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCalendarId(model.getCalendarId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setName(model.getName());
		soapModel.setFile(model.getFile());
		soapModel.setCalendarAttributes(model.getCalendarAttributes());

		return soapModel;
	}

	public static CalendarSoap[] toSoapModels(Calendar[] models) {
		CalendarSoap[] soapModels = new CalendarSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CalendarSoap[][] toSoapModels(Calendar[][] models) {
		CalendarSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CalendarSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CalendarSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CalendarSoap[] toSoapModels(List<Calendar> models) {
		List<CalendarSoap> soapModels = new ArrayList<CalendarSoap>(models.size());

		for (Calendar model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CalendarSoap[soapModels.size()]);
	}

	public CalendarSoap() {
	}

	public long getPrimaryKey() {
		return _calendarId;
	}

	public void setPrimaryKey(long pk) {
		setCalendarId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCalendarId() {
		return _calendarId;
	}

	public void setCalendarId(long calendarId) {
		_calendarId = calendarId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getFile() {
		return _file;
	}

	public void setFile(String file) {
		_file = file;
	}

	public String getCalendarAttributes() {
		return _calendarAttributes;
	}

	public void setCalendarAttributes(String calendarAttributes) {
		_calendarAttributes = calendarAttributes;
	}

	private String _uuid;
	private long _calendarId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private String _name;
	private String _file;
	private String _calendarAttributes;
}