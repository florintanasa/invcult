package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "INVCULT_COUNTYSIRUTA")
@Entity(name = "invcult_Countysiruta")
@NamePattern("%s|name")
public class Countysiruta extends StandardEntity {
    private static final long serialVersionUID = -7145940252805527807L;

    @NotNull
    @Column(name = "SIRUTA", nullable = false, unique = true)
    private Integer siruta;

    @NotNull
    @Column(name = "CODE", nullable = false, unique = true)
    private Integer code;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true, length = 25)
    private String name;

    @NotNull
    @Column(name = "MNEMONIC", nullable = false, unique = true, length = 2)
    private String mnemonic;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_ZONESIRUTA_ID")
    private Zonesiruta id_zonesiruta;

    public Zonesiruta getId_zonesiruta() {
        return id_zonesiruta;
    }

    public void setId_zonesiruta(Zonesiruta id_zonesiruta) {
        this.id_zonesiruta = id_zonesiruta;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getSiruta() {
        return siruta;
    }

    public void setSiruta(Integer siruta) {
        this.siruta = siruta;
    }
}