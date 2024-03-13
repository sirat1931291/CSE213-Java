/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Side;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author cis101
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private PieChart chart;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws FileNotFoundException {
        
        
        ObservableList<PieChart.Data> chartData = FXCollections.observableArrayList();
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader("C:\\Users\\cis101\\Desktop\\CSE213\\13-03-2024\\Text.txt")));
            while (s.hasNext()) {
                String category = s.next();
                double value = s.nextDouble();
                chartData.add(new PieChart.Data(category, value));
                
            }
        }
        catch(IOException e) {
            e.printStackTrace();
            label.setText("Something went wrong!");
        }
        finally {
            if (s != null) {
                s.close();
            }
        }
        
//        ObservableList<PieChart.Data> chartData = FXCollections.observableArrayList(
//                new PieChart.Data("A", 5),
//                new PieChart.Data("B", 11),
//                new PieChart.Data("C", 14),
//                new PieChart.Data("D", 7),
//                new PieChart.Data("F", 3));
        chart.setData(chartData);
        chart.setTitle("CSE 213 Grade Distribution");
        chart.setLegendSide(Side.RIGHT);
//        chart.setLegendVisible(false);
        chart.setStartAngle(90);
//        chart.setClockwise(false);


//        XYChart.Series series1 = new XYChart.Series();
//        series1.setName("2003");       
//        series1.getData().add(new XYChart.Data(austria, 25601.34));
//        series1.getData().add(new XYChart.Data(brazil, 20148.82));
//        series1.getData().add(new XYChart.Data(france, 10000));
//        series1.getData().add(new XYChart.Data(italy, 35407.15));
//        series1.getData().add(new XYChart.Data(usa, 12000));      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onMOusePressed(MouseEvent event) {
    }
    
}
