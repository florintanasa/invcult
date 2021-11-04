-- begin INVCULT_ZONESIRUTA
create table INVCULT_ZONESIRUTA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SIRUTA integer not null,
    ZONENAME varchar(25) not null,
    ZONENUMBER integer not null,
    --
    primary key (ID)
)^
-- end INVCULT_ZONESIRUTA
-- begin INVCULT_LOCALITYSIRUTA
create table INVCULT_LOCALITYSIRUTA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SIRUTA integer not null,
    NAME varchar(35) not null,
    POSTCODE varchar(7),
    SIRUTASUP integer,
    ID_COUNTYSIRUTA_ID uuid not null,
    --
    primary key (ID)
)^
-- end INVCULT_LOCALITYSIRUTA
-- begin INVCULT_COUNTYSIRUTA
create table INVCULT_COUNTYSIRUTA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SIRUTA integer not null,
    CODE integer not null,
    NAME varchar(25) not null,
    MNEMONIC varchar(2) not null,
    ID_ZONESIRUTA_ID uuid not null,
    --
    primary key (ID)
)^
-- end INVCULT_COUNTYSIRUTA
-- begin INVCULT_TIPPERSOANA
create table INVCULT_TIPPERSOANA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PREFIX varchar(25) not null,
    DENUMIRE varchar(255) not null,
    SUFIX varchar(25),
    --
    primary key (ID)
)^
-- end INVCULT_TIPPERSOANA
-- begin INVCULT_FARMERS
create table INVCULT_FARMERS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_TIPPERSOANA_ID uuid not null,
    DENUMIRE varchar(255) not null,
    --
    primary key (ID)
)^
-- end INVCULT_FARMERS
-- begin INVCULT_ROADTYPE
create table INVCULT_ROADTYPE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TIP_ARTERA varchar(15) not null,
    --
    primary key (ID)
)^
-- end INVCULT_ROADTYPE
-- begin INVCULT_STREET
create table INVCULT_STREET (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUME_STRADA varchar(50) not null,
    --
    primary key (ID)
)^
-- end INVCULT_STREET
-- begin INVCULT_LOCATION
create table INVCULT_LOCATION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_FARMERS_ID uuid not null,
    ID_LOCALIRYSIRUTA_ID uuid not null,
    ID_ROADTYPE_ID uuid,
    ID_STREET_ID uuid,
    NUMAR varchar(10),
    BLOC varchar(10),
    SCARA varchar(10),
    ETAJ varchar(10),
    APARTAMENT varchar(10),
    CODPOSTAL varchar(6),
    CORESPONDENTA boolean not null,
    DOMICILIU boolean not null,
    --
    primary key (ID)
)^
-- end INVCULT_LOCATION
