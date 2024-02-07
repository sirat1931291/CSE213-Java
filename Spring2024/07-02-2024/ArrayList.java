/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author cis101
 */
public class MyApplication00 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
        List <Customer> listA = new ArrayList<>();
        listA.add(new Customer("Sirat", "M", 24));
        listA.add(new Customer("Nishat", "F", 20));
        
        System.out.println(listA);
        
        List <Customer> listB = new ArrayList<>();
        
        for (int i = 0; i < listA.size(); i++){
            Customer c = listA.get(i);
            
            if (c.Gender == "F") {
                listB.add(c);
            }
        }
        
        System.out.println(listB);
    };
    
}
