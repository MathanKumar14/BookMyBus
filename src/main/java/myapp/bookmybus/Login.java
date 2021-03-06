package myapp.bookmybus;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.FXML;

public class Login {
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button login_button;
    Alert a = new Alert(Alert.AlertType.NONE);

    public void Donthaveaccount(ActionEvent event) throws IOException {
     Main.Pageredirect(event,"register.fxml");
    }
    public void Checklogin(ActionEvent event) throws Exception{
        if(Objects.equals(username.getText(), "admin") && Objects.equals(password.getText(),"admin")){
            Main.Pageredirect(event,"admin.fxml");
        }else {
        final String query = String.format("SELECT * FROM userdata WHERE username = '%s' and password = '%s'",username.getText(),password.getText());
        Class.forName("org.postgresql.Driver");
        final Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BookMyBus", "postgres", "Mathankumar@14");
        final Statement st = con.createStatement();
        final ResultSet rs = st.executeQuery(query);

        if(rs.next()) {
            Main.Pageredirect(event,"home.fxml");
        }else {
            a.setAlertType(Alert.AlertType.ERROR);
            a.setContentText("Incorrect credentials");
            a.show();
        }
    }
    }


}