package myapp.bookmybus;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.sql.*;
import java.util.Objects;

public class Home {

    ObservableList<String> city = FXCollections.observableArrayList("Chennai","Coimbatore","Erode","Kanyakumari","Madurai","Tirunelveli");


    @FXML
    private ChoiceBox<String> origin;
    @FXML
    private ChoiceBox<String> destination;
    @FXML
    private DatePicker date;
    @FXML
    private Label origin_warning;
    @FXML
    private Label destination_warning;
    @FXML
    private Label date_warning;

    Alert a = new Alert(Alert.AlertType.NONE);

    @FXML
    private void initialize(){
        origin.setValue("Origin");
        destination.setValue("Destination");
        origin.setItems(city);
        destination.setItems(city);
    }
    public void Searchbus(ActionEvent event) throws IOException, SQLException, ClassNotFoundException {


        if(origin.getValue() == null){
            a.setAlertType(Alert.AlertType.WARNING);
            a.setContentText("Fill all the details!");
            a.show();
        }
        else if(destination.getValue() == null){
            a.setAlertType(Alert.AlertType.WARNING);
            a.setContentText("Fill all the details!");
            a.show();
        }
        else if(date.getValue() == null){
            a.setAlertType(Alert.AlertType.WARNING);
            a.setContentText("Fill all the details!");
            a.show();
        }
        else {
            if(Objects.equals(origin.getValue(), destination.getValue())){
                a.setAlertType(Alert.AlertType.WARNING);
                a.setContentText("Choose different destination");
                a.show();
            }
            else {
                Main.Pageredirect(event, "buses.fxml");
            }

        }
    }
    public void Logout(ActionEvent event) throws IOException {
        Main.Pageredirect(event,"login.fxml");
    }
    public void Home(ActionEvent event) throws IOException {
        Main.Pageredirect(event,"home.fxml");
    }
    public void About_us(ActionEvent event) throws IOException {
        Main.Pageredirect(event,"about_us.fxml");
    }
    public void Contact_us(ActionEvent event) throws IOException {
        Main.Pageredirect(event,"Contact_us.fxml");
    }


}


