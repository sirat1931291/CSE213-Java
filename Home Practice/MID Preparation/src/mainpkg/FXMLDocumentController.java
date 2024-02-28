package mainpkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Label lbl_check_out_info;
    @FXML
    private Label lbl_vat_message;
    @FXML
    private ComboBox<String> cb_select_product;
    @FXML
    private Label lbl_unit_price;
    @FXML
    private ComboBox<Integer> cb_quantity;
    @FXML
    private Label lbl_predefined_vat;
    @FXML
    private TableView<CartItem> cart_table;
    @FXML
    private TableColumn<CartItem, String> cl_product_name;
    @FXML
    private TableColumn<CartItem, Float> cl_unit_price;
    @FXML
    private TableColumn<CartItem, Integer> cl_quantity;
    @FXML
    private TableColumn<CartItem, Integer> cl_vat;
    @FXML
    private TableColumn<CartItem, Float> cl_vat_amount;
    @FXML
    private TableColumn<CartItem, Float> cl_total_amount;
    @FXML
    private Button add_product_button;
    @FXML
    private Button check_out_button;
    @FXML
    private Button show_total_vat_amount;
    @FXML
    private TextField tf_max_unit_price;
    @FXML
    private ComboBox<Integer> cb_consider_vat_percent;
    
    private ArrayList<CartItem> cart_item_list;
    
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cb_select_product.getItems().addAll("Aarong Milk",
                                            "Nescafe Gold 100gm",
                                            "Rui Fish kg pack",
                                            "Lux Soap White 100 gm",
                                            "Green Tea",
                                            "Black Tea",
                                            "Sugar",
                                            "Puffed Rice",
                                            "Chanachur",
                                            "Salt");
        cb_quantity.getItems().addAll(1, 
                                      2,
                                      3,
                                      4,
                                      5,
                                      6,
                                      7,
                                      8,
                                      9,
                                      10);
        
        cb_consider_vat_percent.getItems().addAll(1,
                                                  2,
                                                  3,
                                                  4,
                                                  5,
                                                  6,
                                                  7,
                                                  8,
                                                  9,
                                                  10);
        
        cl_product_name.setCellValueFactory(new PropertyValueFactory("product_name"));
        cl_unit_price.setCellValueFactory(new PropertyValueFactory("unit_price"));
        cl_quantity.setCellValueFactory(new PropertyValueFactory("quantity"));
        cl_vat.setCellValueFactory(new PropertyValueFactory("vat_rate"));
        cl_vat_amount.setCellValueFactory(new PropertyValueFactory("VatAmount"));
        cl_total_amount.setCellValueFactory(new PropertyValueFactory("TotalAmount"));
        
        cart_item_list = new ArrayList<>();
    }
    
    @FXML
    private void update_price_and_vat_to_label(ActionEvent event) {
        String product_name =cb_select_product.getValue();
        
        if (product_name.equals("Aarong Milk")) {
            lbl_unit_price.setText("100");
            lbl_predefined_vat.setText("5");
        }
        
        if (product_name.equals("Nescafe Gold 100gm")) {
            lbl_unit_price.setText("900");
            lbl_predefined_vat.setText("5");
        }
        
        if (product_name.equals("Rui Fish kg pack")) {
            lbl_unit_price.setText("400");
            lbl_predefined_vat.setText("3");
        }
        
        if (product_name.equals("Lux Soap White 100 gm")) {
            lbl_unit_price.setText("80");
            lbl_predefined_vat.setText("3");
        }
        
        if (product_name.equals("Green Tea")) {
            lbl_unit_price.setText("200");
            lbl_predefined_vat.setText("5");
        }
        
        if (product_name.equals("Black Tea")) {
            lbl_unit_price.setText("250");
            lbl_predefined_vat.setText("5");
        }
        
        if (product_name.equals("Sugar")) {
            lbl_unit_price.setText("140");
            lbl_predefined_vat.setText("3");
        }
        
        if (product_name.equals("Puffed Rice")) {
            lbl_unit_price.setText("130");
            lbl_predefined_vat.setText("3");
        }
        
        if (product_name.equals("Chanachur")) {
            lbl_unit_price.setText("90");
            lbl_predefined_vat.setText("4");
        }
        
        if (product_name.equals("Salt")) {
            lbl_unit_price.setText("60");
            lbl_predefined_vat.setText("3");
        }
    }

    @FXML
    private void add_product_cart(ActionEvent event) {
        String selected_product = cb_select_product.getValue();
        for (CartItem item: cart_item_list) {
            if (item.getProduct_name().equals(selected_product)) {
                item.setQuantity(item.getQuantity() + cb_quantity.getValue());
                return;
            }
        }
        float unit_price = Float.parseFloat(lbl_unit_price.getText());
        int quantity = cb_quantity.getValue();
        int vat_rate = Integer.parseInt(lbl_predefined_vat.getText());
        
        CartItem item = new CartItem(selected_product, unit_price, quantity, vat_rate);
        cart_item_list.add(item);
    }

    @FXML
    private void check_out(ActionEvent event) {
        cart_table.getItems().addAll(cart_item_list);
        
        float total = 0;
        for (CartItem item: cart_item_list){
            total = total + item.getTotalAmount(); 
        }
        lbl_check_out_info.setText("After checkout, TOTAL amount payable is " + total + "TK, and the cart details is:");
    }

    @FXML
    private void show_total_vat_amout_on_click(ActionEvent event) {
        float vat = 0;
        for (CartItem item: cart_item_list) {
            if (item.getUnit_price() <= Integer.parseInt(tf_max_unit_price.getText()) && item.getVat_rate() == cb_consider_vat_percent.getValue()) {
                vat += item.getVatAmount();
            }
        }
        lbl_vat_message.setText("The total Vat amount for the products in the cart having unit price <= " 
                        + tf_max_unit_price.getText() 
                        + " with " + cb_consider_vat_percent.getValue() 
                        + "% vat is " + vat + " TK");
    }
    
    
}
