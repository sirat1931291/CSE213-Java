/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package midterm_1234567_sec3;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author asifm
 */
public class MidExamSceneController implements Initializable {

    private Label label;
    @FXML
    private ComboBox<String> cb_select_product;
    @FXML
    private Label lbl_unit_price;
    @FXML
    private ComboBox<Integer> cb_quantity;
    @FXML
    private Label lbl_vat_rate;
    @FXML
    private Label lbl_checkout_summary;
    @FXML
    private TableView<CartItem> tableView;
    @FXML
    private TableColumn<CartItem, String> tc_product_name;
    @FXML
    private TableColumn<CartItem, Float> tc_unit_price;
    @FXML
    private TableColumn<CartItem, Integer> tc_quantity;
    @FXML
    private TableColumn<CartItem, Integer> tc_vat_pc;
    @FXML
    private TableColumn<CartItem, Float> tc_vat_amount;
    @FXML
    private TableColumn<CartItem, Float> tc_total_amount;
    @FXML
    private Label lbl_total_vat_amount;
    @FXML
    private TextField tf_max_unit_price;
    @FXML
    private ComboBox<Integer> cb_vat_filter;

    private ArrayList<CartItem> cartList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cb_select_product.getItems().addAll("Aarong Milk", "Nescafe Gold 100gm", "Rui Fish Kg Pack", "Lux Soap White 100gm", "Green Tea", "Black Tea", "Sugar 1kg", "Puffed Rice", "Chanachur", "Salt");
        cb_quantity.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        cb_vat_filter.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        tc_product_name.setCellValueFactory(new PropertyValueFactory<>("productName"));
        tc_unit_price.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        tc_quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        tc_vat_pc.setCellValueFactory(new PropertyValueFactory<>("vatRate"));
        tc_vat_amount.setCellValueFactory(new PropertyValueFactory<>("vatAmount"));
        tc_total_amount.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));

        cartList = new ArrayList<>();
    }

    @FXML
    private void updatePriceAndVat(ActionEvent event) {
        String selectedItem = cb_select_product.getValue();
        
        if (selectedItem.equals("Aarong Milk")) {
            lbl_unit_price.setText("100");
            lbl_vat_rate.setText("5");
        }
        if (selectedItem.equals("Nescafe Gold 100gm")) {
            lbl_unit_price.setText("900");
            lbl_vat_rate.setText("5");
        }
        if (selectedItem.equals("Rui Fish Kg Pack")) {
            lbl_unit_price.setText("400");
            lbl_vat_rate.setText("3");
        }
        if (selectedItem.equals("Lux Soap White 100gm")) {
            lbl_unit_price.setText("800");
            lbl_vat_rate.setText("5");
        }
        if (selectedItem.equals("Green Tea")) {
            lbl_unit_price.setText("200");
            lbl_vat_rate.setText("5");
        }
        if (selectedItem.equals("Black Tea")) {
            lbl_unit_price.setText("250");
            lbl_vat_rate.setText("4");
        }
        if (selectedItem.equals("Sugar 1kg")) {
            lbl_unit_price.setText("150");
            lbl_vat_rate.setText("2");
        }
        if (selectedItem.equals("Puffed Rice")) {
            lbl_unit_price.setText("70");
            lbl_vat_rate.setText("5");
        }
        if (selectedItem.equals("Chanachur")) {
            lbl_unit_price.setText("90");
            lbl_vat_rate.setText("5");
        }
        if (selectedItem.equals("Salt")) {
            lbl_unit_price.setText("30");
            lbl_vat_rate.setText("5");
        }
    }

    @FXML
    private void addProductToCartButtonOnClick(ActionEvent event) {
        String selectedItem = cb_select_product.getValue();
        for (CartItem item:cartList) {
            if (item.getProductName().equals(selectedItem)) {
                item.setQuantity(item.getQuantity() + cb_quantity.getValue());
                return;
            }
        }
        float unitPrice = Float.parseFloat(lbl_unit_price.getText());
        int vatRate = Integer.parseInt(lbl_vat_rate.getText());
        int quantity = cb_quantity.getValue();
        
        CartItem item = new CartItem(selectedItem, unitPrice, vatRate, quantity);
        cartList.add(item);
    }

    @FXML
    private void checkOutAndShowBillButtonOnClick(ActionEvent event) {
        tableView.getItems().addAll(cartList);
        
        float total = 0;
        for (CartItem item: cartList){
            total += item.getTotalAmount();
        }
        lbl_checkout_summary.setText("After checkout, TOTAL amount payable is " + total + " Tk, and the cart detail is:");
    }

    @FXML
    private void showTotalVatForQualifiedProductsButtonOnClick(ActionEvent event) {
        float vat = 0;
        for (CartItem item: cartList){
            if (item.getUnitPrice() <= Float.parseFloat(tf_max_unit_price.getText()) && item.getVatRate() == cb_vat_filter.getValue()) {
                vat += item.getVatAmount();
            }
        }
        
        lbl_total_vat_amount.setText("The total vat amount for the products in the cart having unit price <= " + tf_max_unit_price.getText() + " with " + cb_vat_filter.getValue() + "% vat is: " + vat);
    }

}
