package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivere un programma che permetta di acquisire i valori di 
 * una matrice 10x10 e successivamente presenti all’utente 
 * un menù che permetta di:
 * visualizzare il contenuto della matrice
 * visualizzare la matrice trasposta
 * visualizzare il valore massimo
 * visualizzare il valore minimo
 * visualizzare solo gli elementi pari
 * visualizzare solo gli elementi dispari
 * visualizzare la media dei valori contenuti.
 */
public class Es67 {

    public static void main(String[] args) {
        final int N = 5, M = 2;
        int risposta;
        int mat[][] = new int[N][M];

        Scanner tastiera = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println("Inserisci l'elemento di posizione " + i + " " + j);
                mat[i][j] = tastiera.nextInt();
            }
        }
        System.out.println("Come vuoi procedere:");
        System.out.println("1: Visualizzare la matrice");
        System.out.println("2: Visualizzare la matrice trasposta");
        System.out.println("3: Visualizzare il valore massimo");
        System.out.println("4: Visualizzare il valore minimo");
        System.out.println("5: Visualizzare solo gli elementi pari");
        System.out.println("6: Visualizzare solo gli elementi dispari");
        System.out.println("7: Visualizzare la media dei valori");
        risposta = tastiera.nextInt();

        switch (risposta) {
            case 1:
                System.out.println();
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        System.out.print(mat[i][j] + " ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println();
                for (int j = 0; j < M; j++) {
                    for (int i = 0; i < N; i++) {
                        System.out.print(mat[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                int max = Integer.MIN_VALUE;
                System.out.println();
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        if (mat[i][j] > max) {
                            max = mat[i][j];
                        }
                    }
                }
                System.out.println("Il valore massimo è " + max);
                break;
            case 4:
                int min = Integer.MAX_VALUE;
                System.out.println();
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        if (mat[i][j] < min) {
                            min = mat[i][j];
                        }
                    }
                }
                System.out.println("Il valore minimo è " + min);
                break;
            case 5:
                System.out.println();
                System.out.println("I valori pari sono:");
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        if (mat[i][j] % 2 == 0) {
                            System.out.print(" " + mat[i][j]);
                        }
                    }
                }
                break;
            case 6:
                System.out.println();
                System.out.println("I valori dipari sono:");
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        if (mat[i][j] % 2 != 0) {
                            System.out.print(" " + mat[i][j]);
                        }
                    }
                }
                break;
            case 7:
                float somma = 0, media = 0;
                System.out.println();
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        somma += mat[i][j];
                    }
                    media = somma / N * M;
                    System.out.println("La media dei valori è: " + media);
                    break;
                }
        }
    }

}
