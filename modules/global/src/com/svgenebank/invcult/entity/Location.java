package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "INVCULT_LOCATION")
@Entity(name = "invcult_Location")
@NamePattern("%s %s|idStreet,numar")
public class Location extends StandardEntity {
    private static final long serialVersionUID = 4764595626878304243L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_FARMERS_ID")
    private Farmers idFarmers;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_LOCALIRYSIRUTA_ID")
    private Localitysiruta idLocalirysiruta;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ROADTYPE_ID")
    private Roadtype idRoadtype;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STREET_ID")
    private Street idStreet;

    @Column(name = "NUMAR", length = 10)
    private String numar;

    @Column(name = "BLOC", length = 10)
    private String bloc;

    @Column(name = "SCARA", length = 10)
    private String scara;

    @Column(name = "ETAJ", length = 10)
    private String etaj;

    @Column(name = "APARTAMENT", length = 10)
    private String apartament;

    @Column(name = "CODPOSTAL", length = 6)
    private String codpostal;

    @NotNull
    @Column(name = "CORESPONDENTA", nullable = false)
    private Boolean corespondenta = false;

    @NotNull
    @Column(name = "DOMICILIU", nullable = false)
    private Boolean domiciliu = false;

    public Boolean getDomiciliu() {
        return domiciliu;
    }

    public void setDomiciliu(Boolean domiciliu) {
        this.domiciliu = domiciliu;
    }

    public Boolean getCorespondenta() {
        return corespondenta;
    }

    public void setCorespondenta(Boolean corespondenta) {
        this.corespondenta = corespondenta;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getApartament() {
        return apartament;
    }

    public void setApartament(String apartament) {
        this.apartament = apartament;
    }

    public String getEtaj() {
        return etaj;
    }

    public void setEtaj(String etaj) {
        this.etaj = etaj;
    }

    public String getScara() {
        return scara;
    }

    public void setScara(String scara) {
        this.scara = scara;
    }

    public String getBloc() {
        return bloc;
    }

    public void setBloc(String bloc) {
        this.bloc = bloc;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    public Street getIdStreet() {
        return idStreet;
    }

    public void setIdStreet(Street idStreet) {
        this.idStreet = idStreet;
    }

    public Roadtype getIdRoadtype() {
        return idRoadtype;
    }

    public void setIdRoadtype(Roadtype idRoadtype) {
        this.idRoadtype = idRoadtype;
    }

    public Localitysiruta getIdLocalirysiruta() {
        return idLocalirysiruta;
    }

    public void setIdLocalirysiruta(Localitysiruta idLocalirysiruta) {
        this.idLocalirysiruta = idLocalirysiruta;
    }

    public Farmers getIdFarmers() {
        return idFarmers;
    }

    public void setIdFarmers(Farmers idFarmers) {
        this.idFarmers = idFarmers;
    }
}