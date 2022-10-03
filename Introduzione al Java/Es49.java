package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che legge una sequenza di numeri interi positivi
 * terminati con l’immissione del numero 0 e ne ricerca i valori minimo e
 * massimo visualizzandoli sullo schermo.
 */
public class Es49 {

    public static void main(String[] args) {
        int N = 1;

        Scanner tastiera = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (N != 0) {
            System.out.println("Dammi un numero: ");
            N = tastiera.nextInt();
            if (N != 0) {
                if (N > max) {
                    max = N;
                }
                if (N < min) {
                    min = N;
                }
            }
        }
        System.out.println("Il valore massimo inserito e' " + max);
        System.out.println("Il valore minimo inserito e' " + min);
    }

}
