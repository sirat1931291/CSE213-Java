package mainpkg;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    
    String userid, pass;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signIn(ActionEvent event) throws IOException {
        String id = tf_user_login_id.getText().trim();
        String password = tf_user_login_password.getText().trim();
        
        String filename = "User Login List.txt";
        try {
            Scanner s = new Scanner(new FileReader(filename));
            while (s.hasNext()) {
                userid = s.next();
                pass = s.next();
                if (id.equals(userid) && password.equals(pass)) {
                    if (id.equals("1931291")) {
                        Parent p1 = FXMLLoader.load(getClass().getResource("UserPage1931291.fxml"));
                        Scene s1 = new Scene(p1);
                        Stage stg1 = (Stage)((Node)event.getSource()).getScene().getWindow();
                        stg1.setScene(s1);
                        stg1.show();
                        break;
                    }
                    
                    else if (id.equals("1930654")) {
                        Parent p2 = FXMLLoader.load(getClass().getResource("UserPage1930654.fxml"));
                        Scene s2 = new Scene(p2);
                        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
                        stg2.setScene(s2);
                        stg2.show();
                        break;
                    }
                    
                    else if (id.equals("1930654")) {
                        Parent p2 = FXMLLoader.load(getClass().getResource("UserPage1930654.fxml"));
                        Scene s2 = new Scene(p2);
                        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
                        stg2.setScene(s2);
                        stg2.show();
                        break;
                    }
                    
                    else if (id.equals("1930654")) {
                        Parent p2 = FXMLLoader.load(getClass().getResource("UserPage1930654.fxml"));
                        Scene s2 = new Scene(p2);
                        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
                        stg2.setScene(s2);
                        stg2.show();
                        break;
                    }
                    
                    else if (id.equals("1930654")) {
                        Parent p2 = FXMLLoader.load(getClass().getResource("UserPage1930654.fxml"));
                        Scene s2 = new Scene(p2);
                        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
                        stg2.setScene(s2);
                        stg2.show();
                        break;
                    }
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
