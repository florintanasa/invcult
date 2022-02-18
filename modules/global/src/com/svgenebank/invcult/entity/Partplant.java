package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "INVCULT_PARTPLANT")
@Entity(name = "invcult_Partplant")
@NamePattern("%s|name")
public class Partplant extends StandardEntity {
    private static final long serialVersionUID = 5806551707962095387L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;
    @JoinTable(name = "INVCULT_INVENTORY_PARTPLANT_LINK",
            joinColumns = @JoinColumn(name = "PARTPLANT_ID"),
            inverseJoinColumns = @JoinColumn(name = "INVENTORY_ID"))
    @ManyToMany
    private List<Inventory> inventoriespartplant;

    public List<Inventory> getInventoriespartplant() {
        return inventoriespartplant;
    }

    public void setInventoriespartplant(List<Inventory> inventoriespartplant) {
        this.inventoriespartplant = inventoriespartplant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}