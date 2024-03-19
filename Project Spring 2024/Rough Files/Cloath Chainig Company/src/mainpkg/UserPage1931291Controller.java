/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author habib
 */
public class UserPage1931291Controller implements Initializable {

    @FXML
    private TableView<User1931291> sys_admin_user_table;
    @FXML
    private TableColumn<User1931291, String> tc_user_id;
    @FXML
    private TableColumn<User1931291, String> tc_user_name;
    @FXML
    private TableColumn<User1931291, String> tc_user_type;
    @FXML
    private TextField tf_sys_admin_id;
    @FXML
    private TextField tf_sys_admin_name;
    @FXML
    private TextField tf_sys_admin_password;
    @FXML
    private TextField tf_sys_admin_acc_type;
    @FXML
    private Label lbl_status_save_file;
    
    ObservableList user_list;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        user_list = sys_admin_user_table.getItems();
        tc_user_id.setCellValueFactory(new PropertyValueFactory("user_id"));
        tc_user_name.setCellValueFactory(new PropertyValueFactory("user_name"));
        tc_user_type.setCellValueFactory(new PropertyValueFactory("user_type"));
    }    

    @FXML
    private void show_user_onClick(ActionEvent event) {
        
        String filename = "User List.txt";
        try {
            Scanner s = new Scanner(new FileReader(filename));
            s.useDelimiter(",|\n");
            user_list.clear();
            while (s.hasNext()) {
                String id = s.next();
                String name = s.next();
                String type = s.next();
                user_list.add(new User1931291(id, name, type));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    @FXML
    private void addUserOnClick(ActionEvent event) {
        String id = tf_sys_admin_id.getText().trim();
        String name = tf_sys_admin_name.getText().trim();
        String pass = tf_sys_admin_password.getText().trim();
        String type = tf_sys_admin_acc_type.getText().trim();      
        user_list.add(new User1931291(id, name, type));
        if (id.isEmpty() || name.isEmpty() || pass.isEmpty() || type.isEmpty()) {
            lbl_status_save_file.setText("All field must fill");
            return;
        }
        
        String user_login_list = "User Login List.txt";
        String user_list = "User List.txt";
        try (BufferedWriter rt = new BufferedWriter(new FileWriter(user_login_list, true))) {
            rt.write(id + " " + pass + '\n');
            lbl_status_save_file.setText("File saved successfully.");
        }
        catch (IOException e) {
            lbl_status_save_file.setText("Something went wrong to write to file!!");
        }
        
        try (BufferedWriter rt = new BufferedWriter(new FileWriter(user_list, true))) {
            rt.write(id + "," + name + "," + type + '\n');
            lbl_status_save_file.setText("File saved successfully.");
        }
        catch (IOException e) {
            lbl_status_save_file.setText("Something went wrong to write to file!!");
        }
    }

    @FXML
    private void showPieChartOnClick(ActionEvent event) throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("SystemAdminPieChartScene.fxml"));
        Scene s = new Scene(p);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(s);
        stg.show();
    }

    @FXML
    private void showBarChartOnClick(ActionEvent event) throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("SystemAdminPieChartScene.fxml"));
        Scene s = new Scene(p);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(s);
        stg.show();
    }
    
}
