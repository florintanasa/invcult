package com.svgenebank.invcult.web.screens.tippersoana;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Tippersoana;

@UiController("invcult_Tippersoana.edit")
@UiDescriptor("tippersoana-edit.xml")
@EditedEntityContainer("tippersoanaDc")
@LoadDataBeforeShow
public class TippersoanaEdit extends StandardEditor<Tippersoana> {
}