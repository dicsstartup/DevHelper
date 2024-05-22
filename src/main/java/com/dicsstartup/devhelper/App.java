package com.dicsstartup.devhelper;

import com.dicsstartup.devhelper.core.util.HibernateUtil;
import com.dicsstartup.devhelper.core.util.StageManager;
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.image.Image;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void init() throws Exception {
        HibernateUtil.getInstance();
    }

    @Override
    public void start(Stage stage) throws IOException {
        StageManager stageManager = StageManager.getInstance(this);
        stageManager.setPrimaryStage(stage);
        stageManager.getPrimaryStage().setTitle("DevHelper");
        stageManager.getPrimaryStage().setResizable(false);
        Image icon = new Image(getClass().getResourceAsStream("images/logo.png"));
        stageManager.getPrimaryStage().getIcons().add(icon);
        stageManager.startApplication();
    }

    @Override
    public void stop() throws Exception {
        HibernateUtil.getInstance().shutdown();
    }

    public static void main(String[] args) {
        launch();
    }
}
