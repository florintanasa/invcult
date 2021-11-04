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
);