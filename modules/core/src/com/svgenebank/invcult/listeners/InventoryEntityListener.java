package com.svgenebank.invcult.listeners;

import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.app.UniqueNumbersService;
import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.svgenebank.invcult.entity.Inventory;

import javax.inject.Inject;

@Component("invcult_InventoryEntityListener")
public class InventoryEntityListener implements BeforeInsertEntityListener<Inventory>{
    @Inject
    private UniqueNumbersService unService;
    @Override
    public void onBeforeInsert(Inventory entity, EntityManager entityManager){
        entity.setNrinv(String.valueOf((int) unService.getNextNumber("NrNrinv")));
    }
}
