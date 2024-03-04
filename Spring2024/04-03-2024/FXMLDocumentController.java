package mainpkg;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import java.io.BufferedReader;

/**
 *
 * @author cis101
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    private String filename = "C:\\Users\\cis101\\Desktop\\CSE213\\Class Code\\04-03-2024\\Java Application\\text.txt";
    @FXML
    private TextArea textArea;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveFile(ActionEvent event) {
    }

    @FXML
    private void loadFile(ActionEvent event) {
        System.out.println("Hello");
        try{
            String data = ""; 
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            
            while (line != null && line.isEmpty()) {
                data += line + '\n';
//                line = reader.readLine();
                System.out.println(data);
            }
            textArea.setText(data);
        }
        catch (IOException e) {
            textArea.setText("Wrong");
        }
    }
}
