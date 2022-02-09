package com.svgenebank.invcult.web.screens.cultmet;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Cultmet;

@UiController("invcult_Cultmet.browse")
@UiDescriptor("cultmet-browse.xml")
@LookupComponent("cultmetsTable")
@LoadDataBeforeShow
public class CultmetBrowse extends StandardLookup<Cultmet> {
}