package com.niki.billetes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtDinero;

    @FXML
    private TextArea txtDenominaciones;

    @FXML
    private TextArea txtCantidades;

   
    private int[] valores = {500, 200, 100, 50, 20, 10, 5, 2, 1};

    
    private String[] nombres = {
        "Billetes de $500", "Billetes de $200", "Billetes de $100",
        "Billetes de $50", "Billetes de $20", "Monedas de $10",
        "Monedas de $5", "Monedas de $2", "Monedas de $1"
    };

    
    @FXML
    public void initialize() {
        String texto = "";
        for (int i = 0; i < nombres.length; i++) {
            texto = texto + nombres[i] + "\n";
        }
        txtDenominaciones.setText(texto);
    }

    @FXML
    private void desglosar(ActionEvent event) {
        int dinero = Integer.parseInt(txtDinero.getText().trim());
        String resultado = "";

        for (int i = 0; i < valores.length; i++) {
            
            int cantidad = dinero / valores[i];
          
            dinero = dinero % valores[i];

            resultado = resultado + cantidad + "\n";
        }

        txtCantidades.setText(resultado);
    }

    @FXML
    private void limpiar(ActionEvent event) {
        txtDinero.clear();
        txtCantidades.clear();
        txtDinero.requestFocus();
    }
}
