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
    FERMA boolean not null,
    --
    primary key (ID)
)^
-- end INVCULT_LOCATION
-- begin INVCULT_CROPS
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
)^
-- end INVCULT_CROPS
-- begin INVCULT_INVENTORY
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
    ID_LOCINV_ID uuid not null,
    LATITUDINE varchar(50),
    LONGITUDINE varchar(50),
    ALTTITUDINE integer,
    ID_FARMERS_ID uuid not null,
    ID_LOCFERMA_ID uuid not null,
    --
    primary key (ID)
)^
-- end INVCULT_INVENTORY
-- begin INVCULT_PERSONS
create table INVCULT_PERSONS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUME varchar(50) not null,
    --
    primary key (ID)
)^
-- end INVCULT_PERSONS
-- begin INVCULT_USEPOPLOC
create table INVCULT_USEPOPLOC (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end INVCULT_USEPOPLOC
-- begin INVCULT_SELCRIT
create table INVCULT_SELCRIT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end INVCULT_SELCRIT
-- begin INVCULT_CULTMET
create table INVCULT_CULTMET (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end INVCULT_CULTMET
-- begin INVCULT_STORCONT
create table INVCULT_STORCONT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end INVCULT_STORCONT
-- begin INVCULT_SYSAGR
create table INVCULT_SYSAGR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end INVCULT_SYSAGR
-- begin INVCULT_MOTFARMER
create table INVCULT_MOTFARMER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end INVCULT_MOTFARMER
-- begin INVCULT_PARTPLANT
create table INVCULT_PARTPLANT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end INVCULT_PARTPLANT
-- begin INVCULT_OLDVAR
create table INVCULT_OLDVAR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end INVCULT_OLDVAR
-- begin INVCULT_DRYPLACE
create table INVCULT_DRYPLACE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end INVCULT_DRYPLACE
-- begin INVCULT_STORPLACE
create table INVCULT_STORPLACE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end INVCULT_STORPLACE
-- begin INVCULT_PROCSEEDS
create table INVCULT_PROCSEEDS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end INVCULT_PROCSEEDS
