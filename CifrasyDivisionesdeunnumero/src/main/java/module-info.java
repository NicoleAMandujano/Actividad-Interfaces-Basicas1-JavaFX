module com.niki.numeros {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.niki.numeros to javafx.fxml;
    exports com.niki.numeros;
}
