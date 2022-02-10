package com.svgenebank.invcult.web.screens.presform;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Presform;

@UiController("invcult_Presform.edit")
@UiDescriptor("presform-edit.xml")
@EditedEntityContainer("presformDc")
@LoadDataBeforeShow
public class PresformEdit extends StandardEditor<Presform> {
}