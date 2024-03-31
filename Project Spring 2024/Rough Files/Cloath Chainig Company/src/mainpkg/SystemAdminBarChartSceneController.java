package mainpkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
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
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class SystemAdminBarChartSceneController implements Initializable {

    @FXML
    private BarChart<String, Double> sys_admin_user_bar_chart;
    @FXML
    private NumberAxis yAxis;
    @FXML
    private CategoryAxis xAxis;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        String fileName = "bar_chart_data.txt";
        List<String[]> data = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                data.add(line.split(","));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + fileName);
        }

        if (data.isEmpty()) {
            System.out.println("Error: No data found in file!");
            return;
        }
        String[] categories = new String[data.size()];
        List<XYChart.Series<String, Double>> seriesList = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            categories[i] = data.get(i)[0];
            XYChart.Series<String, Double> series = new XYChart.Series<>();
            series.setName(data.get(i)[1]);
            for (int j = 2; j < data.get(i).length; j++) {
                series.getData().add(new XYChart.Data<>(categories[i], Double.parseDouble(data.get(i)[j])));
            }
            seriesList.add(series);
        }
        
        xAxis.setLabel("Categories");
        xAxis.setCategories(FXCollections.observableArrayList(categories));
        
        sys_admin_user_bar_chart.getData().addAll(seriesList);
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
