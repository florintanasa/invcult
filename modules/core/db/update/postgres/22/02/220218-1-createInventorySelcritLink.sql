create table INVCULT_INVENTORY_SELCRIT_LINK (
    INVENTORY_ID uuid,
    SELCRIT_ID uuid,
    primary key (INVENTORY_ID, SELCRIT_ID)
);
