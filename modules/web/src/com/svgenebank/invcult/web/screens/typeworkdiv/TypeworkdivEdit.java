package com.svgenebank.invcult.web.screens.typeworkdiv;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Typeworkdiv;

@UiController("invcult_Typeworkdiv.edit")
@UiDescriptor("typeworkdiv-edit.xml")
@EditedEntityContainer("typeworkdivDc")
@LoadDataBeforeShow
public class TypeworkdivEdit extends StandardEditor<Typeworkdiv> {
}