package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Table(name = "INVCULT_MOTFARMER")
@Entity(name = "invcult_Motfarmer")
@NamePattern("%s|name")
public class Motfarmer extends StandardEntity {
    private static final long serialVersionUID = -7041165197888314875L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;
    @JoinTable(name = "INVCULT_INVENTORY_MOTFARMER_LINK",
            joinColumns = @JoinColumn(name = "MOTFARMER_ID"),
            inverseJoinColumns = @JoinColumn(name = "INVENTORY_ID"))
    @ManyToMany
    private Set<Inventory> inventories;

    public Set<Inventory> getInventories() {
        return inventories;
    }

    public void setInventories(Set<Inventory> inventories) {
        this.inventories = inventories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}