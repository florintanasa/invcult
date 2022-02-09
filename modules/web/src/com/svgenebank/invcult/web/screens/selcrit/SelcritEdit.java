package com.svgenebank.invcult.web.screens.selcrit;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Selcrit;

@UiController("invcult_Selcrit.edit")
@UiDescriptor("selcrit-edit.xml")
@EditedEntityContainer("selcritDc")
@LoadDataBeforeShow
public class SelcritEdit extends StandardEditor<Selcrit> {
}