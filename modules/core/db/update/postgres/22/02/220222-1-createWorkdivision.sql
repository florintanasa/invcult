create table INVCULT_WORKDIVISION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_TYPEWORKDIV_ID uuid not null,
    FEMALE boolean,
    MALE boolean,
    FAMILY boolean,
    OTHERS_ boolean,
    ALL_ boolean,
    --
    primary key (ID)
);