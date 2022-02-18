alter table INVCULT_INVENTORY add column ID_CULTMET_ID uuid ;
alter table INVCULT_INVENTORY add column ISCULTROT boolean ;
alter table INVCULT_INVENTORY add column ID_STORPLACE_ID uuid ;
alter table INVCULT_INVENTORY add column REMARKS text ;
alter table INVCULT_INVENTORY add column ID_OLDVAR_ID uuid ;
alter table INVCULT_INVENTORY add column ISLOCPOP boolean ^
update INVCULT_INVENTORY set ISLOCPOP = false where ISLOCPOP is null ;
alter table INVCULT_INVENTORY alter column ISLOCPOP set not null ;
alter table INVCULT_INVENTORY add column ID_PRESFORM_ID uuid ;
alter table INVCULT_INVENTORY add column ID_STORCONT_ID uuid ;
alter table INVCULT_INVENTORY add column ID_DRYPLACE_ID uuid ;
alter table INVCULT_INVENTORY add column ISFERT boolean ;
alter table INVCULT_INVENTORY add column ISTREATY varchar(255) ;
alter table INVCULT_INVENTORY add column ISSPRAYER boolean ;
