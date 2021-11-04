package com.svgenebank.invcult.web.screens.location;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Location;

@UiController("invcult_Location.browse")
@UiDescriptor("location-browse.xml")
@LookupComponent("locationsTable")
@LoadDataBeforeShow
public class LocationBrowse extends StandardLookup<Location> {
}