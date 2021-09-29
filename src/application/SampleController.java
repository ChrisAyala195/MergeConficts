package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SampleController {

    @FXML
    private Button btn;

    @FXML
    void btnPress(ActionEvent event) {
    	System.out.print("Go Spurs Go!\n");
    }

}
