package com.svgenebank.invcult.web.screens.street;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Street;

@UiController("invcult_Street.browse")
@UiDescriptor("street-browse.xml")
@LookupComponent("streetsTable")
@LoadDataBeforeShow
public class StreetBrowse extends StandardLookup<Street> {
}