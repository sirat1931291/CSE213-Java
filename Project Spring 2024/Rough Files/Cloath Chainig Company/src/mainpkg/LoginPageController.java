package mainpkg;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author habib
 */
public class LoginPageController implements Initializable {

    @FXML
    private TextField tf_user_login_id;
    @FXML
    private TextField tf_user_login_password;
    @FXML
    private Label lbl_login_status;
    @FXML
    private ComboBox<String> userLoginComboBox;
    
    String userid, pass,usertype;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ObservableList<String> options = FXCollections.observableArrayList("System Administrator", "Factory Manager", "Customer", "Worker");
        userLoginComboBox.setItems(options);
    }
    
    @FXML
    private void signIn(ActionEvent event) throws IOException {
        String id = tf_user_login_id.getText().trim();
        String password = tf_user_login_password.getText().trim();
        String user = userLoginComboBox.getValue();
        
        if (id.isEmpty()) {
            lbl_login_status.setText("Please enter user id.");
            return;
        }
        else if (password.isEmpty()) {
            lbl_login_status.setText("Please enter your password.");
            return;
        }
        else if (userLoginComboBox.getSelectionModel().isEmpty()) {
            lbl_login_status.setText("Please select a user.");
            return;
        }
        
        String filename = "User Login List.txt";
        try {
            Scanner s = new Scanner(new FileReader(filename));
            s.useDelimiter(",");
            while (s.hasNext()) {
                userid = s.next();
                pass = s.next();
                usertype = s.next();     

                if (id.equals("1931291") && password.equals(pass) && user.equals(usertype)) {
                        Parent p1 = FXMLLoader.load(getClass().getResource("UserPage1931291.fxml"));
                        Scene s1 = new Scene(p1);
                        Stage stg1 = (Stage)((Node)event.getSource()).getScene().getWindow();
                        stg1.setScene(s1);
                        stg1.show();
                        break;
                }
                    
                else if (id.equals("1931291") && password.equals(pass) && user.equals(usertype)) {
                        Parent p1 = FXMLLoader.load(getClass().getResource("FactoryManagerPage.fxml"));
                        Scene s1 = new Scene(p1);
                        Stage stg1 = (Stage)((Node)event.getSource()).getScene().getWindow();
                        stg1.setScene(s1);
                        stg1.show();
                        break;
                }
                
                else if (id.equals("1930654") && password.equals(pass) && user.equals(usertype)) {
                        Parent p1 = FXMLLoader.load(getClass().getResource("UserPage1931291.fxml"));
                        Scene s1 = new Scene(p1);
                        Stage stg1 = (Stage)((Node)event.getSource()).getScene().getWindow();
                        stg1.setScene(s1);
                        stg1.show();
                        break;
                }
                
                else if (id.equals("2022067") && password.equals(pass) && user.equals(usertype)) {
                        Parent p1 = FXMLLoader.load(getClass().getResource("FactoryManagerPage.fxml"));
                        Scene s1 = new Scene(p1);
                        Stage stg1 = (Stage)((Node)event.getSource()).getScene().getWindow();
                        stg1.setScene(s1);
                        stg1.show();
                        break;
                }

                System.out.println(userid + " " + pass);
            }
            s.close();
            lbl_login_status.setText("Invalid Credentials!\nPlease Try Again.");
            
        }
        catch (IOException  e) {
            e.printStackTrace();
            System.out.println("Something went wrong.");
        }
    }
}




//                if (id.equals(userid) && password.equals(pass) && user.equals(usertype)) {
//                    if (id.equals("1931291") && user.equals(usertype)) {
//                        Parent p1 = FXMLLoader.load(getClass().getResource("UserPage1931291.fxml"));
//                        Scene s1 = new Scene(p1);
//                        Stage stg1 = (Stage)((Node)event.getSource()).getScene().getWindow();
//                        stg1.setScene(s1);
//                        stg1.show();
//                        break;
//                    }
//                    
//                    else if (id.equals("1931291") && user.equals(usertype)) {
//                        Parent p1 = FXMLLoader.load(getClass().getResource("FactoryManagerPage.fxml"));
//                        Scene s1 = new Scene(p1);
//                        Stage stg1 = (Stage)((Node)event.getSource()).getScene().getWindow();
//                        stg1.setScene(s1);
//                        stg1.show();
//                        break;
//                    }
//                    
//                    else if (id.equals("1930654") && user.equals(usertype)) {
//                        Parent p2 = FXMLLoader.load(getClass().getResource("UserPage1930654.fxml"));
//                        Scene s2 = new Scene(p2);
//                        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
//                        stg2.setScene(s2);
//                        stg2.show();
//                        break;
//                    }
//                    
//                    else if (id.equals("2022067") && user.equals(usertype)) {
//                        Parent p2 = FXMLLoader.load(getClass().getResource("UserPage1930654.fxml"));
//                        Scene s2 = new Scene(p2);
//                        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
//                        stg2.setScene(s2);
//                        stg2.show();
//                        break;
//                    }
//                    
//                    else if (id.equals("2022067") && user.equals(usertype)) {
//                        Parent p2 = FXMLLoader.load(getClass().getResource("UserPage1930654.fxml"));
//                        Scene s2 = new Scene(p2);
//                        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
//                        stg2.setScene(s2);
//                        stg2.show();
//                        break;
//                    }
//                    
//                    else if (id.equals("2021359") && user.equals(usertype)) {
//                        Parent p2 = FXMLLoader.load(getClass().getResource("UserPage1930654.fxml"));
//                        Scene s2 = new Scene(p2);
//                        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
//                        stg2.setScene(s2);
//                        stg2.show();
//                        break;
//                    }
//                    else if (id.equals("2021359") && user.equals(usertype)) {
//                        Parent p2 = FXMLLoader.load(getClass().getResource("UserPage1930654.fxml"));
//                        Scene s2 = new Scene(p2);
//                        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
//                        stg2.setScene(s2);
//                        stg2.show();
//                        break;
//                    }
//                }