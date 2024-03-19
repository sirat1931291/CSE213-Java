/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

/**
 * FXML Controller class
 *
 * @author habib
 */
public class SystemAdminPieChartSceneController implements Initializable {

    @FXML
    private PieChart sys_admin_user_pie_chart;
    
    ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
        BufferedReader reader = new BufferedReader(new FileReader("pie_chart_data.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0].trim();
            double value = Double.parseDouble(parts[1].trim());
            pieChartData.add(new PieChart.Data(name, value));
        }
        reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    sys_admin_user_pie_chart.setData(pieChartData);
    sys_admin_user_pie_chart.setTitle("Total User");
    }
}
