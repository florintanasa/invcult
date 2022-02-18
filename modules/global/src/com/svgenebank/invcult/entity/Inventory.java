package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@Table(name = "INVCULT_INVENTORY")
@Entity(name = "invcult_Inventory")
@NamePattern("%s|nrinv")
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
    @JoinColumn(name = "ID_LOCINV_ID")
    @NotNull
    private Localitysiruta idLocinv;

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
    @JoinColumn(name = "ID_LOCFERMA_ID")
    private Location idLocferma;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CROPS_ID")
    private Crops idCrops;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SYSAGR_ID")
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    private Sysagr idSysagr;

    @NotNull
    @Column(name = "ISLOCPOP", nullable = false)
    private Boolean islocpop = false;

    @JoinTable(name = "INVCULT_INVENTORY_MOTFARMER_LINK",
            joinColumns = @JoinColumn(name = "INVENTORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "MOTFARMER_ID"))
    @ManyToMany
    private Set<Motfarmer> idMotfarmer;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_OLDVAR_ID")
    private Oldvar idOldvar;

    @JoinTable(name = "INVCULT_INVENTORY_PROCSEEDS_LINK",
            joinColumns = @JoinColumn(name = "INVENTORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "PROCSEEDS_ID"))
    @ManyToMany
    private Set<Procseeds> idProcseeds;

    @JoinTable(name = "INVCULT_INVENTORY_SELCRIT_LINK",
            joinColumns = @JoinColumn(name = "INVENTORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "SELCRIT_ID"))
    @ManyToMany
    private Set<Selcrit> idSelcrit;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CULTMET_ID")
    private Cultmet idCultmet;

    @Column(name = "ISCULTROT")
    private Boolean iscultrot = false;

    @Column(name = "ISFERT")
    private Boolean isfert = false;

    @Column(name = "ISTREATY")
    private Boolean istreaty;

    @Column(name = "ISSPRAYER")
    private Boolean issprayer = false;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DRYPLACE_ID")
    private Dryplace idDryplace;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STORPLACE_ID")
    private Storplace idStorplace;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PRESFORM_ID")
    private Presform idPresform;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STORCONT_ID")
    private Storcont idStorcont;

    @JoinTable(name = "INVCULT_INVENTORY_PARTPLANT_LINK",
            joinColumns = @JoinColumn(name = "INVENTORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "PARTPLANT_ID"))
    @ManyToMany
    private Set<Partplant> idPartplant;

    @JoinTable(name = "INVCULT_INVENTORY_USEPOPLOC_LINK",
            joinColumns = @JoinColumn(name = "INVENTORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "USEPOPLOC_ID"))
    @ManyToMany
    private Set<Usepoploc> idUsepoploc;

    @Lob
    @Column(name = "REMARKS")
    private String remarks;

    public Crops getIdCrops() {
        return idCrops;
    }

    public void setIdCrops(Crops idCrops) {
        this.idCrops = idCrops;
    }

    public void setIstreaty(Boolean istreaty) {
        this.istreaty = istreaty;
    }

    public Boolean getIstreaty() {
        return istreaty;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Set<Usepoploc> getIdUsepoploc() {
        return idUsepoploc;
    }

    public void setIdUsepoploc(Set<Usepoploc> idUsepoploc) {
        this.idUsepoploc = idUsepoploc;
    }

    public Set<Partplant> getIdPartplant() {
        return idPartplant;
    }

    public void setIdPartplant(Set<Partplant> idPartplant) {
        this.idPartplant = idPartplant;
    }

    public Storcont getIdStorcont() {
        return idStorcont;
    }

    public void setIdStorcont(Storcont idStorcont) {
        this.idStorcont = idStorcont;
    }

    public Presform getIdPresform() {
        return idPresform;
    }

    public void setIdPresform(Presform idPresform) {
        this.idPresform = idPresform;
    }

    public Storplace getIdStorplace() {
        return idStorplace;
    }

    public void setIdStorplace(Storplace idStorplace) {
        this.idStorplace = idStorplace;
    }

    public Dryplace getIdDryplace() {
        return idDryplace;
    }

    public void setIdDryplace(Dryplace idDryplace) {
        this.idDryplace = idDryplace;
    }

    public Boolean getIssprayer() {
        return issprayer;
    }

    public void setIssprayer(Boolean issprayer) {
        this.issprayer = issprayer;
    }

    public Boolean getIsfert() {
        return isfert;
    }

    public void setIsfert(Boolean isfert) {
        this.isfert = isfert;
    }

    public Boolean getIscultrot() {
        return iscultrot;
    }

    public void setIscultrot(Boolean iscultrot) {
        this.iscultrot = iscultrot;
    }

    public Cultmet getIdCultmet() {
        return idCultmet;
    }

    public void setIdCultmet(Cultmet idCultmet) {
        this.idCultmet = idCultmet;
    }

    public Set<Selcrit> getIdSelcrit() {
        return idSelcrit;
    }

    public void setIdSelcrit(Set<Selcrit> idSelcrit) {
        this.idSelcrit = idSelcrit;
    }

    public Set<Procseeds> getIdProcseeds() {
        return idProcseeds;
    }

    public void setIdProcseeds(Set<Procseeds> idProcseeds) {
        this.idProcseeds = idProcseeds;
    }

    public Oldvar getIdOldvar() {
        return idOldvar;
    }

    public void setIdOldvar(Oldvar idOldvar) {
        this.idOldvar = idOldvar;
    }

    public Set<Motfarmer> getIdMotfarmer() {
        return idMotfarmer;
    }

    public void setIdMotfarmer(Set<Motfarmer> idMotfarmer) {
        this.idMotfarmer = idMotfarmer;
    }

    public Boolean getIslocpop() {
        return islocpop;
    }

    public void setIslocpop(Boolean islocpop) {
        this.islocpop = islocpop;
    }

    public Sysagr getIdSysagr() {
        return idSysagr;
    }

    public void setIdSysagr(Sysagr idSysagr) {
        this.idSysagr = idSysagr;
    }

    public void setAlttitudine(Integer alttitudine) {
        this.alttitudine = alttitudine;
    }

    public Integer getAlttitudine() {
        return alttitudine;
    }

    public void setIdLocinv(Localitysiruta idLocinv) {
        this.idLocinv = idLocinv;
    }

    public Localitysiruta getIdLocinv() {
        return idLocinv;
    }

    public Location getIdLocferma() {
        return idLocferma;
    }

    public void setIdLocferma(Location idLocferma) {
        this.idLocferma = idLocferma;
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