package com.svgenebank.invcult.web.screens.oldvar;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Oldvar;

@UiController("invcult_Oldvar.browse")
@UiDescriptor("oldvar-browse.xml")
@LookupComponent("oldvarsTable")
@LoadDataBeforeShow
public class OldvarBrowse extends StandardLookup<Oldvar> {
}