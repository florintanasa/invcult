package com.svgenebank.invcult.web.screens.procseeds;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Procseeds;

@UiController("invcult_Procseeds.edit")
@UiDescriptor("procseeds-edit.xml")
@EditedEntityContainer("procseedsDc")
@LoadDataBeforeShow
public class ProcseedsEdit extends StandardEditor<Procseeds> {
}