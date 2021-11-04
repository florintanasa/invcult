package com.svgenebank.invcult.web.screens.roadtype;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Roadtype;

@UiController("invcult_Roadtype.browse")
@UiDescriptor("roadtype-browse.xml")
@LookupComponent("roadtypesTable")
@LoadDataBeforeShow
public class RoadtypeBrowse extends StandardLookup<Roadtype> {
}