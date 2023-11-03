package lk.ijse.restomaster.controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class TraditionalfoodFormController {
    public AnchorPane tfselectionroot;
    public Button btnplaceorder;


    public void selectionback(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/selection_form.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        tfselectionroot.getScene().getWindow().hide();
    }

    public void btnplaceorderonaction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/manage_orders_form.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        //tfselectionroot.getScene().getWindow().hide();
    }
}
