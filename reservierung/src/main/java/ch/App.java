package ch;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Reservierung> reservierungen = new ArrayList<>();

        
        reservierungen.add(new Reservierung(new Kunde("Max Mustermann", "0123456789"), LocalDateTime.now()));
        reservierungen.add(new Reservierung(new Kunde("Erika Mustermann", "0987654321"), LocalDateTime.now().plusDays(1)));

        
        for (Reservierung reservierung : reservierungen) {
            System.out.println(reservierung);
        }

        
        String suchName = "Max Mustermann";
        for (Reservierung reservierung : reservierungen) {
            if (reservierung.getKunde().getName().equals(suchName)) {
                System.out.println("Gefundene Reservierung: " + reservierung);
            }
        }
    }
}
