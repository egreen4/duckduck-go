package edu.unca.csci;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class DuckDuckGoController implements Initializable {
    @FXML
    private DoubleProperty xCoordinate;

    @FXML
    private DoubleProperty yCoordinate;

    public DuckDuckGoController() {
        xCoordinate = new SimpleDoubleProperty(100.0);
        yCoordinate = new SimpleDoubleProperty(400.0);
    }

    public void setXCoordinate(double value) {
        xCoordinate.set(value);
    }

    public double getXCoordinate() {
        return xCoordinate.get();
    }

    public void setYCoordinate(double value) {
        yCoordinate.set(value);
    }

    public double getYCoordinate() {
        return yCoordinate.get();
    }

    public DoubleProperty xCoordinateProperty() {
        return xCoordinate;
    }

    public DoubleProperty yCoordinateProperty() {
        return yCoordinate;
    }

    @Override
    public void initialize(URL url, ResourceBundle bundle) {

    }
}
