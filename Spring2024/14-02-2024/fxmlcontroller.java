/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author cis101
 */
public class MyFXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TableView<?> table_product;
    @FXML
    private TableColumn<?, ?> cl_product_name;
    @FXML
    private TableColumn<?, ?> cl_product_id;
    @FXML
    private TableColumn<?, ?> cl_material;
    @FXML
    private TableColumn<?, ?> cl_quantity;
    @FXML
    private TextField tf_product_field;
    @FXML
    private TextField tx_product_id;
    @FXML
    private ComboBox<?> cb_material;
    @FXML
    private ComboBox<?> cb_quantity;
    @FXML
    private DatePicker delivery_date;
    @FXML
    private Button add_product_button;
    
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
