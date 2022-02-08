package com.svgenebank.invcult.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "INVCULT_INVENTORY")
@Entity(name = "invcult_Inventory")
public class Inventory extends StandardEntity {
    private static final long serialVersionUID = -8473156254655345865L;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_", nullable = false)
    private Date date;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PERSONS_ID")
    private Persons idPersons;

    @Column(name = "NRINV", length = 50)
    private String nrinv;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LOCINV_ID")
    @NotNull
    private Localitysiruta locinv;

    @Column(name = "LATITUDINE", length = 50)
    private String latitudine;

    @Column(name = "LONGITUDINE", length = 50)
    private String longitudine;

    @Column(name = "ALTTITUDINE")
    private Integer alttitudine;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_FARMERS_ID")
    private Farmers idFarmers;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LOCFERMA_ID")
    private Location locferma;

    public void setAlttitudine(Integer alttitudine) {
        this.alttitudine = alttitudine;
    }

    public Integer getAlttitudine() {
        return alttitudine;
    }

    public void setLocinv(Localitysiruta locinv) {
        this.locinv = locinv;
    }

    public Localitysiruta getLocinv() {
        return locinv;
    }

    public Location getLocferma() {
        return locferma;
    }

    public void setLocferma(Location locferma) {
        this.locferma = locferma;
    }

    public Farmers getIdFarmers() {
        return idFarmers;
    }

    public void setIdFarmers(Farmers idFarmers) {
        this.idFarmers = idFarmers;
    }

    public String getLongitudine() {
        return longitudine;
    }

    public void setLongitudine(String longitudine) {
        this.longitudine = longitudine;
    }

    public String getLatitudine() {
        return latitudine;
    }

    public void setLatitudine(String latitudine) {
        this.latitudine = latitudine;
    }

    public String getNrinv() {
        return nrinv;
    }

    public void setNrinv(String nrinv) {
        this.nrinv = nrinv;
    }

    public Persons getIdPersons() {
        return idPersons;
    }

    public void setIdPersons(Persons idPersons) {
        this.idPersons = idPersons;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}