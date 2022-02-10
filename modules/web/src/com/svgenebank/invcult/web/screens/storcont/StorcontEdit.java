package com.svgenebank.invcult.web.screens.storcont;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Storcont;

@UiController("invcult_Storcont.edit")
@UiDescriptor("storcont-edit.xml")
@EditedEntityContainer("storcontDc")
@LoadDataBeforeShow
public class StorcontEdit extends StandardEditor<Storcont> {
}