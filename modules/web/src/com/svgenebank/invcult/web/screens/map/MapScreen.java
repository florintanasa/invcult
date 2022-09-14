package com.svgenebank.invcult.web.screens.map;

import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.VBoxLayout;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.web.gui.components.WebComponentsHelper;
import com.svgenebank.invcult.entity.InvcultView;
import com.vaadin.ui.Layout;
import com.vaadin.server.Resource;
import com.vaadin.ui.Component;
import com.vaadin.ui.Notification;
import org.vaadin.addon.leaflet.*;
import org.vaadin.addon.leaflet.shared.Point;
import org.vaadin.addon.leaflet.shared.PopupState;

import javax.inject.Inject;

@UiController("invcult_MapScreen")
@UiDescriptor("map-screen.xml")
@LookupComponent("invcultViewsTable")
@LoadDataBeforeShow
public class MapScreen extends StandardLookup<InvcultView> {
    private static final double DEFAULT_LATITUDE = 46.009628;
    private  static final double DEFAULT_LONGITUDE = 24.456255;
    private static final double ZOOM_SNAP = 0.25;
    private static final double ZOOM_DELTA = 0.25;
    private static final double ZOOM_LEVEL =7.5;

    private LMap map;
    private LLayerGroup localityMarkers;
    private PopupState popupState;
    @Inject
    private VBoxLayout mapContainer;
    @Inject
    private CollectionContainer<InvcultView> invcultViewsDc;
    @Inject
    private Button showOnMap;



    @Subscribe
    protected void onInit(InitEvent event) {
        localityMarkers = new LLayerGroup();
        popupState = createPopupState();
        initMap();
 //       drawCenterMark();
        addMapToContainer();

    }
    /**
     * Creates the map.
     * Sets default center of the map and defaults zoom levels.
     * Adds a layer that uses OSM tiles.
     */
    private void initMap() {
        map = new LMap();
        map.setZoomDelta(ZOOM_DELTA);
        map.setZoomSnap(ZOOM_SNAP);
        map.setZoomLevel(ZOOM_LEVEL);
        map.addLayer(new LOpenStreetMapLayer());
        map.setCenter(new Point(DEFAULT_LATITUDE, DEFAULT_LONGITUDE));
    }

    /**
     * Creates addMapToContainer method for add Map component in vbox container
     */
    private void addMapToContainer() {
        Layout layout = (Layout) WebComponentsHelper.unwrap(mapContainer);
        layout.addComponent(map);
    }

    /**
     * Creates drawCenterMark this method is used for me on the test
     */
    private void drawCenterMark() {
        Point centerMap = new Point(DEFAULT_LATITUDE,DEFAULT_LONGITUDE);
        LMarker centerMarker = new LMarker(centerMap);
        centerMarker.setPopup("Punctul de centrare a hărții");
        centerMarker.openPopup();
        centerMarker.setPopupState(popupState);
        map.addComponent(centerMarker);
    }

    /**
     * Creates createPopupState that method set the {@link PopupState} for the markers
     * @return popupState
     */
    private PopupState createPopupState() {
        PopupState popupState = new PopupState();
        popupState.autoClose = false;
        popupState.closeOnClick = false;
        return popupState;
    }
    /**
     * Creates localityMarkers that contains map layers (markers in our case) to handle them as one in our code.
     * Refreshes invcultview DataContainer.
     * For each Salesperson creates the marker that will be added to the personMarkers.
     * Finally adds personMarkers to the map.
     */

    public void drawLocalityMarkers() {
        map.removeComponent(localityMarkers);
        localityMarkers = new LLayerGroup();

        for (InvcultView locality : invcultViewsDc.getItems()) {
            LMarker localityMarker = createLocalityMarker(locality);
            localityMarkers.addComponent(localityMarker);
        }
        map.addComponent(localityMarkers);
    }

    /**
     * Creates marker for the passed to the method InvcultView.
     * Sets popup ?
     *
     * @param locality InvcultView passed to the method
     * @return Localities marker that represents it's location
     */
    private LMarker createLocalityMarker(InvcultView locality) {
        Point localityLocation = new Point(locality.getLatitudine(), locality.getLongitudine());
        LMarker localityMarker = new LMarker(localityLocation);
        localityMarker.setPopup(locality.getLocalitateFerma());
        localityMarker.openPopup();
        localityMarker.setPopupState(popupState);

        return localityMarker;
    }
}