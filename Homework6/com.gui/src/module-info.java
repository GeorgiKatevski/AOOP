module com.gui {
    requires com.providers;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    opens gui to javafx.fxml;
    exports gui;
}