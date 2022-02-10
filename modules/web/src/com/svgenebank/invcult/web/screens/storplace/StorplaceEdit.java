package com.svgenebank.invcult.web.screens.storplace;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Storplace;

@UiController("invcult_Storplace.edit")
@UiDescriptor("storplace-edit.xml")
@EditedEntityContainer("storplaceDc")
@LoadDataBeforeShow
public class StorplaceEdit extends StandardEditor<Storplace> {
}