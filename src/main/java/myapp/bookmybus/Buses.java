package myapp.bookmybus;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.util.ResourceBundle;


public class Buses {

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
    public void Payment(ActionEvent event) throws IOException {
        Main.Pageredirect(event,"Payment.fxml");
    }
    public void Confirmation(ActionEvent event) throws IOException {
        Main.Pageredirect(event,"Confirmation.fxml");
    }

}

