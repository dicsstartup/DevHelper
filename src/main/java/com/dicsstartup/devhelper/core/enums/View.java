package com.dicsstartup.devhelper.core.enums;

/**
 *
 * @author Didier Piracoca
 */
public enum View {
    LOANDING("loanding"),
    LOGIN("login"),
    MAIN("main");
    

    private final String fxmlPath;

    View(String fxmlPath) {
        this.fxmlPath = fxmlPath;
    }

    public String getFxmlPath() {
        return fxmlPath;
    }
}
