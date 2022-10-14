package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivere un programma che dopo aver chiesto in input le prime dodici cifre di
 * un codice EAN 13 calcoli e visualizzi il check digit.
 */
public class Es64 {
    public static void main(String[] args) {
        
        final int N = 12;
        int V[] = new int[N];
        
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Inserisci il codice EAN 13:");
        int somma = 0;
        for (int i = 0; i < N; i++) {
            V[i] = tastiera.nextInt();
            if (i % 2 == 1) {
                somma += V[i] * 3;
            } else {
                somma += V[i];
            }
        }
        System.out.println("Il codice di controllo è " + (10 - (somma % 10)));
    }
}
