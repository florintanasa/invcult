package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "INVCULT_PERSONS")
@Entity(name = "invcult_Persons")
@NamePattern("%s|nume")
public class Persons extends StandardEntity {
    private static final long serialVersionUID = -5913774432145617697L;

    @NotNull
    @Column(name = "NUME", nullable = false, length = 50)
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}