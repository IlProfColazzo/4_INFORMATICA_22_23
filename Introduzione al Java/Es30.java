package introduzioneAlJava;

import java.util.Scanner;

/**
 * Dati tre numeri, visualizza solo quelli che sono maggiori di 75.
 */
public class Es30 {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci il primo numero: ");
        int n1 = tastiera.nextInt();
        System.out.println("Inserisci il secondo numero: ");
        int n2 = tastiera.nextInt();
        System.out.println("Inserisci il terzo numero: ");
        int n3 = tastiera.nextInt();

        if (n1 > 75) {
            System.out.println("Il numero: " + n1 + " è maggiore di 75");
        }
        if (n2 > 75) {
            System.out.println("Il numero: " + n2 + " è maggiore di 75");
        }
        if (n3 > 75) {
            System.out.println("Il numero: " + n3 + " è maggiore di 75");
        }
    }

}
