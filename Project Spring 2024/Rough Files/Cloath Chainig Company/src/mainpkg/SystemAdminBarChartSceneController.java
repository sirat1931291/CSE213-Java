/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author habib
 */
public class SystemAdminBarChartSceneController implements Initializable {

    @FXML
    private BarChart<String, Double> sys_admin_user_bar_chart;
    @FXML
    private NumberAxis y_axis;
    @FXML
    private CategoryAxis x_axis;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backToHomePage(ActionEvent event) throws IOException {
        Parent p1 = FXMLLoader.load(getClass().getResource("UserPage1931291.fxml"));
        Scene s1 = new Scene(p1);
        Stage stg1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg1.setScene(s1);
        stg1.show();
    }
    
}
