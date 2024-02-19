/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author cis101
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TableView<Product> productTable;
    @FXML
    private TableColumn<Product, String> cl_productName;
    @FXML
    private TableColumn<Product, String> cl_productID;
    @FXML
    private Button addProductButton;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    ObservableList productList;  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        productList = productTable.getItems();
        cl_productName.setCellValueFactory(new PropertyValueFactory("productName"));
        cl_productID.setCellValueFactory(new PropertyValueFactory("productId"));
        productList.add(new Product("Pen", "1"));
    }

    @FXML
    private void onClicked(ActionEvent event) {
        Product p = new Product("Book", "2");
        productList.add(p);
    }
}
