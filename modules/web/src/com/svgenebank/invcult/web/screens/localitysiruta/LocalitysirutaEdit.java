package com.svgenebank.invcult.web.screens.localitysiruta;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Localitysiruta;

@UiController("invcult_Localitysiruta.edit")
@UiDescriptor("localitysiruta-edit.xml")
@EditedEntityContainer("localitysirutaDc")
@LoadDataBeforeShow
public class LocalitysirutaEdit extends StandardEditor<Localitysiruta> {
}