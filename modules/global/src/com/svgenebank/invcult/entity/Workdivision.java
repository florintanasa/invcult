package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "INVCULT_WORKDIVISION")
@Entity(name = "invcult_Workdivision")
@NamePattern("%s %s %s %s %s %s|idTypeworkdiv,female,male,others,family,all")
public class Workdivision extends StandardEntity {
    private static final long serialVersionUID = -3981606969207490161L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_TYPEWORKDIV_ID")
    private Typeworkdiv idTypeworkdiv;

    @Column(name = "FEMALE")
    private Boolean female;

    @Column(name = "MALE")
    private Boolean male;

    @Column(name = "FAMILY")
    private Boolean family;

    @Column(name = "OTHERS_")
    private Boolean others;

    @Column(name = "ALL_")
    private Boolean all;
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "INVENTORY_ID")
    private Inventory inventory;

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Boolean getAll() {
        return all;
    }

    public void setAll(Boolean all) {
        this.all = all;
    }

    public Boolean getFamily() {
        return family;
    }

    public void setFamily(Boolean family) {
        this.family = family;
    }

    public Boolean getOthers() {
        return others;
    }

    public void setOthers(Boolean others) {
        this.others = others;
    }

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    public Boolean getFemale() {
        return female;
    }

    public void setFemale(Boolean female) {
        this.female = female;
    }

    public Typeworkdiv getIdTypeworkdiv() {
        return idTypeworkdiv;
    }

    public void setIdTypeworkdiv(Typeworkdiv idTypeworkdiv) {
        this.idTypeworkdiv = idTypeworkdiv;
    }
}