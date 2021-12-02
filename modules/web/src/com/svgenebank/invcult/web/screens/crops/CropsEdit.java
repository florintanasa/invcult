package com.svgenebank.invcult.web.screens.crops;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Crops;

@UiController("invcult_Crops.edit")
@UiDescriptor("crops-edit.xml")
@EditedEntityContainer("cropsDc")
@LoadDataBeforeShow
public class CropsEdit extends StandardEditor<Crops> {
}