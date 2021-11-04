package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "INVCULT_FARMERS")
@Entity(name = "invcult_Farmers")
@NamePattern("%s|denumire")
public class Farmers extends StandardEntity {
    private static final long serialVersionUID = 8962921917719326083L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_TIPPERSOANA_ID")
    private Tippersoana idTippersoana;

    @NotNull
    @Column(name = "DENUMIRE", nullable = false)
    private String denumire;

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Tippersoana getIdTippersoana() {
        return idTippersoana;
    }

    public void setIdTippersoana(Tippersoana idTippersoana) {
        this.idTippersoana = idTippersoana;
    }
}