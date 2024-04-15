package com.example.polimorfismo_poo.Controllers;

import com.example.polimorfismo_poo.Models.*;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class FormsViewController {

    @FXML
    private ListView<String> tblBase1;

    @FXML
    private ListView<String> tblBase2;

    @FXML
    private ListView<String> tblBase3;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;
    private DataBase1 baseDatos1 = new DataBase1();
    private DataBase2 baseDatos2 = new DataBase2();
    private DataBase3 baseDatos3 = new DataBase3();

    @FXML
    void btnActualizarBase1(MouseEvent event) {
        if (tblBase1 != null && baseDatos1 != null) {
            String nombre = txtNombre.getText();
            String edadStr = txtEdad.getText();
            Students studentActualizado = new Students(nombre, Integer.parseInt(edadStr));

            actualizarTabla(tblBase1, baseDatos1, studentActualizado);
        } else {
            System.out.println("tblBase1 o baseDatos1 es nulo.");
        }
    }

    @FXML
    void btnActualizarBase2(MouseEvent event) {
        if (tblBase2 != null && baseDatos2 != null) {
            String nombre = txtNombre.getText();
            String edadStr = txtEdad.getText();
            Students studentActualizado = new Students(nombre, Integer.parseInt(edadStr));

            actualizarTabla(tblBase2, baseDatos2, studentActualizado);
        } else {
            System.out.println("tblBase2 o baseDatos2 es nulo.");
        }
    }

    @FXML
    void btnActualizarBase3(MouseEvent event) {
        if (tblBase3 != null && baseDatos3 != null) {
            String nombre = txtNombre.getText();
            String edadStr = txtEdad.getText();
            Students studentActualizado = new Students(nombre, Integer.parseInt(edadStr));

            actualizarTabla(tblBase3, baseDatos3, studentActualizado);
        } else {
            System.out.println("tblBase3 o baseDatos3 es nulo.");
        }
    }
    private void actualizarTabla(ListView<String> tabla, StudenManagment baseDatos, Students studentActualizado) {
        if (tabla != null && baseDatos != null && studentActualizado != null) {
            baseDatos.actualizar(studentActualizado);
            ArrayList<Students> estudiantes = baseDatos.getStudents();
            tabla.getItems().clear();
            for (Students s : estudiantes) {
                tabla.getItems().add(s.getNombre() + " - " + s.getEdad());
            }
        } else {
            System.out.println("tabla, baseDatos o studentActualizado es nulo.");
        }
    }
    @FXML
    void btnGuardar(MouseEvent event) {
        String nombre = txtNombre.getText();
        String edad1 = txtEdad.getText();

        if (nombre.isEmpty()) {
            System.out.println("El campo de nombre está vacío.");
            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setTitle("El campo de nombre está vacío.");
            alerta.setHeaderText("Favor de llenar el campo");
            alerta.showAndWait();
            return;
        }
        if (edad1.isEmpty()) {
            System.out.println("El campo de edad está vacío.");
            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setTitle("El campo de edad está vacío.");
            alerta.setHeaderText("Favor de llenar el campo");
            alerta.showAndWait();
            return;
        }
        if (!edad1.matches("\\d+")) {
            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setTitle("El campo de edad debe contener solo números.");
            alerta.setHeaderText("Favor de usar numeros");
            alerta.showAndWait();
            return;
        }
        Integer edad = Integer.parseInt(edad1);
        Students newStudent = new Students(nombre, edad);


        baseDatos1.guardar(newStudent);
        baseDatos2.guardar(newStudent);
        baseDatos3.guardar(newStudent);
        System.out.println(newStudent);

    }
}
