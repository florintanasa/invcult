package com.svgenebank.invcult.web.screens.inventory;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Inventory;

@UiController("invcult_Inventory.edit")
@UiDescriptor("inventory-edit.xml")
@EditedEntityContainer("inventoryDc")
@LoadDataBeforeShow
public class InventoryEdit extends StandardEditor<Inventory> {
}