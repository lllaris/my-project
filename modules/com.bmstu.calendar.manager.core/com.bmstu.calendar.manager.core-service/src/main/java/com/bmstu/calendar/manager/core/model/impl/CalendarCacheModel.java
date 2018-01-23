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

package com.bmstu.calendar.manager.core.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.bmstu.calendar.manager.core.model.Calendar;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Calendar in entity cache.
 *
 * @author Salbieva
 * @see Calendar
 * @generated
 */
@ProviderType
public class CalendarCacheModel implements CacheModel<Calendar>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CalendarCacheModel)) {
			return false;
		}

		CalendarCacheModel calendarCacheModel = (CalendarCacheModel)obj;

		if (calendarId == calendarCacheModel.calendarId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, calendarId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", calendarId=");
		sb.append(calendarId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", file=");
		sb.append(file);
		sb.append(", calendarAttributes=");
		sb.append(calendarAttributes);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Calendar toEntityModel() {
		CalendarImpl calendarImpl = new CalendarImpl();

		if (uuid == null) {
			calendarImpl.setUuid(StringPool.BLANK);
		}
		else {
			calendarImpl.setUuid(uuid);
		}

		calendarImpl.setCalendarId(calendarId);
		calendarImpl.setGroupId(groupId);
		calendarImpl.setCompanyId(companyId);
		calendarImpl.setUserId(userId);

		if (userName == null) {
			calendarImpl.setUserName(StringPool.BLANK);
		}
		else {
			calendarImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			calendarImpl.setCreateDate(null);
		}
		else {
			calendarImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			calendarImpl.setModifiedDate(null);
		}
		else {
			calendarImpl.setModifiedDate(new Date(modifiedDate));
		}

		calendarImpl.setStatus(status);
		calendarImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			calendarImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			calendarImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			calendarImpl.setStatusDate(null);
		}
		else {
			calendarImpl.setStatusDate(new Date(statusDate));
		}

		if (name == null) {
			calendarImpl.setName(StringPool.BLANK);
		}
		else {
			calendarImpl.setName(name);
		}

		if (file == null) {
			calendarImpl.setFile(StringPool.BLANK);
		}
		else {
			calendarImpl.setFile(file);
		}

		if (calendarAttributes == null) {
			calendarImpl.setCalendarAttributes(StringPool.BLANK);
		}
		else {
			calendarImpl.setCalendarAttributes(calendarAttributes);
		}

		calendarImpl.resetOriginalValues();

		return calendarImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		calendarId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		name = objectInput.readUTF();
		file = objectInput.readUTF();
		calendarAttributes = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(calendarId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (file == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(file);
		}

		if (calendarAttributes == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(calendarAttributes);
		}
	}

	public String uuid;
	public long calendarId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String name;
	public String file;
	public String calendarAttributes;
}