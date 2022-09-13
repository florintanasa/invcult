package com.svgenebank.invcult.web.screens.invcultview;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.InvcultView;

@UiController("invcult_InvcultView.browse")
@UiDescriptor("invcult-view-browse.xml")
@LookupComponent("invcultViewsTable")
@LoadDataBeforeShow
public class InvcultViewBrowse extends StandardLookup<InvcultView> {
}