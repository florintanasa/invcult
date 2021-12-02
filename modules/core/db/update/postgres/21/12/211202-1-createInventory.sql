create table INVCULT_INVENTORY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DATE_ date not null,
    ID_PERSONS_ID uuid not null,
    NRINV varchar(50),
    LOCINV_ID uuid not null,
    LATITUDINE varchar(50),
    LONGITUDINE varchar(50),
    ALTTITUDINE integer,
    ID_FARMERS_ID uuid not null,
    LOCFERMA_ID uuid not null,
    --
    primary key (ID)
);