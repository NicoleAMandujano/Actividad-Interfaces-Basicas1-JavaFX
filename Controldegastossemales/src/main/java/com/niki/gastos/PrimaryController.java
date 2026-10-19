package com.niki.gastos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtAlimentacion;
    @FXML private TextField txtRefrigerios;
    @FXML private TextField txtTransporte;
    @FXML private TextField txtTelefonia;
    @FXML private TextField txtOtros;
    @FXML private TextField txtTotal;
    @FXML private TextField txtMayor;

    @FXML
    private void calcular(ActionEvent event) {

        int alimentacion = Integer.parseInt(txtAlimentacion.getText().trim());
        int refrigerios  = Integer.parseInt(txtRefrigerios.getText().trim());
        int transporte   = Integer.parseInt(txtTransporte.getText().trim());
        int telefonia    = Integer.parseInt(txtTelefonia.getText().trim());
        int otros        = Integer.parseInt(txtOtros.getText().trim());

    
        int total = alimentacion + refrigerios + transporte + telefonia + otros;

       
        int mayor = alimentacion;
        String nombreMayor = "Alimentación";

        if (refrigerios > mayor) {
            mayor = refrigerios;
            nombreMayor = "Refrigerios";
        }
        if (transporte > mayor) {
            mayor = transporte;
            nombreMayor = "Transporte";
        }
        if (telefonia > mayor) {
            mayor = telefonia;
            nombreMayor = "Telefonia";
        }
        if (otros > mayor) {
            mayor = otros;
            nombreMayor = "Otros";
        }

      
        txtTotal.setText(String.valueOf(total));
        txtMayor.setText(nombreMayor);
    }

    @FXML
    private void limpiar(ActionEvent event) {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        txtTotal.clear();
        txtMayor.clear();
        txtAlimentacion.requestFocus();
    }
}

