package com.svgenebank.invcult.web.screens.sysagr;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Sysagr;

@UiController("invcult_Sysagr.edit")
@UiDescriptor("sysagr-edit.xml")
@EditedEntityContainer("sysagrDc")
@LoadDataBeforeShow
public class SysagrEdit extends StandardEditor<Sysagr> {
}