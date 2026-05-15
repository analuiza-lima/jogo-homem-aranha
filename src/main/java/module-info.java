module com.mycompany.homemaranha {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.homemaranha to javafx.fxml;
    exports com.mycompany.homemaranha;
}
