package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che effettua il calcolo della media dei voti della
 * pagella, inserendoli uno alla volta e chiedendo a ogni inserimento di un voto
 * se i voti da inserire sono terminati accettando come risposta Si oppure No.
 */
public class Es58 {

    public static void main(String[] args) {
        double voto, sommaVoti = 0;
        int nVoti = 0;
        String risposta;

        Scanner tastiera = new Scanner(System.in);

        do {
            System.out.println("Inserisci un voto: ");
            voto = tastiera.nextDouble();
            sommaVoti += voto;
            nVoti++;

            do {
                System.out.println("Desideri inserire altri voti? (Si|No) ");
                risposta = tastiera.next();
            } while (!risposta.equals("No") && !risposta.equals("Si"));

        } while (!risposta.equals("No"));

        System.out.println("La media dei voti e': " + sommaVoti / nVoti);

    }

}
