package com.niki.edades;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    
    @FXML
    private TextField txtFecha;

    @FXML
    private Label lblResultado;

    @FXML
    private void calcular(ActionEvent event) {
        try {
            String texto = txtFecha.getText().trim();

            if (texto.isEmpty()) {
                lblResultado.setText("Ingresar fecha");
                return;
            }

            String[] partes = texto.split("/");
            if (partes.length != 3) {
                lblResultado.setText("Use dd/mm/aaaa");
                return;
            }

            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int anio = Integer.parseInt(partes[2]);

            LocalDate nacimiento = LocalDate.of(anio, mes, dia);
            LocalDate hoy = LocalDate.now();

            if (nacimiento.isAfter(hoy)) {
                lblResultado.setText("La fecha no puede ser futura.");
                return;
            }

            Period edad = Period.between(nacimiento, hoy);

            lblResultado.setText("Tiene " + edad.getYears() + " años con "
                    + edad.getMonths() + " meses");

        } catch (NumberFormatException | DateTimeException e) {
            
            lblResultado.setText("Fecha o números no válidos");
        }
    }

    @FXML
    private void limpiar(ActionEvent event) {
        txtFecha.clear();
        lblResultado.setText("");
        txtFecha.requestFocus();
    }
}