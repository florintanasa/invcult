package com.svgenebank.invcult.web.screens.typeworkdiv;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Typeworkdiv;

@UiController("invcult_Typeworkdiv.browse")
@UiDescriptor("typeworkdiv-browse.xml")
@LookupComponent("typeworkdivsTable")
@LoadDataBeforeShow
public class TypeworkdivBrowse extends StandardLookup<Typeworkdiv> {
}