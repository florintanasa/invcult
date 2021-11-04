package com.svgenebank.invcult.web.screens.location;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Location;

@UiController("invcult_Location.edit")
@UiDescriptor("location-edit.xml")
@EditedEntityContainer("locationDc")
@LoadDataBeforeShow
public class LocationEdit extends StandardEditor<Location> {
}