package ch;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        Kunde kunde = new Kunde("Max Mustermann", "0123456789");
        Reservierung reservierung = new Reservierung(kunde, LocalDateTime.now());

        System.out.println(kunde);
        System.out.println(reservierung);
    }
}
