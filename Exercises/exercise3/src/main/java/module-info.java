module com.example.exercise3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens sample to javafx.fxml;
    exports sample;
}