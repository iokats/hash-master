module com.ykatsatos.verifile {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    // Add other required modules

    opens com.ykatsatos.verifile to javafx.fxml;
    exports com.ykatsatos.verifile;
}