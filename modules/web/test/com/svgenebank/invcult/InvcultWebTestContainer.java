package com.svgenebank.invcult;

import com.haulmont.cuba.web.testsupport.TestContainer;

import java.util.ArrayList;
import java.util.Arrays;

public class InvcultWebTestContainer extends TestContainer {

    public InvcultWebTestContainer() {
        appComponents = Arrays.asList(
                "com.haulmont.cuba",
                "ro.infoexpert.cuba.translationro",
                "com.haulmont.addon.helium");
        appPropertiesFiles = Arrays.asList(
                // List the files defined in your web.xml
                // in appPropertiesConfig context parameter of the web module
                "com/svgenebank/invcult/web-app.properties",
                // Add this file which is located in CUBA and defines some properties
                // specifically for test environment. You can replace it with your own
                // or add another one in the end.
                "com/haulmont/cuba/web/testsupport/test-web-app.properties"
        );
    }

    public static class Common extends InvcultWebTestContainer {

        // A common singleton instance of the test container which is initialized once for all tests
        public static final InvcultWebTestContainer.Common INSTANCE = new InvcultWebTestContainer.Common();

        private static volatile boolean initialized;

        private Common() {
        }

        @Override
        public void before() throws Throwable {
            if (!initialized) {
                super.before();
                initialized = true;
            }
            setupContext();
        }

        @Override
        public void after() {
            cleanupContext();
            // never stops - do not call super
        }
    }
}