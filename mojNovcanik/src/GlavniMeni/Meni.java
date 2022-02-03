package GlavniMeni;

import Racun.RacunKorisnika;

import java.util.Scanner;

public class Meni {
    Scanner sc = new Scanner(System.in);
    boolean kraj;
    RacunKorisnika racun = new RacunKorisnika(0);

    public void pokreniMeni(){
        dobrodosli();
        while (!kraj){
            pokreniOpcije();
            int izbor = unos();
            izvrsi(izbor);
        }
    }

    private void pokreniOpcije(){
        System.out.println("Unesite broj opcije: ");
        System.out.println("1. Uplata na racun");
        System.out.println("2. Isplata sa racuna");
        System.out.println("3. Proveri stanje");
        System.out.println("0. Exit \n");

    }

    private void dobrodosli() {
        System.out.println("---  DOBRODOSLI ---\n");
    }

    private int unos(){
        int izbor = -1;
        while (izbor < 0 || izbor > 3) {
            try {
                izbor = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Molim vas unesite broj opcije: ");
            }
        }
        return izbor;
    }

    private void izvrsi(int izbor){
        switch (izbor){
            case 0:
                System.out.println("Hvala sto koristite nasu banku!");
                System.exit(0);
                break;
            case 1:
                System.out.println("Koliko novca zelite da uplatite? ");
                racun.uplata(sc.nextDouble());
                break;
            case 2:
                System.out.println("Koliko novca zelite da podignete? ");
                racun.isplata(sc.nextDouble());
                break;
            case 3:
                racun.getStanjeNaRacunu();
                break;
            default:
                System.out.println("Greska");
        }
    }
}
