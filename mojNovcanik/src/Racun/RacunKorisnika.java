package Racun;

import GlavniMeni.Opcije;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RacunKorisnika {
    private double stanjeNaRacunu;

    public RacunKorisnika(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public void getStanjeNaRacunu() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        System.out.println("Trenutno stanje na racunu je: " + stanjeNaRacunu + "\n");
    }

    public void uplata(double iznos){
        stanjeNaRacunu = stanjeNaRacunu + iznos;
        getStanjeNaRacunu();
    }

    public void isplata(double iznos){
        if(iznos > stanjeNaRacunu){
            System.out.println("Nemate dovolno sredstava");
        }
        else{
            stanjeNaRacunu = stanjeNaRacunu - iznos;
        }
        getStanjeNaRacunu();
    }
}