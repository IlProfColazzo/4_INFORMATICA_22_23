package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che effettua il calcolo della media dei voti della
 * pagella, inserendoli uno alla volta e terminando con l’inserimento del numero
 * 0.
 */
public class Es57 {

    public static void main(String[] args) {
        int n, somma = 0, i = 0;
        
        Scanner tastiera = new Scanner(System.in);
        
        do {
            System.out.println("Inserisci numero: ");
            n = tastiera.nextInt();
            somma = somma + n;
            i++;

        } while (n != 0);
        System.out.println("La somma è: " + somma + " La media è di: " + somma / (i-1));

    }
}
