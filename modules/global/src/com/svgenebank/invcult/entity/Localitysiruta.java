package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "INVCULT_LOCALITYSIRUTA")
@Entity(name = "invcult_Localitysiruta")
@NamePattern("%s %s|name,siruta")
public class Localitysiruta extends StandardEntity {
    private static final long serialVersionUID = 8700738300850734333L;

    @NotNull
    @Column(name = "SIRUTA", nullable = false, unique = true)
    private Integer siruta;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 35)
    private String name;

    @Column(name = "POSTCODE", length = 7)
    private String postcode;

    @Column(name = "SIRUTASUP")
    private Integer sirutasup;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_COUNTYSIRUTA_ID")
    private Countysiruta id_countysiruta;

    @Column(name = "LATITUDE")
    @MetaProperty(datatype = GeoCoordinateDatatype.NAME)
    private Double latitude;

    @Column(name = "LONGITUDE")
    @MetaProperty(datatype = GeoCoordinateDatatype.NAME)
    private Double longitude;

    @Column(name = "ALTITUDE")
    private Integer altitude;

    public Countysiruta getId_countysiruta() {
        return id_countysiruta;
    }

    public void setId_countysiruta(Countysiruta id_countysiruta) {
        this.id_countysiruta = id_countysiruta;
    }

    public Integer getSirutasup() {
        return sirutasup;
    }

    public void setSirutasup(Integer sirutasup) {
        this.sirutasup = sirutasup;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSiruta() {
        return siruta;
    }

    public void setSiruta(Integer siruta) {
        this.siruta = siruta;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }
}