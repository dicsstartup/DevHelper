package com.dicsstartup.devhelper.core.util;

import com.dicsstartup.devhelper.App;
import com.dicsstartup.devhelper.core.enums.View;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Didier
 */
public class StageManager {

    private static StageManager instance;
    private Stage primaryStage;
    private final Application application;

    private StageManager(Application application) {
        this.application = application;
    }

    public static StageManager getInstance(Application application) {
        if (instance == null) {
            instance = new StageManager(application);
        }
        return instance;
    }

    public static StageManager getInstance() {
        if (instance == null) {
            throw new IllegalStateException("StageManager has not been initialized. Call getInstance(Application) first.");
        }
        return instance;
    }

    public void setPrimaryStage(Stage stage) {
        this.primaryStage = stage;
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void startApplication() throws IOException {
        this.primaryStage.setScene(new Scene(this.loadFXML(View.LOANDING.getFxmlPath()),600,400));
        this.primaryStage.show();
    }

    private Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(application.getClass().getResource("fxmls/"+fxml + ".fxml"));
        return fxmlLoader.load();
    }
}
