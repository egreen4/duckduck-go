package edu.unca.csci;

import java.io.File;
import java.nio.file.Paths;

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
        // var root = FXMLLoader.load(getClass().getClassLoader().getResource("duckduck_go.fxml"));
        var root = FXMLLoader.load(Paths.get("./src/main/java/edu/unca/csci/duckduck_go.fxml").toUri().toURL());

        primaryStage.setTitle("DuckDuckGo");
        primaryStage.setScene(new Scene((Parent)root, width, height));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
