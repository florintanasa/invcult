alter table INVCULT_INVENTORY_PARTPLANT_LINK add constraint FK_INVPAR_ON_PARTPLANT foreign key (PARTPLANT_ID) references INVCULT_PARTPLANT(ID);
alter table INVCULT_INVENTORY_PARTPLANT_LINK add constraint FK_INVPAR_ON_INVENTORY foreign key (INVENTORY_ID) references INVCULT_INVENTORY(ID);