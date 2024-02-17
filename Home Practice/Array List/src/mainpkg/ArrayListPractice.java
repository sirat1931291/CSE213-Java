package mainpkg;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>();
        ArrayList list2 = new ArrayList<>();
        list1.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list1.addAll(list2);
        System.out.println(list1);
        System.out.println(list2);
    }    
}