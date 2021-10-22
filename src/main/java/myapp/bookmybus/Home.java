package myapp.bookmybus;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.sql.SQLException;

public class Home {

    ObservableList<String> city = FXCollections.observableArrayList("Chennai","Coimbatore","Erode","Kanyakumari","Madurai","Tirunelveli");


    @FXML
    private ChoiceBox<String> origin;
    @FXML
    private ChoiceBox<String> destination;
    @FXML
    private DatePicker date;

    @FXML
    private void initialize(){
        origin.setValue("Origin");
        destination.setValue("Destination");
        origin.setItems(city);
        destination.setItems(city);
    }
    public void Searchbus(ActionEvent event) throws IOException, SQLException, ClassNotFoundException {
        Main.Pageredirect(event,"buses.fxml");
    }
    public void Logout(ActionEvent event) throws IOException {
        Main.Pageredirect(event,"login.fxml");
    }


}


