package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "INVCULT_STREET")
@Entity(name = "invcult_Street")
@NamePattern("%s|numeStrada")
public class Street extends StandardEntity {
    private static final long serialVersionUID = -8644265383167997684L;

    @NotNull
    @Column(name = "NUME_STRADA", nullable = false, unique = true, length = 50)
    private String numeStrada;

    public String getNumeStrada() {
        return numeStrada;
    }

    public void setNumeStrada(String numeStrada) {
        this.numeStrada = numeStrada;
    }
}