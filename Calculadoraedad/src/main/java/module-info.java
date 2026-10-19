module com.niki.edades {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.niki.edades to javafx.fxml;
    exports com.niki.edades;
}
