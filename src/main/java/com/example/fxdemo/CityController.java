package com.example.fxdemo;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CityController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField city_name_field;

    @FXML
    private ImageView imageButtonHome;

    @FXML
    private Button nextMoveButton;

    @FXML
    void initialize() {
        nextMoveButton.setOnAction(event -> {
            String cityName = city_name_field.getText();
            System.out.println("Ви обрали місто: " + cityName);
        });
    }
}


