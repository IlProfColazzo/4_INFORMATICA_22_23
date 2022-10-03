package introduzioneAlJava;

import java.util.Scanner;

/*
 * Scrivi un programma che legge una sequenza NUM numeri interi e ne ricerca
 * il valore massimo e minimo visualizzandoli sullo schermo
 */
public class Es44 {

    public static void main(String[] args) {
        int nNumeri, numero;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Quanti sono i numeri che vuoi inserire? ");
        nNumeri = tastiera.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < nNumeri; i++) {
            System.out.println("Insersci un valore: ");
            numero = tastiera.nextInt();
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
        }
        System.out.println("Il numero massimo inserito è: " + max);
        System.out.println("Il numero minimo inserito è: " + min);
    }
}
