create table INVCULT_INVENTORY_PARTPLANT_LINK (
    PARTPLANT_ID uuid,
    INVENTORY_ID uuid,
    primary key (PARTPLANT_ID, INVENTORY_ID)
);
