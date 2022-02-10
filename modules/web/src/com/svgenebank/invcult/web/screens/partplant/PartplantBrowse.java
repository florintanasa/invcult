package com.svgenebank.invcult.web.screens.partplant;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Partplant;

@UiController("invcult_Partplant.browse")
@UiDescriptor("partplant-browse.xml")
@LookupComponent("partplantsTable")
@LoadDataBeforeShow
public class PartplantBrowse extends StandardLookup<Partplant> {
}