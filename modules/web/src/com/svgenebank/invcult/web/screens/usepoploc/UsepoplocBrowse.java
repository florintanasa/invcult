package com.svgenebank.invcult.web.screens.usepoploc;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Usepoploc;

@UiController("invcult_Usepoploc.browse")
@UiDescriptor("usepoploc-browse.xml")
@LookupComponent("usepoplocsTable")
@LoadDataBeforeShow
public class UsepoplocBrowse extends StandardLookup<Usepoploc> {
}