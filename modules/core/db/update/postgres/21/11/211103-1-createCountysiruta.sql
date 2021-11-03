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
);