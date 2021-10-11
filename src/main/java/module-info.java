module myapp.bookmybus {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens myapp.bookmybus to javafx.fxml;
    exports myapp.bookmybus;
}