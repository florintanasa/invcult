alter table INVCULT_INVENTORY add constraint FK_INVCULT_INVENTORY_ON_ID_STORCONT foreign key (ID_STORCONT_ID) references INVCULT_STORCONT(ID);
create index IDX_INVCULT_INVENTORY_ON_ID_STORCONT on INVCULT_INVENTORY (ID_STORCONT_ID);
