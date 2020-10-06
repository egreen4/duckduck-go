package edu.unca.csci;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DuckDuckGo extends Application {
    private final double width = 800;
    private final double height = 600;

    @Override
    public void start(Stage primaryStage) throws Exception {
        var root = FXMLLoader.load(getClass().getResource("duckduck_go.fxml"));

        primaryStage.setTitle("DuckDuckGo");
        primaryStage.setScene(new Scene((Parent)root, width, height));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
