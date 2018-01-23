create index IX_A5243246 on CM_Calendar (calendarId);
create index IX_5C768631 on CM_Calendar (groupId);
create index IX_98E7384D on CM_Calendar (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_878B6E0F on CM_Calendar (uuid_[$COLUMN_LENGTH:75$], groupId);