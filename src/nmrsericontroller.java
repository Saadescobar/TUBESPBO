import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class nmrsericontroller {

    private Stage stage;
    private Scene scene;

    @FXML
    private Button button2;

    @FXML
    private TextArea ta_keluhan;

    @FXML
    private TextField tf_nmrseri;

    @FXML
    private TextField tf_perangkat;

    @FXML
    void onBTNcli(ActionEvent event) {
        // Validasi input
        if (tf_perangkat.getText().isEmpty() || tf_nmrseri.getText().isEmpty() || ta_keluhan.getText().isEmpty()) {
            System.out.println("Semua field harus diisi!");
            return;
        }

        try {
            Parent root = FXMLLoader.load(getClass().getResource("readonly_menu.fxml"));
            stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println("Error loading FXML file: " + e.getMessage());
        }
    }
}
