package com.svgenebank.invcult.web.screens.cultmet;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Cultmet;

@UiController("invcult_Cultmet.edit")
@UiDescriptor("cultmet-edit.xml")
@EditedEntityContainer("cultmetDc")
@LoadDataBeforeShow
public class CultmetEdit extends StandardEditor<Cultmet> {
}