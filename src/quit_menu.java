import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class quit_menu {
    @FXML
    private Button btn_no;
    @FXML
    //No action to not close the stage
    void no_action(ActionEvent event) {
        Stage stage = (Stage) btn_no.getScene().getWindow();
        stage.close();
    }
    @FXML
    //Yes action to close the stage
    void yes_action(ActionEvent event) {
        System.exit(0);
    }
}

