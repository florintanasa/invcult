package com.svgenebank.invcult.web.screens.tippersoana;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Tippersoana;

@UiController("invcult_Tippersoana.browse")
@UiDescriptor("tippersoana-browse.xml")
@LookupComponent("tippersoanasTable")
@LoadDataBeforeShow
public class TippersoanaBrowse extends StandardLookup<Tippersoana> {
}