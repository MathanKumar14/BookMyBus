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
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button login_button;
    Alert a = new Alert(Alert.AlertType.NONE);

    public void Donthaveaccount(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("register.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void Checklogin(ActionEvent event) throws Exception{
        if(Objects.equals(username.getText(), "mathan_14") && Objects.equals(password.getText(),"Mathankumar@14")){
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("admin.fxml")));
            stage = (Stage)((Node)login_button).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else {
        final String query = String.format("SELECT * FROM userdata WHERE username = '%s' and password = '%s'",username.getText(),password.getText());
        Class.forName("org.postgresql.Driver");
        final Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BookMyBus", "postgres", "Mathankumar@14");
        final Statement st = con.createStatement();
        final ResultSet rs = st.executeQuery(query);

        if(rs.next()) {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("home.fxml")));
            stage = (Stage)((Node)login_button).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else {
            a.setAlertType(Alert.AlertType.ERROR);
            a.setContentText("Incorrect credentials");
            a.show();
        }
    }
    }


}