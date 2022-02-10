package com.svgenebank.invcult.web.screens.storcont;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Storcont;

@UiController("invcult_Storcont.browse")
@UiDescriptor("storcont-browse.xml")
@LookupComponent("storcontsTable")
@LoadDataBeforeShow
public class StorcontBrowse extends StandardLookup<Storcont> {
}