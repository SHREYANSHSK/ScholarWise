module com.scholarwise.scholarwise {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires java.sql;
    requires java.prefs;



    opens com.scholarwise.scholarwise to javafx.fxml;
    exports com.scholarwise.scholarwise;
}