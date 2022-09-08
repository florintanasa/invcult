package com.svgenebank.invcult.web.screens.localitysiruta;

import com.haulmont.cuba.gui.components.VBoxLayout;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.web.gui.components.WebComponentsHelper;
import com.svgenebank.invcult.entity.Localitysiruta;
import com.vaadin.ui.Layout;
import org.vaadin.addon.leaflet.LLayerGroup;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.LMarker;
import org.vaadin.addon.leaflet.LOpenStreetMapLayer;
import org.vaadin.addon.leaflet.shared.Point;

import javax.inject.Inject;

@UiController("invcult_Localitysiruta.edit")
@UiDescriptor("localitysiruta-edit.xml")
@EditedEntityContainer("localitysirutaDc")
@LoadDataBeforeShow
public class LocalitysirutaEdit extends StandardEditor<Localitysiruta> {
    private static final double DEFAULT_LATITUDE = 46.009628;
    private  static final double DEFAULT_LONGITUDE = 24.456255;
    private static final double ZOOM_LEVEL =7.0;

    private LMap map = new LMap();
    private LLayerGroup localityMarkers;
    @Inject
    private VBoxLayout mapContainer;

    @Subscribe
    protected void onInit(InitEvent event) {
        initMap();
        drawLocalityMarkers();
        addMapToContainer();
    }

    private void initMap() {
        map = new LMap();
        map.setZoomLevel(ZOOM_LEVEL);
        map.addLayer(new LOpenStreetMapLayer());
        map.setCenter(new Point(DEFAULT_LATITUDE, DEFAULT_LONGITUDE));
    }

    private void addMapToContainer() {
        Layout layout = (Layout) WebComponentsHelper.unwrap(mapContainer);
        layout.addComponent(map);
    }

    private void drawLocalityMarkers() {
        Point localityLocation = new Point(DEFAULT_LATITUDE, DEFAULT_LONGITUDE);
        LMarker localityMarker = new LMarker(localityLocation);
        localityMarker.setPopup("Punctul de cetrare a hărții");
        localityMarker.openPopup();
        localityMarkers = new LLayerGroup();
        localityMarkers.addComponent(localityMarker);
        map.addComponent(localityMarkers);
    }

}