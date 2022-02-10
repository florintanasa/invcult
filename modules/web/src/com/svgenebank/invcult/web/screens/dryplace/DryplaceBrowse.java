package com.svgenebank.invcult.web.screens.dryplace;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Dryplace;

@UiController("invcult_Dryplace.browse")
@UiDescriptor("dryplace-browse.xml")
@LookupComponent("dryplacesTable")
@LoadDataBeforeShow
public class DryplaceBrowse extends StandardLookup<Dryplace> {
}