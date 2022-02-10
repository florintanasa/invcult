package com.svgenebank.invcult.web.screens.dryplace;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Dryplace;

@UiController("invcult_Dryplace.edit")
@UiDescriptor("dryplace-edit.xml")
@EditedEntityContainer("dryplaceDc")
@LoadDataBeforeShow
public class DryplaceEdit extends StandardEditor<Dryplace> {
}