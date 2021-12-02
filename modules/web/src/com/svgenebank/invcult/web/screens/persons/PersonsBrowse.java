package com.svgenebank.invcult.web.screens.persons;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Persons;

@UiController("invcult_Persons.browse")
@UiDescriptor("persons-browse.xml")
@LookupComponent("personsesTable")
@LoadDataBeforeShow
public class PersonsBrowse extends StandardLookup<Persons> {
}