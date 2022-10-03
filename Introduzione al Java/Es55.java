package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che legge da tastiera una sequenza di numeri interi
 * terminata con un numero negativo e al termine stampa a video il numero dei
 * numeri letti (escluso l’ultimo inserito) che sono maggiori di 0 e il numero
 * di valori che sono uguali a 0.
 */
public class Es55 {

    public static void main(String[] args) {
        int contatore = 0, zero = 0, numero;

        Scanner tastiera = new Scanner(System.in);

        do {
            System.out.println("Inserire un numero: ");
            numero = tastiera.nextInt();
            if (numero > 0) {
                contatore++;
            }
            if (numero == 0) {
                zero++;
            }
        } while (numero >= 0);
        System.out.println("I numeri maggiori di zero sono in totale: " + contatore);
        System.out.println("I numeri uguali a zero sono in totale: " + zero);

    }
}
