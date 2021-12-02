create table INVCULT_CROPS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DENLOC varchar(50) not null,
    SPECIA varchar(50) not null,
    GENUL varchar(50) not null,
    --
    primary key (ID)
);