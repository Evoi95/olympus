module eu.uiniroma2.ing.iswp.olympus {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens eu.uiniroma2.ing.iswp.olympus to javafx.fxml;
    exports eu.uiniroma2.ing.iswp.olympus;
}