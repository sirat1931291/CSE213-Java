package mainpkg;

import java.io.BufferedReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author habib
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextArea ta_textOutput;
    @FXML
    private TextArea ta_textInput;
    @FXML
    private Label lbl_saved_status;
    
    String filename = "C:\\Users\\cis101\\Desktop\\CSE213\\Class Code\\11-03-2024\\Test File.txt";
    String binfilename = "C:\\Users\\cis101\\Desktop\\CSE213\\Class Code\\11-03-2024\\Bin Test File.txt";
    @FXML
    private Label label;
    @FXML
    private TableView<User> userTable;
    @FXML
    private TableColumn<User, String> tc_userId;
    @FXML
    private TableColumn<User, String> tc_password;
    
    ObservableList<User> userList;
    @FXML
    private Button loadBinary;
    @FXML
    private Button saveBinary;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tc_userId.setCellValueFactory(new PropertyValueFactory("userId"));
        tc_password.setCellValueFactory(new PropertyValueFactory("password"));
        
        userList = userTable.getItems();
//        generateData();
    }    

    
//    void generateData() {
//        userList.addAll(
//                new User("Habibullah", "12345"),
//                new User("Sirat", "12345")
//        );
//    }
    @FXML
    private void saveFile(ActionEvent event) throws Exception{
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filename));
            writer.write(ta_textInput.getText());
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            if (writer != null) {
                writer.close();
            }
        }
     
//        StringBuilder data = new StringBuilder();
//        for (User u : userList) {
//            data.append(u.getUserId());
//            data.append("\t");
//            data.append(u.getPassword());
//            data.append("\n");
//        }
//        
//        ta_textOutput.setText(data.toString());
        
        
//        BufferedWriter writer = null;
////        String data = ta_textInput.getText();
//        try {
//            writer = new BufferedWriter(new FileWriter(filename));
//            writer.write(data + "\n");
//            lbl_saved_status.setText("File saved successfully.");
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//            if (writer != null) {
//                writer.close();
//            }
//        }

//        My Home Code
//        String data = ta_textInput.getText();
//        try (BufferedWriter rt = new BufferedWriter(new FileWriter(filename, true))) {
//            rt.write(data + '\n');
//            lbl_saved_status.setText("File saved successfully.");
//        }
//        catch (IOException e) {
//            lbl_saved_status.setText("Something went wrong to write to file!!");
//        }
        
    }

    @FXML
    private void loadFile(ActionEvent event) throws IOException {
        Scanner s = null;
        
        try {
            s = new Scanner(new BufferedReader(new FileReader(filename)));
            userList.clear();
            while (s.hasNext()) {
                String userId = s.next();
                String password = s.next();
                userList.add(new User(userId, password));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
        
//        File file = null;
//        try (BufferedReader rd = new BufferedReader(new FileReader(filename))) {
//            String line;
//            while ((line = rd.readLine()) != null) {
//                sb.append(line).append("\n");
//            }
//            ta_textOutput.setText(sb.toString());
//        }
//        catch (IOException e) {
//            lbl_saved_status.setText("Something went wrong to read file");
//        }
    }

    @FXML
    private void prepareData(ActionEvent event) {
        StringBuilder data = new StringBuilder();
        for (User u : userList) {
            data.append(u.getUserId());
            data.append("\t");
            data.append(u.getPassword());
            data.append("\n");
        }
        
        ta_textOutput.setText(data.toString());
    }

    @FXML
    private void loadBinaryFile(ActionEvent event) throws IOException {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(binfilename));
            userList.clear();
            while (true) {
                User u = (User)ois.readObject();
                userList.add(u);
            }
            
        } 
        catch (IOException e) {
            e.printStackTrace();
            
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if (ois != null) {
                ois.close();
            }
        }
    }

    @FXML
    private void saveBinaryFile(ActionEvent event) throws IOException {
        ObjectOutputStream oos = null;
        
        try {
            oos = new ObjectOutputStream(new FileOutputStream(binfilename));
            for (User u : userList) {
                oos.writeObject(u);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (oos != null) {
                oos.close();
            }
        }
    }
    
}
