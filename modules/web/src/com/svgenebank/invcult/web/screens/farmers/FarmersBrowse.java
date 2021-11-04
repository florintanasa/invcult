package com.svgenebank.invcult.web.screens.farmers;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Farmers;

@UiController("invcult_Farmers.browse")
@UiDescriptor("farmers-browse.xml")
@LookupComponent("farmersesTable")
@LoadDataBeforeShow
public class FarmersBrowse extends StandardLookup<Farmers> {
}