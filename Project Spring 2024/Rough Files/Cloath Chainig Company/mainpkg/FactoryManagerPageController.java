/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
public class FactoryManagerPageController implements Initializable {

    @FXML
    private TextField tf_factory_name;
    @FXML
    private TextField tf_factory_location;
    @FXML
    private TableView<FactoryManager> fact_manager_table;
    @FXML
    private TableColumn<FactoryManager, String> tc_factory_name;
    @FXML
    private TableColumn<FactoryManager, String> tc_factory_location;
    
    ObservableList factory_list;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        factory_list = fact_manager_table.getItems();
        tc_factory_name.setCellValueFactory(new PropertyValueFactory("fact_name"));
        tc_factory_location.setCellValueFactory(new PropertyValueFactory("location"));
    }    

    @FXML
    private void show_Factory_onClick(ActionEvent event) {
        fact_manager_table.setItems(factory_list);
    }

    @FXML
    private void addFactoryOnClick(ActionEvent event) {
        String name = tf_factory_name.getText().trim();
        String location = tf_factory_location.getText().trim();   
        factory_list.add(new FactoryManager(name, location));
    }

    @FXML
    private void systemAdministratorOnClick(ActionEvent event) throws IOException {
        Parent p1 = FXMLLoader.load(getClass().getResource("UserPage1931291.fxml"));
        Scene s1 = new Scene(p1);
        Stage stg1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg1.setScene(s1);
        stg1.show();
    }

    @FXML
    private void signOut(ActionEvent event) throws IOException {
        Parent p1 = FXMLLoader.load(getClass().getResource("Login Page.fxml"));
        Scene s1 = new Scene(p1);
        Stage stg1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg1.setScene(s1);
        stg1.show();
    }
    
}
