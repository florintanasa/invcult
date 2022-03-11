-- update INVCULT_INVENTORY set NRINV = <default_value> where NRINV is null ;
alter table INVCULT_INVENTORY alter column NRINV set not null ;
