package myapp.bookmybus;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.util.ResourceBundle;


public class Buses implements Initializable {
    @FXML
    private TableView<Buses_2> table;
    @FXML
    private TableColumn<Buses_2,String> bus;
    @FXML
    private TableColumn<Buses_2,String> bus_type;
    @FXML
    private TableColumn<Buses_2,String> departure;
    @FXML
    private TableColumn<Buses_2,String> arrival;
    @FXML
    private TableColumn<Buses_2,String> duration;
    @FXML
    private TableColumn<Buses_2,String> fare;
    @FXML
    private TableColumn<Buses_2,String> seat;

    ObservableList<Buses_2> list = FXCollections.observableArrayList(
            new Buses_2("VigneshTAT","AC","6:00PM","6:00AM","12hrs","700","24"),
            new Buses_2("SRM","AC","6:00PM","6:00AM","12hrs","700","24"),
            new Buses_2("Thirumalai vaasan","AC","6:00PM","6:00AM","12hrs","700","24"),
            new Buses_2("RPR","AC","6:00PM","6:00AM","12hrs","700","24"),
            new Buses_2("Volvo","AC","6:00PM","6:00AM","12hrs","700","24")
    );

    @Override
    public void initialize(URL url, ResourceBundle rb){
        bus.setCellValueFactory(new PropertyValueFactory<Buses_2,String>("bus"));
        bus_type.setCellValueFactory(new PropertyValueFactory<Buses_2,String>("bus_type"));
        departure.setCellValueFactory(new PropertyValueFactory<Buses_2,String>("departure"));
        arrival.setCellValueFactory(new PropertyValueFactory<Buses_2,String>("arrival"));
        duration.setCellValueFactory(new PropertyValueFactory<Buses_2,String>("duration"));
        fare.setCellValueFactory(new PropertyValueFactory<Buses_2,String>("fare"));
        seat.setCellValueFactory(new PropertyValueFactory<Buses_2,String>("seat"));

        table.setItems(list);
    }
}

