package com.svgenebank.invcult.web.screens.street;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Street;

@UiController("invcult_Street.edit")
@UiDescriptor("street-edit.xml")
@EditedEntityContainer("streetDc")
@LoadDataBeforeShow
public class StreetEdit extends StandardEditor<Street> {
}