create table CM_Calendar (
	uuid_ VARCHAR(75) null,
	calendarId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	name VARCHAR(75) null,
	file VARCHAR(75) null,
	calendarAttributes VARCHAR(75) null
);