package myapp.bookmybus;

import javafx.beans.binding.Bindings;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.EventObject;
import java.util.Objects;


public class Register {
    @FXML
    private Button signup_button;
    @FXML
    private TextField first_name;
    @FXML
    private TextField last_name;
    @FXML
    private TextField mail;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private TextField confirm_password;
    @FXML
    private CheckBox terms;
    Alert a = new Alert(Alert.AlertType.NONE);
    private Stage stage;
    private Scene scene;
    private Parent root;


    public static void write(String firstname, String lastname, String email, String username, String password) throws ClassNotFoundException, SQLException {
        String query = String.format("INSERT INTO userdata(firstname,lastname,emailid,username,password) VALUES('%s','%s','%s','%s','%s')", firstname,lastname,email,username,password);

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BookMyBus", "postgres", "Mathankumar@14");
        Statement st = con.createStatement();
        st.executeUpdate(query);
    }

    public void registermethod(ActionEvent actionEvent) throws SQLException, ClassNotFoundException, IOException {
        if(first_name.getText() != null && !first_name.getText().isEmpty() && last_name.getText() != null && !last_name.getText().isEmpty() &&
                mail.getText() != null && !mail.getText().isEmpty() && password.getText() != null && !password.getText().isEmpty() &&
                confirm_password.getText() != null && !confirm_password.getText().isEmpty() && terms.isSelected()) {
            if (Objects.equals(password.getText(), confirm_password.getText())) {
                write(first_name.getText(), last_name.getText(), mail.getText(), username.getText(), password.getText());

                a.setAlertType(Alert.AlertType.INFORMATION);
                a.setContentText("Successfully registered!");
                a.show();

                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
                stage = (Stage)((Node)signup_button).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } else {
                a.setAlertType(Alert.AlertType.ERROR);
                a.setContentText("Password and confirm password didnt match!");
                a.show();
            }
        }else {
            a.setAlertType(Alert.AlertType.WARNING);
            a.setContentText("Please fill all details");
            a.show();
        }
    }
    public void Alreadyhaveanaccount(ActionEvent event) throws IOException {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

}