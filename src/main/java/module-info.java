module com.client.broadcastmessengerclient {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.client.broadcastmessengerclient to javafx.fxml;
    exports com.client.broadcastmessengerclient;
}