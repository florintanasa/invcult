package com.svgenebank.invcult.web.screens.map;

import com.haulmont.cuba.gui.components.VBoxLayout;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.cuba.web.gui.components.WebComponentsHelper;
import com.vaadin.ui.Layout;
import com.vaadin.server.Resource;
import com.vaadin.ui.Component;
import org.vaadin.addon.leaflet.LLayerGroup;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.LMarker;
import org.vaadin.addon.leaflet.LOpenStreetMapLayer;
import org.vaadin.addon.leaflet.shared.Point;

import javax.inject.Inject;

@UiController("invcult_MapScreen")
@UiDescriptor("map-screen.xml")
public class MapScreen extends Screen {
    private static final double DEFAULT_LATITUDE = 46.009628;
    private  static final double DEFAULT_LONGITUDE = 24.456255;
    private static final double ZOOM_LEVEL =7.0;

    private LMap map;
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
        localityMarkers = new LLayerGroup();
        localityMarkers.addComponent(localityMarker);
        map.addComponent(localityMarkers);
    }
}