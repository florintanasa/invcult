package com.svgenebank.invcult.web.screens.zonesiruta;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Zonesiruta;

@UiController("invcult_Zonesiruta.browse")
@UiDescriptor("zonesiruta-browse.xml")
@LookupComponent("zonesirutasTable")
@LoadDataBeforeShow
public class ZonesirutaBrowse extends StandardLookup<Zonesiruta> {
}