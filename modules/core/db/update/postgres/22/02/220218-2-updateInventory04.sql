alter table INVCULT_INVENTORY add constraint FK_INVCULT_INVENTORY_ON_ID_PRESFORM foreign key (ID_PRESFORM_ID) references INVCULT_PRESFORM(ID);
create index IDX_INVCULT_INVENTORY_ON_ID_PRESFORM on INVCULT_INVENTORY (ID_PRESFORM_ID);
