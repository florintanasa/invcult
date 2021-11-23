alter table INVCULT_LOCATION rename column id_mandatar_id to id_mandatar_id__u90775 ;
alter table INVCULT_LOCATION drop constraint FK_INVCULT_LOCATION_ON_ID_MANDATAR ;
drop index IDX_INVCULT_LOCATION_ON_ID_MANDATAR ;
alter table INVCULT_LOCATION rename column marime_ferma to marime_ferma__u14041 ;
