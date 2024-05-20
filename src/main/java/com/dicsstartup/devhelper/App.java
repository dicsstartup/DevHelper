package com.dicsstartup.devhelper;

import com.dicsstartup.devhelper.core.entitys.User;
import com.dicsstartup.devhelper.core.service.UserService;
import com.dicsstartup.devhelper.core.util.HibernateUtil;
import jakarta.persistence.EntityManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static EntityManager manager;

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        manager = HibernateUtil.getEntityManagerFactory().createEntityManager();
        UserService userService = new UserService(manager);
        User nuevo = new User();
        nuevo.setNick("didier");
        nuevo.setPassword("password");
        userService.guardar(nuevo);
        User us = userService.buscar(User.class, 1);
        System.out.println(us);
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}
