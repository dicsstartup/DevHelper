module com.dicsstartup.devhelper {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dicsstartup.devhelper to javafx.fxml;
    exports com.dicsstartup.devhelper;
}
