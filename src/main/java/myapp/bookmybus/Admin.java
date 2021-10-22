package myapp.bookmybus;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Admin {

    public void Adminlogout(ActionEvent event) throws IOException {
        Main.Pageredirect(event,"login.fxml");
    }

}
