-- alter table INVCULT_INVENTORY add column ID_SYSAGR_ID uuid ^
-- update INVCULT_INVENTORY set ID_SYSAGR_ID = <default_value> ;
-- alter table INVCULT_INVENTORY alter column ID_SYSAGR_ID set not null ;
alter table INVCULT_INVENTORY add column ID_SYSAGR_ID uuid not null ;
