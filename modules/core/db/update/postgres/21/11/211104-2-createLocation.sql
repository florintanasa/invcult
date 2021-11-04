alter table INVCULT_LOCATION add constraint FK_INVCULT_LOCATION_ON_ID_FARMERS foreign key (ID_FARMERS_ID) references INVCULT_FARMERS(ID);
alter table INVCULT_LOCATION add constraint FK_INVCULT_LOCATION_ON_ID_LOCALIRYSIRUTA foreign key (ID_LOCALIRYSIRUTA_ID) references INVCULT_LOCALITYSIRUTA(ID);
alter table INVCULT_LOCATION add constraint FK_INVCULT_LOCATION_ON_ID_ROADTYPE foreign key (ID_ROADTYPE_ID) references INVCULT_ROADTYPE(ID);
alter table INVCULT_LOCATION add constraint FK_INVCULT_LOCATION_ON_ID_STREET foreign key (ID_STREET_ID) references INVCULT_STREET(ID);
create index IDX_INVCULT_LOCATION_ON_ID_FARMERS on INVCULT_LOCATION (ID_FARMERS_ID);
create index IDX_INVCULT_LOCATION_ON_ID_LOCALIRYSIRUTA on INVCULT_LOCATION (ID_LOCALIRYSIRUTA_ID);
create index IDX_INVCULT_LOCATION_ON_ID_ROADTYPE on INVCULT_LOCATION (ID_ROADTYPE_ID);
create index IDX_INVCULT_LOCATION_ON_ID_STREET on INVCULT_LOCATION (ID_STREET_ID);
