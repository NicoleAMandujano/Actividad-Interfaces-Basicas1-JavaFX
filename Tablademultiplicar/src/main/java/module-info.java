module com.niki.tablas {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.niki.tablas to javafx.fxml;
    exports com.niki.tablas;
}
