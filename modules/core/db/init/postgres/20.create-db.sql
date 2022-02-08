-- begin INVCULT_ZONESIRUTA
create unique index IDX_INVCULT_ZONESIRUTA_UK_ZONENUMBER on INVCULT_ZONESIRUTA (ZONENUMBER) where DELETE_TS is null ^
create unique index IDX_INVCULT_ZONESIRUTA_UK_ZONENAME on INVCULT_ZONESIRUTA (ZONENAME) where DELETE_TS is null ^
create unique index IDX_INVCULT_ZONESIRUTA_UK_SIRUTA on INVCULT_ZONESIRUTA (SIRUTA) where DELETE_TS is null ^
-- end INVCULT_ZONESIRUTA
-- begin INVCULT_LOCALITYSIRUTA
alter table INVCULT_LOCALITYSIRUTA add constraint FK_INVCULT_LOCALITYSIRUTA_ON_ID_COUNTYSIRUTA foreign key (ID_COUNTYSIRUTA_ID) references INVCULT_COUNTYSIRUTA(ID)^
create unique index IDX_INVCULT_LOCALITYSIRUTA_UK_SIRUTA on INVCULT_LOCALITYSIRUTA (SIRUTA) where DELETE_TS is null ^
create index IDX_INVCULT_LOCALITYSIRUTA_ON_ID_COUNTYSIRUTA on INVCULT_LOCALITYSIRUTA (ID_COUNTYSIRUTA_ID)^
-- end INVCULT_LOCALITYSIRUTA
-- begin INVCULT_COUNTYSIRUTA
alter table INVCULT_COUNTYSIRUTA add constraint FK_INVCULT_COUNTYSIRUTA_ON_ID_ZONESIRUTA foreign key (ID_ZONESIRUTA_ID) references INVCULT_ZONESIRUTA(ID)^
create unique index IDX_INVCULT_COUNTYSIRUTA_UK_MNEMONIC on INVCULT_COUNTYSIRUTA (MNEMONIC) where DELETE_TS is null ^
create unique index IDX_INVCULT_COUNTYSIRUTA_UK_SIRUTA on INVCULT_COUNTYSIRUTA (SIRUTA) where DELETE_TS is null ^
create unique index IDX_INVCULT_COUNTYSIRUTA_UK_CODE on INVCULT_COUNTYSIRUTA (CODE) where DELETE_TS is null ^
create unique index IDX_INVCULT_COUNTYSIRUTA_UK_NAME on INVCULT_COUNTYSIRUTA (NAME) where DELETE_TS is null ^
create index IDX_INVCULT_COUNTYSIRUTA_ON_ID_ZONESIRUTA on INVCULT_COUNTYSIRUTA (ID_ZONESIRUTA_ID)^
-- end INVCULT_COUNTYSIRUTA
-- begin INVCULT_FARMERS
alter table INVCULT_FARMERS add constraint FK_INVCULT_FARMERS_ON_ID_TIPPERSOANA foreign key (ID_TIPPERSOANA_ID) references INVCULT_TIPPERSOANA(ID)^
create index IDX_INVCULT_FARMERS_ON_ID_TIPPERSOANA on INVCULT_FARMERS (ID_TIPPERSOANA_ID)^
-- end INVCULT_FARMERS
-- begin INVCULT_ROADTYPE
create unique index IDX_INVCULT_ROADTYPE_UK_TIP_ARTERA on INVCULT_ROADTYPE (TIP_ARTERA) where DELETE_TS is null ^
-- end INVCULT_ROADTYPE
-- begin INVCULT_STREET
create unique index IDX_INVCULT_STREET_UK_NUME_STRADA on INVCULT_STREET (NUME_STRADA) where DELETE_TS is null ^
-- end INVCULT_STREET
-- begin INVCULT_LOCATION
alter table INVCULT_LOCATION add constraint FK_INVCULT_LOCATION_ON_ID_FARMERS foreign key (ID_FARMERS_ID) references INVCULT_FARMERS(ID)^
alter table INVCULT_LOCATION add constraint FK_INVCULT_LOCATION_ON_ID_LOCALIRYSIRUTA foreign key (ID_LOCALIRYSIRUTA_ID) references INVCULT_LOCALITYSIRUTA(ID)^
alter table INVCULT_LOCATION add constraint FK_INVCULT_LOCATION_ON_ID_ROADTYPE foreign key (ID_ROADTYPE_ID) references INVCULT_ROADTYPE(ID)^
alter table INVCULT_LOCATION add constraint FK_INVCULT_LOCATION_ON_ID_STREET foreign key (ID_STREET_ID) references INVCULT_STREET(ID)^
create index IDX_INVCULT_LOCATION_ON_ID_FARMERS on INVCULT_LOCATION (ID_FARMERS_ID)^
create index IDX_INVCULT_LOCATION_ON_ID_LOCALIRYSIRUTA on INVCULT_LOCATION (ID_LOCALIRYSIRUTA_ID)^
create index IDX_INVCULT_LOCATION_ON_ID_ROADTYPE on INVCULT_LOCATION (ID_ROADTYPE_ID)^
create index IDX_INVCULT_LOCATION_ON_ID_STREET on INVCULT_LOCATION (ID_STREET_ID)^
-- end INVCULT_LOCATION
-- begin INVCULT_INVENTORY
alter table INVCULT_INVENTORY add constraint FK_INVCULT_INVENTORY_ON_ID_PERSONS foreign key (ID_PERSONS_ID) references INVCULT_PERSONS(ID)^
alter table INVCULT_INVENTORY add constraint FK_INVCULT_INVENTORY_ON_LOCINV foreign key (LOCINV_ID) references INVCULT_LOCALITYSIRUTA(ID)^
alter table INVCULT_INVENTORY add constraint FK_INVCULT_INVENTORY_ON_ID_FARMERS foreign key (ID_FARMERS_ID) references INVCULT_FARMERS(ID)^
alter table INVCULT_INVENTORY add constraint FK_INVCULT_INVENTORY_ON_LOCFERMA foreign key (LOCFERMA_ID) references INVCULT_LOCATION(ID)^
create index IDX_INVCULT_INVENTORY_ON_ID_PERSONS on INVCULT_INVENTORY (ID_PERSONS_ID)^
create index IDX_INVCULT_INVENTORY_ON_LOCINV on INVCULT_INVENTORY (LOCINV_ID)^
create index IDX_INVCULT_INVENTORY_ON_ID_FARMERS on INVCULT_INVENTORY (ID_FARMERS_ID)^
create index IDX_INVCULT_INVENTORY_ON_LOCFERMA on INVCULT_INVENTORY (LOCFERMA_ID)^
-- end INVCULT_INVENTORY
-- begin INVCULT_USEPOPLOC
create unique index IDX_INVCULT_USEPOPLOC_UK_NAME on INVCULT_USEPOPLOC (NAME) where DELETE_TS is null ^
-- end INVCULT_USEPOPLOC
-- begin INVCULT_SELCRIT
create unique index IDX_INVCULT_SELCRIT_UK_NAME on INVCULT_SELCRIT (NAME) where DELETE_TS is null ^
-- end INVCULT_SELCRIT
-- begin INVCULT_CULTMET
create unique index IDX_INVCULT_CULTMET_UK_NAME on INVCULT_CULTMET (NAME) where DELETE_TS is null ^
-- end INVCULT_CULTMET
-- begin INVCULT_STORCONT
create unique index IDX_INVCULT_STORCONT_UK_NAME on INVCULT_STORCONT (NAME) where DELETE_TS is null ^
-- end INVCULT_STORCONT
-- begin INVCULT_SYSAGR
create unique index IDX_INVCULT_SYSAGR_UK_NAME on INVCULT_SYSAGR (NAME) where DELETE_TS is null ^
-- end INVCULT_SYSAGR
-- begin INVCULT_MOTFARMER
create unique index IDX_INVCULT_MOTFARMER_UK_NAME on INVCULT_MOTFARMER (NAME) where DELETE_TS is null ^
-- end INVCULT_MOTFARMER
-- begin INVCULT_PARTPLANT
create unique index IDX_INVCULT_PARTPLANT_UK_NAME on INVCULT_PARTPLANT (NAME) where DELETE_TS is null ^
-- end INVCULT_PARTPLANT
-- begin INVCULT_OLDVAR
create unique index IDX_INVCULT_OLDVAR_UK_NAME on INVCULT_OLDVAR (NAME) where DELETE_TS is null ^
-- end INVCULT_OLDVAR
-- begin INVCULT_DRYPLACE
create unique index IDX_INVCULT_DRYPLACE_UK_NAME on INVCULT_DRYPLACE (NAME) where DELETE_TS is null ^
-- end INVCULT_DRYPLACE
-- begin INVCULT_STORPLACE
create unique index IDX_INVCULT_STORPLACE_UK_NAME on INVCULT_STORPLACE (NAME) where DELETE_TS is null ^
-- end INVCULT_STORPLACE
-- begin INVCULT_PROCSEEDS
create unique index IDX_INVCULT_PROCSEEDS_UK_NAME on INVCULT_PROCSEEDS (NAME) where DELETE_TS is null ^
-- end INVCULT_PROCSEEDS
