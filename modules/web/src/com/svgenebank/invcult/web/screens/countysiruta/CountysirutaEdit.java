package com.svgenebank.invcult.web.screens.countysiruta;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Countysiruta;

@UiController("invcult_Countysiruta.edit")
@UiDescriptor("countysiruta-edit.xml")
@EditedEntityContainer("countysirutaDc")
@LoadDataBeforeShow
public class CountysirutaEdit extends StandardEditor<Countysiruta> {
}