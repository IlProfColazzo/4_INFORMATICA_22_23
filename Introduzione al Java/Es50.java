package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che legge una serie di numeri interi positivi
 * arrestandosi quando la somma dei numeri immessi supera un valore costante
 * letto come primo numero della sequenza
 */
public class Es50 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero costante: ");
        int num = scanner.nextInt();
        int somma = 0;

        while (somma < num) {
            System.out.println("Inserisci il numero: ");
            int n = scanner.nextInt();
            somma = somma + n;
        }
    }

}
