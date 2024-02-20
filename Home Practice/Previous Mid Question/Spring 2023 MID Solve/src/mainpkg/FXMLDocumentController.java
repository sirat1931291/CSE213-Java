package mainpkg;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TableView<Product> product_table;
    @FXML
    private TableColumn<Product, String> cl_product_name;
    @FXML
    private TableColumn<Product, String> cl_product_id;
    @FXML
    private TableColumn<Product, String> cl_material;
    @FXML
    private TableColumn<Product, Integer> cl_quantity;
    @FXML
    private TextField tf_product_name;
    @FXML
    private TextField tf_product_id;
    @FXML
    private ComboBox<String> cb_material;
    @FXML
    private ComboBox<Integer> cb_quantity;
    @FXML
    private DatePicker dp_delivery_date;
    @FXML
    private Label error_label;
    @FXML
    private Button button_add_product;
    
    
    ObservableList product_list;
    @FXML
    private Label label;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        product_list = product_table.getItems();
        cb_material.getItems().addAll("Wood", "Metal", "Board", "Cloth", "Other");
        cb_quantity.getItems().addAll(1, 2, 3, 4, 5);
        cl_product_name.setCellValueFactory(new PropertyValueFactory("product_name"));
        cl_product_id.setCellValueFactory(new PropertyValueFactory("product_id"));
        cl_material.setCellValueFactory(new PropertyValueFactory("material"));
        cl_quantity.setCellValueFactory(new PropertyValueFactory("quantity"));
    }    

    @FXML
    private void on_clicked(ActionEvent event) {
        String product_name = tf_product_name.getText();
        String product_id = tf_product_id.getText();
        LocalDate delivery_date = dp_delivery_date.getValue();
        String material = cb_material.getValue();
        int quantity = cb_quantity.getValue();
        
        if (product_name == null || product_name.isEmpty()) {
            error_label.setText("Product Name can't be empty()");
            return;
        }
        
        else if (product_name == null || product_id.isEmpty()) {
            error_label.setText("Product ID can't be empty()");
            return;
        }
        
        else if (product_name == null || material.isEmpty()) {
            error_label.setText("Material can't be empty()");
            return;
        }
        
        else if (quantity == 0) {
            error_label.setText("Quantity must at least 1.");
            return;
        }
        
        else if (delivery_date.isBefore(LocalDate.now())) {
            error_label.setText("Delivery date can't be earlier from today.");
            return;
        }
        
        // Some error here. Need to fix
//        Product p = new Product();
//        for (int i = 0; i < product_list.size(); i++) {
//            if (p.getProduct_name().equals(product_name) || p.getProduct_id().equals(product_id)) {
//                error_label.setText("Product name and ID can't be duplicate.");
//                return;
//            }
//        }
        product_list.add(new Product(product_name, product_id, material, quantity));
    }
    
}
