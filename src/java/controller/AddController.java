package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class AddController {

    @FXML
    private VBox addWindow;

    public void addOnClick(ActionEvent actionEvent) {
    }

    public void closeOnClick(ActionEvent actionEvent) {
        Stage dlg = (Stage) addWindow.getScene().getWindow();
        dlg.getOnCloseRequest()
                .handle(new WindowEvent(dlg, WindowEvent.WINDOW_CLOSE_REQUEST));
        dlg.close();
    }
}
