package com.OPD.view;

import java.util.ResourceBundle;

public enum FxmlView {
    MAIN{
        @Override
        String getTitle() {
            return getStringFromResourceBundle("main.app.title");
        }

        @Override
        String getFxmlFile() {
            return "/fxml/Main.fxml";
        }
    },
    LOGIN {
        @Override
        String getTitle() {
            return getStringFromResourceBundle("login.title");
        }

        @Override
        String getFxmlFile() {
            return "/fxml/Login.fxml";
        }
    },
    DASHBOARD {
        @Override
        String getTitle() {
            return getStringFromResourceBundle("dashboard.title");
        }

        @Override
        String getFxmlFile() {
            return "/fxml/Dashboard.fxml";
        }
    };
    abstract String getTitle();
    abstract String getFxmlFile();
    String getStringFromResourceBundle(String key){
        return ResourceBundle.getBundle("Bundle").getString(key);
    }
}
