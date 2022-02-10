package com.svgenebank.invcult.web.screens.partplant;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Partplant;

@UiController("invcult_Partplant.edit")
@UiDescriptor("partplant-edit.xml")
@EditedEntityContainer("partplantDc")
@LoadDataBeforeShow
public class PartplantEdit extends StandardEditor<Partplant> {
}