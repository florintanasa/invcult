package com.svgenebank.invcult.web.screens.usepoploc;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Usepoploc;

@UiController("invcult_Usepoploc.edit")
@UiDescriptor("usepoploc-edit.xml")
@EditedEntityContainer("usepoplocDc")
@LoadDataBeforeShow
public class UsepoplocEdit extends StandardEditor<Usepoploc> {
}