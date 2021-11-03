package com.svgenebank.invcult.web.screens.zonesiruta;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Zonesiruta;

@UiController("invcult_Zonesiruta.edit")
@UiDescriptor("zonesiruta-edit.xml")
@EditedEntityContainer("zonesirutaDc")
@LoadDataBeforeShow
public class ZonesirutaEdit extends StandardEditor<Zonesiruta> {
}