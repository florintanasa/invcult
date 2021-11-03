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
);