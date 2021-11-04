package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "INVCULT_TIPPERSOANA")
@Entity(name = "invcult_Tippersoana")
@NamePattern("%s|prefix")
public class Tippersoana extends StandardEntity {
    private static final long serialVersionUID = 6492627430378195603L;

    @NotNull
    @Column(name = "PREFIX", nullable = false, length = 25)
    private String prefix;

    @NotNull
    @Column(name = "DENUMIRE", nullable = false)
    private String denumire;

    @Column(name = "SUFIX", length = 25)
    private String sufix;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "idTippersoana")
    private Farmers farmers;

    public Farmers getFarmers() {
        return farmers;
    }

    public void setFarmers(Farmers farmers) {
        this.farmers = farmers;
    }

    public String getSufix() {
        return sufix;
    }

    public void setSufix(String sufix) {
        this.sufix = sufix;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}