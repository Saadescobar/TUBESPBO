import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class confir_booking_controller {
    private Stage stage;
    private Scene scene;

    @FXML
    private Button btn_belm;

    @FXML
    private Button btn_sudah;

    @FXML
    void on_btn_blm(ActionEvent event) throws Exception {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Anda belum melakukan booking");
        alert.showAndWait();
        Parent root = FXMLLoader.load(getClass().getResource("nama.fxml"));
        stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void on_btn_ya(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Anda sudah melakukan booking");
        alert.showAndWait();
        try{
            Parent root = FXMLLoader.load(getClass().getResource("sdh_book.fxml"));
            stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }

    

    }

}
