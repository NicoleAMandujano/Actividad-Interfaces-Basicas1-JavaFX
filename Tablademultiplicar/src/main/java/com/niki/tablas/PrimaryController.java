package com.niki.tablas;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtNumero;

    @FXML
    private TextArea txtTabla;

    @FXML
    private void calcular(ActionEvent event) {
        int numero = Integer.parseInt(txtNumero.getText().trim());
        String tabla = "";

        for (int i = 1; i <= 10; i++) {
            tabla = tabla + numero + "x" + i + " = " + (numero * i) + "\n";
        }

        txtTabla.setText(tabla);
    }

    @FXML
    private void limpiar(ActionEvent event) {
        txtNumero.clear();
        txtTabla.clear();
        txtNumero.requestFocus();
    }
}

