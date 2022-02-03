package GlavniMeni;
import Registracija.Login;
import java.util.Scanner;


public class Opcije {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Meni izbor = new Meni();

        System.out.println("Dobrodosli, da biste se registrovali unesite vase ime i prezime: ");
        String ime = sc.next(), prezime = sc.next();

        System.out.println("Postavite PIN");
        int pin = sc.nextInt();
        Login korisnik = new Login(ime, prezime, pin);
        System.out.println("Kako biste nastavili molim vas potvrdite vas PIN");
        int pinPotvrda = sc.nextInt();

        if(korisnik.getPin() == pinPotvrda){
            System.out.println("Uspesno ste ulogovani");
            System.out.println(korisnik);
            izbor.pokreniMeni();
        }
        else{
            int brojPokusaja = 0;
            while (korisnik.getPin() != pinPotvrda && brojPokusaja < 2){
                System.out.println("Pogresan PIN, pokusajte ponovo");
                brojPokusaja++;
                int pinPotvrda1 = sc.nextInt();
                if(pinPotvrda1 == korisnik.getPin()){
                    System.out.println(korisnik);
                    izbor.pokreniMeni();
                    break;
                }
                if(brojPokusaja == 2){
                    System.out.println("Racun je blokiran!");
                }
            }
        }
    }
}

