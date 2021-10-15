module myapp.bookmybus {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires org.postgresql.jdbc;


    opens myapp.bookmybus to javafx.fxml;
    exports myapp.bookmybus;
}