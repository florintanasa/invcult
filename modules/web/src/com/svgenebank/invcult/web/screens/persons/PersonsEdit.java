package com.svgenebank.invcult.web.screens.persons;

import com.haulmont.cuba.gui.screen.*;
import com.svgenebank.invcult.entity.Persons;

@UiController("invcult_Persons.edit")
@UiDescriptor("persons-edit.xml")
@EditedEntityContainer("personsDc")
@LoadDataBeforeShow
public class PersonsEdit extends StandardEditor<Persons> {
}