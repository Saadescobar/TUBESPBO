import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.util.Random;

public class rdonly_controller {

    @FXML
    private TextField rdonly_antrian;

    @FXML
    private TextField rdonly_lokasi;

    
    private String generateBookingCode() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder bookingCode = new StringBuilder();
        
        for (int i = 0; i < 6; i++) {
            int randomIndex = random.nextInt(characters.length());
            bookingCode.append(characters.charAt(randomIndex));
        }
        
        return bookingCode.toString();
    }

    
    @FXML
    public void initialize() {
        // Generate kode booking
        String bookingCode = generateBookingCode();
        
        
        rdonly_antrian.setText(bookingCode);
        
        
        String lokasiService = "PT. SERVICE BERKELAS - Jakarta Barat"; 
        rdonly_lokasi.setText(lokasiService);
    }
}
