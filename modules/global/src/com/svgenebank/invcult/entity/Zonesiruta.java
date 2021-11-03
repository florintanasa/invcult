package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "INVCULT_ZONESIRUTA")
@Entity(name = "invcult_Zonesiruta")
@NamePattern("%s|zonename")
public class Zonesiruta extends StandardEntity {
    private static final long serialVersionUID = 4461255578928887087L;

    @NotNull
    @Column(name = "SIRUTA", nullable = false, unique = true)
    private Integer siruta;

    @NotNull
    @Column(name = "ZONENAME", nullable = false, unique = true, length = 25)
    private String zonename;

    @NotNull
    @Column(name = "ZONENUMBER", nullable = false, unique = true)
    private Integer zonenumber;

    public Integer getZonenumber() {
        return zonenumber;
    }

    public void setZonenumber(Integer zonenumber) {
        this.zonenumber = zonenumber;
    }

    public String getZonename() {
        return zonename;
    }

    public void setZonename(String zonename) {
        this.zonename = zonename;
    }

    public Integer getSiruta() {
        return siruta;
    }

    public void setSiruta(Integer siruta) {
        this.siruta = siruta;
    }
}