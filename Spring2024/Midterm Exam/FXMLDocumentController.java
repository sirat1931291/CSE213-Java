/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package mainpkg;

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
 * @author nahia
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField tf_processor_name;
    @FXML
    private TextField tf_price;
    @FXML
    private TextField tf_rating;
    @FXML
    private ComboBox<String> cb_series;
    @FXML
    private ComboBox<Integer> cb_no_of_cores;
    @FXML
    private TableView<Processor> table_view;
    @FXML
    private TableColumn<Processor, String> tc_processor_name;
    @FXML
    private TableColumn<Processor, String> tc_brand;
    @FXML
    private TableColumn<Processor, String> tc_series;
    @FXML
    private TableColumn<Processor, Integer> tc_number_of_cores;
    @FXML
    private TableColumn<Processor, Integer> tc_price;
    @FXML
    private TableColumn<Processor, Float> tc_rating;
    @FXML
    private TableColumn<Processor, Integer> tc_price_per_core;
    @FXML
    private Label lbl_brand_label;
    @FXML
    private Label lowest_per_core_label;
    @FXML
    private Label highest_per_core_label;
    @FXML
    private TextField tf_min_rating;
    @FXML
    private TextField tf_max_rating;
    
    ArrayList <Processor> processor_list;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cb_series.getItems().addAll("Pentium",
                                    "Celoron",
                                    "Core i",
                                    "Ryzen",
                                    "Athlon",
                                    "Threadripper");
        cb_no_of_cores.getItems().addAll(2, 4,6, 8, 12, 16);
        
        tc_processor_name.setCellValueFactory(new PropertyValueFactory("processor_name"));
        tc_brand.setCellValueFactory(new PropertyValueFactory("brand"));
        tc_series.setCellValueFactory(new PropertyValueFactory("series"));
        tc_number_of_cores.setCellValueFactory(new PropertyValueFactory("numberOfCores"));
        tc_price.setCellValueFactory(new PropertyValueFactory("price"));
        tc_rating.setCellValueFactory(new PropertyValueFactory("rating"));
        tc_price_per_core.setCellValueFactory(new PropertyValueFactory("getPricePerCore"));
        
        processor_list = new ArrayList<>();
        
    }
    
    

    @FXML
    private void updateBrandFromSeries(ActionEvent event) {
        lbl_brand_label.setText(cb_series.getValue());
    }

    @FXML
    private void addProduct(ActionEvent event) {
        String name = tf_processor_name.getText();
        String series = cb_series.getValue();
        String brand = cb_series.getValue();
        int cores = cb_no_of_cores.getValue();
        int price = Integer.parseInt(tf_price.getText());
        float rating = Float.parseFloat(tf_rating.getText());
        Processor processor = new Processor(name, series, brand, cores, price, rating);
        processor_list.add(processor);
        table_view.getItems().addAll(processor_list);
    }

    @FXML
    private void filter_product(ActionEvent event) {
//        int min_rate = Integer.ParseInt(tf_min_rating.getText());
//        int max_rate = Integer.ParseInt(tf_max_rating.getText());
        for (Processor processor: processor_list){
            
        }
    }

    @FXML
    private void reset_filter_product(ActionEvent event) {
    }
    
}
