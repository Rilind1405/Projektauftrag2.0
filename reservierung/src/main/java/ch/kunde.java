package ch;

public class Kunde {
    private String name;
    private String telefonnummer;

    public Kunde(String name, String telefonnummer) {
        this.name = name;
        this.telefonnummer = telefonnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "name='" + name + '\'' +
                ", telefonnummer='" + telefonnummer + '\'' +
                '}';
    }
}
