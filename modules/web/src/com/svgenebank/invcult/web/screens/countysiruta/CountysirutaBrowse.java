package com.svgenebank.invcult.web.screens.countysiruta;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Countysiruta;

@UiController("invcult_Countysiruta.browse")
@UiDescriptor("countysiruta-browse.xml")
@LookupComponent("countysirutasTable")
@LoadDataBeforeShow
public class CountysirutaBrowse extends StandardLookup<Countysiruta> {
}