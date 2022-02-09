package com.svgenebank.invcult.web.screens.motfarmer;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Motfarmer;

@UiController("invcult_Motfarmer.browse")
@UiDescriptor("motfarmer-browse.xml")
@LookupComponent("motfarmersTable")
@LoadDataBeforeShow
public class MotfarmerBrowse extends StandardLookup<Motfarmer> {
}