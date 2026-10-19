package com.niki.numeros;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private TextField txtCantidad;
    @FXML private TextField txtSumaImpares;
    @FXML private TextField txtSumaPares;
    @FXML private TextField txtSumaTotal;
    @FXML private TextField txtMayor;
    @FXML private TextField txtMenor;
    @FXML private TextArea txtDivisores;

    @FXML
    private void analizar(ActionEvent event) {
        int numero = Integer.parseInt(txtNumero.getText().trim());

        int cantidad = 0;
        int sumaImpares = 0;
        int sumaPares = 0;
        int mayor = 0;   
        int menor = 9;   

   
        int temporal = numero;
        while (temporal > 0) {
            int cifra = temporal % 10;
            cantidad++;

            if (cifra % 2 == 0) {
                sumaPares = sumaPares + cifra;
            } else {
                sumaImpares = sumaImpares + cifra;
            }

            if (cifra > mayor) {
                mayor = cifra;
            }
            if (cifra < menor) {
                menor = cifra;
            }

            temporal = temporal / 10;
        }

        int sumaTotal = sumaPares + sumaImpares;

        txtCantidad.setText(String.valueOf(cantidad));
        txtSumaImpares.setText(String.valueOf(sumaImpares));
        txtSumaPares.setText(String.valueOf(sumaPares));
        txtSumaTotal.setText(String.valueOf(sumaTotal));
        txtMayor.setText(String.valueOf(mayor));
        txtMenor.setText(String.valueOf(menor));

       
        String divisores = "";
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores = divisores + i + "\n";
            }
        }
        txtDivisores.setText(divisores);
    }

    @FXML
    private void limpiar(ActionEvent event) {
        txtNumero.clear();
        txtCantidad.clear();
        txtSumaImpares.clear();
        txtSumaPares.clear();
        txtSumaTotal.clear();
        txtMayor.clear();
        txtMenor.clear();
        txtDivisores.clear();
        txtNumero.requestFocus();
    }
}


