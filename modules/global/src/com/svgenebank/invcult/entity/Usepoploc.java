package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "INVCULT_USEPOPLOC")
@Entity(name = "invcult_Usepoploc")
@NamePattern("%s|name")
public class Usepoploc extends StandardEntity {
    private static final long serialVersionUID = -3035025777479816319L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;
    @JoinTable(name = "INVCULT_INVENTORY_USEPOPLOC_LINK",
            joinColumns = @JoinColumn(name = "USEPOPLOC_ID"),
            inverseJoinColumns = @JoinColumn(name = "INVENTORY_ID"))
    @ManyToMany
    private List<Inventory> inventoriesusepoploc;

    public List<Inventory> getInventoriesusepoploc() {
        return inventoriesusepoploc;
    }

    public void setInventoriesusepoploc(List<Inventory> inventoriesusepoploc) {
        this.inventoriesusepoploc = inventoriesusepoploc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}