package com.svgenebank.invcult.web.screens.sysagr;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Sysagr;

@UiController("invcult_Sysagr.browse")
@UiDescriptor("sysagr-browse.xml")
@LookupComponent("sysagrsTable")
@LoadDataBeforeShow
public class SysagrBrowse extends StandardLookup<Sysagr> {
}