package com.svgenebank.invcult.web.screens.procseeds;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Procseeds;

@UiController("invcult_Procseeds.browse")
@UiDescriptor("procseeds-browse.xml")
@LookupComponent("procseedsesTable")
@LoadDataBeforeShow
public class ProcseedsBrowse extends StandardLookup<Procseeds> {
}