package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "INVCULT_CROPS")
@Entity(name = "invcult_Crops")
@NamePattern("%s|denloc")
public class Crops extends StandardEntity {
    private static final long serialVersionUID = -2730931849958509006L;

    @NotNull
    @Column(name = "DENLOC", nullable = false, length = 50)
    private String denloc;

    @NotNull
    @Column(name = "SPECIA", nullable = false, length = 50)
    private String specia;

    @NotNull
    @Column(name = "GENUL", nullable = false, length = 50)
    private String genul;

    public String getGenul() {
        return genul;
    }

    public void setGenul(String genul) {
        this.genul = genul;
    }

    public String getSpecia() {
        return specia;
    }

    public void setSpecia(String specia) {
        this.specia = specia;
    }

    public String getDenloc() {
        return denloc;
    }

    public void setDenloc(String denloc) {
        this.denloc = denloc;
    }
}