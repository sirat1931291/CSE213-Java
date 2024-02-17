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
import javafx.scene.control.TextField;
import java.util.ArrayList;


public class MidQuestionFXMLController implements Initializable {

    @FXML
    private TableColumn<?, ?> cl_productName;
    @FXML
    private TableColumn<?, ?> cl_productId;
    @FXML
    private TableColumn<?, ?> cl_material;
    @FXML
    private TableColumn<?, ?> cl_quantity;
    @FXML
    private TextField tf_productName;
    @FXML
    private TextField tf_productId;
//    @FXML
//    private ComboBox<String> cb_material;
    
    @FXML
    private ComboBox<?> cb_material;
    
    @FXML
    private ComboBox<?> cb_quantity;
    @FXML
    private DatePicker datePicker;
    @FXML
    private Button button_addProduct;
    @FXML
    private Label error_label;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ArrayList cb_material = new ArrayList<>();
        cb_material.add("Wood");
//        cb_material.getItems().addAll("Wood", "Metal", "Board", "Cloth", "Other");
    }    

    @FXML
    private void onMouseClicked(ActionEvent event) {
    }
    
}
