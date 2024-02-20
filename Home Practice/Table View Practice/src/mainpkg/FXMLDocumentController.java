package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TableView<Student> student_table;
    @FXML
    private TableColumn<Student, String> cl_name;
    @FXML
    private TableColumn<Student, String> cl_id;
    @FXML
    private TableColumn<Student, Integer> cl_section;
    @FXML
    private TableColumn<Student, String> cl_course;
    
    @FXML
    private Button add_button;
    @FXML
    private TextField tf_name;
    @FXML
    private TextField tf_id;
    @FXML
    private TextField tf_course;
    @FXML
    private TextField tf_section;
    
    ObservableList student_list;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        student_list = student_table.getItems();
        cl_name.setCellValueFactory(new PropertyValueFactory("name"));
        cl_id.setCellValueFactory(new PropertyValueFactory("id"));
        cl_section.setCellValueFactory(new PropertyValueFactory("section"));
        cl_course.setCellValueFactory(new PropertyValueFactory("course"));
        
    }    

    @FXML
    private void add_student(ActionEvent event) {
        String name = tf_name.getText().trim();
        String id = tf_id.getText().trim();
        String course = tf_course.getText().trim();
        int section = Integer.parseInt(tf_section.getText().trim());
        student_list.add(new Student("Habibullah Sirat", "1931291", 1, "OOP"));
        student_list.add(new Student(name, id, section, course));
    }
    
}
