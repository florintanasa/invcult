package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "INVCULT_PROCSEEDS")
@Entity(name = "invcult_Procseeds")
@NamePattern("%s|name")
public class Procseeds extends StandardEntity {
    private static final long serialVersionUID = 1035887030601003663L;

    @Column(name = "NAME", nullable = false, unique = true)
    @NotNull
    private String name;
    @JoinTable(name = "INVCULT_INVENTORY_PROCSEEDS_LINK",
            joinColumns = @JoinColumn(name = "PROCSEEDS_ID"),
            inverseJoinColumns = @JoinColumn(name = "INVENTORY_ID"))
    @ManyToMany
    private List<Inventory> inventoriesprocseeds;

    public List<Inventory> getInventoriesprocseeds() {
        return inventoriesprocseeds;
    }

    public void setInventoriesprocseeds(List<Inventory> inventoriesprocseeds) {
        this.inventoriesprocseeds = inventoriesprocseeds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}