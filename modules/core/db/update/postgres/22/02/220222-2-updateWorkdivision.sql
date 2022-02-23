-- alter table INVCULT_WORKDIVISION add column INVENTORY_ID uuid ^
-- update INVCULT_WORKDIVISION set INVENTORY_ID = <default_value> ;
-- alter table INVCULT_WORKDIVISION alter column INVENTORY_ID set not null ;
alter table INVCULT_WORKDIVISION add column INVENTORY_ID uuid not null ;
