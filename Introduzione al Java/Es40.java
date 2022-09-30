package introduzioneAlJava;

import java.util.Scanner;

/**
 * Dato un numero intero tra 1 e 12, che rappresenta il mese corrente, stampare
 * il nome del mese per esteso (“Gennaio” ... “Dicembre”). Utilizzare il
 * costrutto switch.
 */
public class Es40 {

    public static void main(String[] args) {
        int mese;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Introduci un numero: ");
        mese = tastiera.nextInt();

        switch (mese) {
            case 1:
                System.out.println("Gennaio");
                break;
            case 2:
                System.out.println("Febbraio");
                break;
            case 3:
                System.out.println("Febbraio");
                break;
            case 4:
                System.out.println("Febbraio");
                break;
            case 5:
                System.out.println("Febbraio");
                break;
            case 6:
                System.out.println("Febbraio");
                break;
            case 7:
                System.out.println("Febbraio");
                break;
            case 8:
                System.out.println("Febbraio");
                break;
            case 9:
                System.out.println("Febbraio");
                break;
            case 10:
                System.out.println("Febbraio");
                break;
            case 11:
                System.out.println("Novembre");
                break;
            case 12:
                System.out.println("Dicembre");
                break;
            default:
                System.out.println("Mese errato");
                break;
        }
    }

}
