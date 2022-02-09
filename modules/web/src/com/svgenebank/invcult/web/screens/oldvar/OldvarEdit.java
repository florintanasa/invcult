package com.svgenebank.invcult.web.screens.oldvar;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Oldvar;

@UiController("invcult_Oldvar.edit")
@UiDescriptor("oldvar-edit.xml")
@EditedEntityContainer("oldvarDc")
@LoadDataBeforeShow
public class OldvarEdit extends StandardEditor<Oldvar> {
}