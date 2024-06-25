package ch;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.time.LocalDateTime;

public class PrimaryController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField telefonField;

    @FXML
    private ListView<Reservierung> reservierungListView;

    @FXML
    private void handleAddReservierung() {
        String name = nameField.getText();
        String telefon = telefonField.getText();

        if (!name.isEmpty() && !telefon.isEmpty()) {
            Kunde kunde = new Kunde(name, telefon);
            Reservierung reservierung = new Reservierung(kunde, LocalDateTime.now());
            reservierungListView.getItems().add(reservierung);
            nameField.clear();
            telefonField.clear();
        }
    }
}
