package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class ArithmeticOperationController implements Initializable {

    @FXML
    private TextField xTextField;
    @FXML
    private TextField yTextField;
    @FXML
    private Label resultLabel;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    

    @FXML
    private void addButtonOnMouseClicked(MouseEvent event) {
        int xVal = Integer.parseInt(xTextField.getText());
        int yVal = Integer.parseInt(yTextField.getText());
        int result = xVal + yVal;
        resultLabel.setText(
                "Result\n" + Integer.toString(result)
        );
    }

    @FXML
    private void multiplyButtonOnMouseClicked(ActionEvent event) {
        int xVal = Integer.parseInt(xTextField.getText());
        int yVal = Integer.parseInt(yTextField.getText());
        int result = xVal * yVal;
        resultLabel.setText(
                "Result\n" + Integer.toString(result)
        );
    }

    @FXML
    private void subtractButtonOnMouseClicked(ActionEvent event) {
        resultLabel.setText(
                "Result\n" + Integer.toString(
                    Integer.parseInt(xTextField.getText()) - Integer.parseInt(yTextField.getText())
                )
        );
    }

    @FXML
    private void divisionButtonOnMouseClicked(MouseEvent event) {
        resultLabel.setText(
            "Result\n" + Double.toString(
                    Double.parseDouble(xTextField.getText()) / Double.parseDouble(yTextField.getText()))
            );
    }
    
}
