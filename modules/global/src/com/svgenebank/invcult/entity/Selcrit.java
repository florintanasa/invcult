package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "INVCULT_SELCRIT")
@Entity(name = "invcult_Selcrit")
@NamePattern("%s|name")
public class Selcrit extends StandardEntity {
    private static final long serialVersionUID = -5469914450039509385L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;
    @JoinTable(name = "INVCULT_INVENTORY_SELCRIT_LINK",
            joinColumns = @JoinColumn(name = "SELCRIT_ID"),
            inverseJoinColumns = @JoinColumn(name = "INVENTORY_ID"))
    @ManyToMany
    private List<Inventory> inventoriesselcrit;

    public List<Inventory> getInventoriesselcrit() {
        return inventoriesselcrit;
    }

    public void setInventoriesselcrit(List<Inventory> inventoriesselcrit) {
        this.inventoriesselcrit = inventoriesselcrit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}