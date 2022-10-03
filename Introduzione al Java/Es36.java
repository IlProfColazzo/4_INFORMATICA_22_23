package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivere un programma che permette di leggere due valori interi da tastiera e
 * stampa a video un messaggio che indica se entrambi i valori sono positivi.
 */
public class Es36 {

    public static void main(String[] args) {
        int a, b;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("inserire il primo valore:");
        a = tastiera.nextInt();
        System.out.println("inserire il secondo valore: ");
        b = tastiera.nextInt();
        if (a > 0 && b > 0) {
            System.out.println("Entrambi i valori sono positivi.");
        } else {
            System.out.println("Hai inserito valori negativi.");
        }
    }
}