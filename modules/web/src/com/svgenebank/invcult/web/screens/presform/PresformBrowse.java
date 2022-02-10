package com.svgenebank.invcult.web.screens.presform;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Presform;

@UiController("invcult_Presform.browse")
@UiDescriptor("presform-browse.xml")
@LookupComponent("presformsTable")
@LoadDataBeforeShow
public class PresformBrowse extends StandardLookup<Presform> {
}