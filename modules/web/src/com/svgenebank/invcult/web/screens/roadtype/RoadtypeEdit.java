package com.svgenebank.invcult.web.screens.roadtype;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Roadtype;

@UiController("invcult_Roadtype.edit")
@UiDescriptor("roadtype-edit.xml")
@EditedEntityContainer("roadtypeDc")
@LoadDataBeforeShow
public class RoadtypeEdit extends StandardEditor<Roadtype> {
}