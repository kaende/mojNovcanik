package Registracija;

public class Login {
    private String ime, prezime;
    private int pin;

    public Login(String ime, String prezime, int pin) {
        this.ime = ime;
        this.prezime = prezime;
        this.pin = pin;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getPin() {
        return pin;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Korisnik: ").append(ime).append(" ").append(prezime).append("\n");

        return sb.toString();
    }
}


