module dk.anzodk.thejavagit {
    requires javafx.controls;
    requires javafx.fxml;

    opens dk.anzodk.thejavagit to javafx.fxml;
    exports dk.anzodk.thejavagit;
}
