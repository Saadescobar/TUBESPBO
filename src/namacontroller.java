import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class namacontroller {
    private Stage stage;
    private Scene scene;

    @FXML
    private Button btn_back;

    @FXML
    private Button btn_lanjut;

    @FXML
    private ChoiceBox<String> chNegara; 

    @FXML
    private ChoiceBox<String> ch_lokasi; 

    @FXML
    private ChoiceBox<String> chpermasalahan; 

    @FXML
    private TextField tfName;

    @FXML
    public void initialize() {
        loadPermasalahan();
        loadWilayah();
        loadLokasi();
    }

    private void loadPermasalahan() {
        String[] permasalahan = {
            "Lagging",
            "Muncul Lampu Peringatan",
            "Bluescreen",
            "Pemasangan Hardware",
            "Kerusakan Software",
            "Pembaruan Sistem",
            "Kerusakan Fisik",
            "Overheating",
            "Baterai Cepat Habis",
            "Layar Pecah",
            "Suara Tidak Keluar",
            "Port Tidak Berfungsi",
            "Masalah Koneksi Internet"
        };

        chpermasalahan.getItems().addAll(permasalahan); 
    }

    private void loadWilayah() {
        String[] wilayah = {
            "Jakarta Barat",
            "Jakarta Timur",
            "Jakarta Selatan",
            "Jakarta Utara",
            "Jakarta Pusat",
            "Bekasi",
            "Depok",
            "Tangerang",
            "Bogor"
        };

        chNegara.getItems().addAll(wilayah); 
    }

    private void loadLokasi() {
        String[] lokasi = {
            "PT. SERVICE BERKELAS - Jakarta Barat",
            "PT. SERVICE BERKELAS - Jakarta Timur",
            "PT. SERVICE BERKELAS - Jakarta Selatan",
            "PT. SERVICE BERKELAS - Jakarta Utara",
            "PT. SERVICE BERKELAS - Jakarta Pusat",
            "PT. SERVICE BERKELAS - Bekasi",
            "PT. SERVICE BERKELAS - Depok",
            "PT. SERVICE BERKELAS - Tangerang",
            "PT. SERVICE BERKELAS - Bogor"
        };

        ch_lokasi.getItems().addAll(lokasi); 
    }

     @FXML
    void onBTNbackclick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("confir_booking_controller.fxml"));
            stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println("Error loading FXML file: " + e.getMessage());
        }
    }

    @FXML
    void onBTNlnjtclick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("nmrseri.fxml"));
            stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println("Error loading FXML file: " + e.getMessage());
        }
    }
}

