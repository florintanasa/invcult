package com.svgenebank.invcult.web.screens.selcrit;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Selcrit;

@UiController("invcult_Selcrit.browse")
@UiDescriptor("selcrit-browse.xml")
@LookupComponent("selcritsTable")
@LoadDataBeforeShow
public class SelcritBrowse extends StandardLookup<Selcrit> {
}