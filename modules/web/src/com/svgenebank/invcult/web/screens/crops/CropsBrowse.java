package com.svgenebank.invcult.web.screens.crops;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Crops;

@UiController("invcult_Crops.browse")
@UiDescriptor("crops-browse.xml")
@LookupComponent("cropsesTable")
@LoadDataBeforeShow
public class CropsBrowse extends StandardLookup<Crops> {
}