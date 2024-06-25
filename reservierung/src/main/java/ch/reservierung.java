package ch;

import java.time.LocalDateTime;

public class Reservierung {
    private Kunde kunde;
    private LocalDateTime datum;

    public Reservierung(Kunde kunde, LocalDateTime datum) {
        this.kunde = kunde;
        this.datum = datum;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "Reservierung{" +
                "kunde=" + kunde +
                ", datum=" + datum +
                '}';
    }
}
