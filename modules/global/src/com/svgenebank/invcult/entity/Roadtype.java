package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "INVCULT_ROADTYPE")
@Entity(name = "invcult_Roadtype")
@NamePattern("%s|tipArtera")
public class Roadtype extends StandardEntity {
    private static final long serialVersionUID = 7599014524144322120L;

    @NotNull
    @Column(name = "TIP_ARTERA", nullable = false, unique = true, length = 15)
    private String tipArtera;

    public String getTipArtera() {
        return tipArtera;
    }

    public void setTipArtera(String tipArtera) {
        this.tipArtera = tipArtera;
    }
}