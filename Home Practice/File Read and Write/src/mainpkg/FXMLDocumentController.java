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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
    
    String filename = "D:\\Coding\\CSE 213\\Practice\\File read and Write\\File Read and Write\\Test File.txt";
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveFile(ActionEvent event) {
        String data = ta_textInput.getText();
        try (BufferedWriter rt = new BufferedWriter(new FileWriter(filename, true))) {
            rt.write(data + '\n');
            lbl_saved_status.setText("File saved successfully.");
        }
        catch (IOException e) {
            lbl_saved_status.setText("Something went wrong to write to file!!");
        }
    }

    @FXML
    private void loadFile(ActionEvent event) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader rd = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line).append("\n");
            }
            ta_textOutput.setText(sb.toString());
        }
        catch (IOException e) {
            lbl_saved_status.setText("Something went wrong to read file");
        }
    }
    
}
