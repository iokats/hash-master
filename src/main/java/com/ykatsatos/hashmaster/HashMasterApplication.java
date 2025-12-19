package com.ykatsatos.hashmaster;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HashMasterApplication extends Application {

    private static final String TITLE = "Hash Master";
    private static final String VIEW_FXML = "hashmaster-view.fxml";

    private HashMasterController controller;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HashMasterApplication.class.getResource(VIEW_FXML));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        controller = fxmlLoader.getController();

        stage.setTitle(TITLE);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {

        if (controller != null) {

            controller.dispose();
        }
    }
}
