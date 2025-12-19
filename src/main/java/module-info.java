module com.ykatsatos.hashMaster {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    // Add other required modules

    opens com.ykatsatos.hashmaster to javafx.fxml;
    exports com.ykatsatos.hashmaster;
}