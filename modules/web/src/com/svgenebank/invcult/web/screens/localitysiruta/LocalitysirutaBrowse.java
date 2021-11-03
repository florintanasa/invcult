package com.svgenebank.invcult.web.screens.localitysiruta;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Localitysiruta;

@UiController("invcult_Localitysiruta.browse")
@UiDescriptor("localitysiruta-browse.xml")
@LookupComponent("localitysirutasTable")
@LoadDataBeforeShow
public class LocalitysirutaBrowse extends StandardLookup<Localitysiruta> {
}