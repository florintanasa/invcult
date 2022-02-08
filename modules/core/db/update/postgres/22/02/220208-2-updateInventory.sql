alter table INVCULT_INVENTORY rename column locferma_id to locferma_id__u82870 ;
alter table INVCULT_INVENTORY alter column locferma_id__u82870 drop not null ;
alter table INVCULT_INVENTORY drop constraint FK_INVCULT_INVENTORY_ON_LOCFERMA ;
drop index IDX_INVCULT_INVENTORY_ON_LOCFERMA ;
alter table INVCULT_INVENTORY rename column locinv_id to locinv_id__u60179 ;
alter table INVCULT_INVENTORY alter column locinv_id__u60179 drop not null ;
alter table INVCULT_INVENTORY drop constraint FK_INVCULT_INVENTORY_ON_LOCINV ;
drop index IDX_INVCULT_INVENTORY_ON_LOCINV ;
-- alter table INVCULT_INVENTORY add column ID_LOCFERMA_ID uuid ^
-- update INVCULT_INVENTORY set ID_LOCFERMA_ID = <default_value> ;
-- alter table INVCULT_INVENTORY alter column ID_LOCFERMA_ID set not null ;
alter table INVCULT_INVENTORY add column ID_LOCFERMA_ID uuid not null ;
-- alter table INVCULT_INVENTORY add column ID_LOCINV_ID uuid ^
-- update INVCULT_INVENTORY set ID_LOCINV_ID = <default_value> ;
-- alter table INVCULT_INVENTORY alter column ID_LOCINV_ID set not null ;
alter table INVCULT_INVENTORY add column ID_LOCINV_ID uuid not null ;
