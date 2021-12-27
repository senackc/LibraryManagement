module com.example.librarymanagement {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.librarymanagement to javafx.fxml;
    exports com.example.librarymanagement;
}