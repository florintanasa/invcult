alter table INVCULT_COUNTYSIRUTA add constraint FK_INVCULT_COUNTYSIRUTA_ON_ID_ZONESIRUTA foreign key (ID_ZONESIRUTA_ID) references INVCULT_ZONESIRUTA(ID);
create unique index IDX_INVCULT_COUNTYSIRUTA_UK_MNEMONIC on INVCULT_COUNTYSIRUTA (MNEMONIC) where DELETE_TS is null ;
create unique index IDX_INVCULT_COUNTYSIRUTA_UK_SIRUTA on INVCULT_COUNTYSIRUTA (SIRUTA) where DELETE_TS is null ;
create unique index IDX_INVCULT_COUNTYSIRUTA_UK_CODE on INVCULT_COUNTYSIRUTA (CODE) where DELETE_TS is null ;
create unique index IDX_INVCULT_COUNTYSIRUTA_UK_NAME on INVCULT_COUNTYSIRUTA (NAME) where DELETE_TS is null ;
create index IDX_INVCULT_COUNTYSIRUTA_ON_ID_ZONESIRUTA on INVCULT_COUNTYSIRUTA (ID_ZONESIRUTA_ID);
