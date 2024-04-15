package com.example.polimorfismo_poo.Controllers;

import com.example.polimorfismo_poo.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class HomeViewController {
    @FXML
    void btnIniciar(MouseEvent event) throws IOException {
        Stage stage;
        try {
            stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("forms-view.fxml"));
            Pane root1 = fxmlLoader.load();


            Scene scene = new Scene(root1);
            stage.setTitle("Bienvenido");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Node source = (Node) event.getSource();
        stage = (Stage) source.getScene().getWindow();
        stage.close();
    }


}