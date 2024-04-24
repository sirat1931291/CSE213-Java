/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package mainpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author nahia
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField tf_user_name;
    @FXML
    private TextField tf_password;
    @FXML
    private TextField tf_email;
    @FXML
    private TableView<User> user_table;
    @FXML
    private TableColumn<User, String> tc_user_name;
    @FXML
    private TableColumn<User, String> tc_email;
    
    ObservableList user_list;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        user_list = user_table.getItems();
        tc_user_name.setCellValueFactory(new PropertyValueFactory("user_name"));
        tc_email.setCellValueFactory(new PropertyValueFactory("email"));
    }    

    @FXML
    private void addUserOnClick(ActionEvent event) {
        String name = tf_user_name.getText().trim();
        String password = tf_password.getText().trim();
        String email = tf_email.getText().trim();
        user_list.add(new User(name, password, email));
        user_table.setItems(user_list);
    }

    @FXML
    private void saveBinOnClick(ActionEvent event) throws FileNotFoundException {
        String name = tf_user_name.getText().trim();
        String password = tf_password.getText().trim();
        String email = tf_email.getText().trim();
        User user = new User(name, password, email);
        
        try {
            FileOutputStream fos = new FileOutputStream("user.bin", true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
            oos.close();
            fos.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void readFromBinOnCLick(ActionEvent event) throws FileNotFoundException, ClassNotFoundException {
        try {
            FileInputStream fis = new FileInputStream("user.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            List<User> userList = (List<User>) ois.readObject();
            
            for (User user : userList) {
//                String name = user.getUser_name();
//                String password = user.getPassword();
//                String email = user.getEmail();
                
                System.out.println("Name: " + user.getUser_name());         
                System.out.println("Password: " + user.getPassword());
                System.out.println("Email: " + user.getEmail());
                System.out.println();
                
//                user_list.add(new User(name, password, email));
            }
//            user_table.setItems(user_list);
            ois.close();
            fis.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
