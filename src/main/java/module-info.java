module com.niki.billetes {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.niki.billetes to javafx.fxml;
    exports com.niki.billetes;
}
