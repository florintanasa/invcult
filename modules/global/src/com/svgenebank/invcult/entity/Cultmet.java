package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "INVCULT_CULTMET")
@Entity(name = "invcult_Cultmet")
@NamePattern("%s|name")
public class Cultmet extends StandardEntity {
    private static final long serialVersionUID = -1837607193958552045L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}