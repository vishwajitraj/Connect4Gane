module com.example.javagame.connect4gane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javagame.connect4gane to javafx.fxml;
    exports com.example.javagame.connect4gane;
}