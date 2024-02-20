package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Random;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField tf_website;
    @FXML
    private TextField tf_email;
    @FXML
    private Button generate_password_button;
    @FXML
    private TableView<Password> user_table;
    @FXML
    private TableColumn<Password, String> cl_website;
    @FXML
    private TableColumn<Password, String> cl_email;
    @FXML
    private TableColumn<Password, String> cl_password;
    @FXML
    private Label password_label;
    @FXML
    private Label message_label;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    ObservableList user_list;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        user_list = user_table.getItems();
        cl_website.setCellValueFactory(new PropertyValueFactory("website"));
        cl_email.setCellValueFactory(new PropertyValueFactory("email"));
        cl_password.setCellValueFactory(new PropertyValueFactory("password"));
    }    

    @FXML
    private void generate_password_on_mouse_clicked(ActionEvent event) {
        Random random = new Random();
        String website = tf_website.getText().trim();
        String email = tf_email.getText().trim();
        String password = "";
        for (int i = 1; i <= 20; i++) {
            String p = Integer.toString(random.nextInt(100));
            password = password + p;
        }
        message_label.setText("Your Generated password :");
        password_label.setText(password);
        user_list.add(new Password(website, email, password));
    }
}
