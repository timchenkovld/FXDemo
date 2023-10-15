package com.example.fxdemo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button okButton;

    @FXML
    void initialize() {
        okButton.setOnAction(event -> {
            System.out.println("Ви нажали на кнопку ОК");
            openCityInterface();
        });
    }
    private void openCityInterface() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cities.fxml"));
            Parent cityRoot = fxmlLoader.load();
            Stage stage = (Stage) okButton.getScene().getWindow();
            Scene cityScene = new Scene(cityRoot);
            stage.setScene(cityScene);
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
