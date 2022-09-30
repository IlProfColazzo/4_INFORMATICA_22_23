package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivere un programma che permetta di allocare un vettore di interi di
 * dimensione 10. Il programma memorizzerà all’interno del vettore 10 valori
 * inseriti dall’utente e visualizzerà in output la sequenza al contrario.
 */
public class Es59 {

    public static void main(String[] args) {
        final int N = 10;
        int v[] = new int[N];

        Scanner tastiera = new Scanner(System.in);

        for (int i = 0; i < v.length; i++) {
            System.out.println("Dammi l'elemento numero " + (i + 1));
            v[i] = tastiera.nextInt();
        }
        System.out.println("Ecco gli elementi al contrario");
        for (int i = N - 1; i >= 0; i--) {
            System.out.println("Elemento numero " + (i + 1) + " = " + v[i]);
        }
    }

}
