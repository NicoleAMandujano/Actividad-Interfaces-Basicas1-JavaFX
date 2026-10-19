module com.niki.gastos {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.niki.gastos to javafx.fxml;
    exports com.niki.gastos;
}
