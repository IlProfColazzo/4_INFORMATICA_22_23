package introduzioneAlJava;

import java.util.Scanner;

/*
 * Scrivi un programma che legge da tastiera una sequenza di lunghezza ignota a priori di numeri interi positivi. Il programma, a partire dal primo
 * numero introdotto, stampa ogni volta la media di tutti i numeri introdotti. Termina quando il numero inserito è negativo.
 */
public class Es51 {

    public static void main(String[] args) {
        int n, s = 0, i = 0;
        double m = s;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("inserisci un numero: ");
        n = tastiera.nextInt();
        while (n >= 0) {
            i += 1;
            System.out.println("Inserisci un numero: ");
            n = tastiera.nextInt();
            s += n;
            m = s / i;
            System.out.println("La media dei numeri introdotti e': " + m);
        }
    }

}
