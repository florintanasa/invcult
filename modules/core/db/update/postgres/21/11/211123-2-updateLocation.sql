alter table INVCULT_LOCATION add column MARIME_FERMA decimal(19, 3) ;
alter table INVCULT_LOCATION add column FERMA boolean ^
update INVCULT_LOCATION set FERMA = false where FERMA is null ;
alter table INVCULT_LOCATION alter column FERMA set not null ;
alter table INVCULT_LOCATION add column ID_MANDATAR_ID uuid ;
