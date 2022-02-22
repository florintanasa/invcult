package com.svgenebank.invcult.web.screens.workdivision;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Workdivision;

@UiController("invcult_Workdivision.browse")
@UiDescriptor("workdivision-browse.xml")
@LookupComponent("workdivisionsTable")
@LoadDataBeforeShow
public class WorkdivisionBrowse extends StandardLookup<Workdivision> {
}