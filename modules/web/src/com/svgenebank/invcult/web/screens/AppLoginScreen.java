package com.svgenebank.invcult.web.screens;

import com.haulmont.cuba.gui.Route;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.web.app.login.LoginScreen;
import com.haulmont.cuba.web.gui.screen.ScreenDependencyUtils;
import com.vaadin.ui.Dependency;
import javax.inject.Inject;


@Route(path = "login", root = true)
@UiController("loginApp")
@UiDescriptor("app-login-screen.xml")
public class AppLoginScreen extends LoginScreen {

    @Inject
    protected HBoxLayout bottomPanel;

    @Inject
    protected Label<String> poweredByLink;

    @Subscribe
    public void onAppLoginScreenInit(InitEvent event) {
        loadStyles();
        poweredByLink.setStyleName("");
        poweredByLink.setDescription("Banca de Resurse Genetice Vegetale \"Mihai Cristea\" Suceava");
        poweredByLink.setValue("<p>&nbsp;&nbsp;Created by: <b>Florin Tanasă</b> " +
                "for <a href=https://svgenebank.ro><b>Genebank</b></a></p>");
        poweredByLink.setHtmlEnabled(true);
        initBottomPanel();
    }

    @Subscribe("submit")
    public void onSubmit(Action.ActionPerformedEvent event) {
        login();
    }

    protected void loadStyles() {
        ScreenDependencyUtils.addScreenDependency(this,
                "vaadin://brand-login-screen/login.css", Dependency.Type.STYLESHEET);
    }

    protected void initBottomPanel() {
        if (!globalConfig.getLocaleSelectVisible()) {
            poweredByLink.setAlignment(Component.Alignment.MIDDLE_CENTER);

            if (!webConfig.getLoginDialogPoweredByLinkVisible()) {
                bottomPanel.setVisible(false);
            }
        }
    }

    @Override
    protected void initLogoImage() {
        logoImage.setSource(RelativePathResource.class)
                .setPath("VAADIN/brand-login-screen/svbrgv-icon-login.svg");
    }
}