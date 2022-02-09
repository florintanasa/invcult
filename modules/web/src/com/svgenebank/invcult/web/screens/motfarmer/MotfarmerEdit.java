package com.svgenebank.invcult.web.screens.motfarmer;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Motfarmer;

@UiController("invcult_Motfarmer.edit")
@UiDescriptor("motfarmer-edit.xml")
@EditedEntityContainer("motfarmerDc")
@LoadDataBeforeShow
public class MotfarmerEdit extends StandardEditor<Motfarmer> {
}