package com.svgenebank.invcult.web.screens.storplace;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Storplace;

@UiController("invcult_Storplace.browse")
@UiDescriptor("storplace-browse.xml")
@LookupComponent("storplacesTable")
@LoadDataBeforeShow
public class StorplaceBrowse extends StandardLookup<Storplace> {
}