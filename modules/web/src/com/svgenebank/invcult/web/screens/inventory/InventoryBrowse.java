package com.svgenebank.invcult.web.screens.inventory;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Inventory;

@UiController("invcult_Inventory.browse")
@UiDescriptor("inventory-browse.xml")
@LookupComponent("inventoriesTable")
@LoadDataBeforeShow
public class InventoryBrowse extends StandardLookup<Inventory> {
}