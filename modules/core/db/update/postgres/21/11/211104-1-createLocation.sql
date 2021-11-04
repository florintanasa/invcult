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
);