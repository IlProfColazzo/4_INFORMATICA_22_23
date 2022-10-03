package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che legge una sequenza di numeri interi terinati con uno
 * 0 e visualizza quanti numeri sono stati inseriti (nel conteggio e' compreso
 * lo 0).
 */
public class Es54 {

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        int i = 0;
        double numero;

        do {
            System.out.println("Inserisci un numero (inserendo 0 la sequenza di inserimento terminera').");
            numero = tastiera.nextDouble();
            i++;
        } while (numero != 0);
        System.out.println("Hai inserito " + i + " numeri (0 incluso)");
    }

}
