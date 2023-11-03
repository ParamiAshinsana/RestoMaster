package lk.ijse.restomaster.controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SeafoodFormController {
    public AnchorPane sfselectionroot;

    public void selectionback(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/selection_form.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        sfselectionroot.getScene().getWindow().hide();
    }

    public void btnplaceorderonaction(ActionEvent actionEvent) {

    }
}
