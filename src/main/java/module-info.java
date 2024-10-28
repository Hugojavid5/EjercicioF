module org.hugo.ejerciciof {
    requires javafx.controls;
    requires javafx.fxml;

    opens Model to javafx.base;
    opens org.hugo.ejerciciof to javafx.fxml;
    exports org.hugo.ejerciciof;
}