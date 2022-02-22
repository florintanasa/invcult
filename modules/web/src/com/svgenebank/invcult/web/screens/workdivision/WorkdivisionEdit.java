package com.svgenebank.invcult.web.screens.workdivision;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Workdivision;

@UiController("invcult_Workdivision.edit")
@UiDescriptor("workdivision-edit.xml")
@EditedEntityContainer("workdivisionDc")
@LoadDataBeforeShow
public class WorkdivisionEdit extends StandardEditor<Workdivision> {
}