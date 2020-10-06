package edu.unca.csci;

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
        // Load the root UI FXML file from a path relative to the root directory.
        var root = FXMLLoader.load(Paths.get("./src/main/java/edu/unca/csci/duckduck_go.fxml").toUri().toURL());

        // Set the title and size of the new window.
        primaryStage.setTitle("DuckDuckGo");
        primaryStage.setScene(new Scene((Parent)root, width, height));

        // Open the new window.
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
