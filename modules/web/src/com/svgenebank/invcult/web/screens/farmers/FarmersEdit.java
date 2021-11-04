package com.svgenebank.invcult.web.screens.farmers;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Farmers;

@UiController("invcult_Farmers.edit")
@UiDescriptor("farmers-edit.xml")
@EditedEntityContainer("farmersDc")
@LoadDataBeforeShow
public class FarmersEdit extends StandardEditor<Farmers> {
}