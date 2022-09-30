package introduzioneAlJava;

import java.util.Scanner;

/**
 * Si scriva un programma che permetta di acquisire da tastiera un numero intero
 * N. Successivamente dovrà essere effettuata la somma di N valori inseriti da
 * tastiera. Il programma: - inizialmente chiede all’utente quanti numeri
 * intende inserire; - in seguito chiede uno ad uno i dati; - infine stampa la
 * somma.
 */
public class Es42 {

    public static void main(String[] args) {
        double somma = 0;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci il valore di N");
        int N = tastiera.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Inserisci il numero");
            double numero = tastiera.nextDouble();
            somma += numero;
        }
        System.out.println("La somma e' " + somma + " e la media e' " + somma / N);
    }

}
