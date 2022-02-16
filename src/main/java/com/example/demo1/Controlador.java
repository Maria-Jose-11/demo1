package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class Controlador {


    @FXML
    private AnchorPane anchopa


    @FXML
    private Button boton1;

    @FXML
    private Button boton2;

    @FXML
    private Label labelnombre;

    @FXML
    private Label labeltitle;

    @FXML
    void cambiar1(ActionEvent event) {

        anchopanel.getStylesheets().add(getClass().getResource("/estilo1.css").toExternalForm());
    }

    @FXML
    void cambiar2(ActionEvent event) {
        anchopanel.getStylesheets().add(getClass().getResource("/estilo2.css").toExternalForm());

    }

}