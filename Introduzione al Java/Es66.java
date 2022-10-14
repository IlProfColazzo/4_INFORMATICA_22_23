package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivere un programma che permetta di allocare una matrice di 
 * interi di dimensione 10 righe e 5 colonne. 
 * Il programma memorizzerà all’interno della matrice 50 
 * valori inseriti dall’utente e visualizzerà in output i valori 
 * inseriti.
 */
public class Es66 {

    public static void main(String[] args) {
        final int N = 10, M = 5;
        int mat[][] = new int[N][M];

        Scanner tastiera = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println("Inserisci l'elemento di posizione " + i + " " + j);
                mat[i][j] = tastiera.nextInt();
            }
        }
        System.out.println("Ecco gli elementi della matrice:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
