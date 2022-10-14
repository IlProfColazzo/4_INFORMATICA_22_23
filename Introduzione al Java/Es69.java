package introduzioneAlJava;

import java.util.Scanner;

/*
 * Dati in input i valori di una matrice quadrata, 
 * determinare se la matrice rappresenta un quadrato magico.
 */
public class Es69 {

    public static void main(String[] args) {

        final int N;
        int somma = 0;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Di quante righe e di quante colonne deve essere il quadrato? ");
        N = tastiera.nextInt();
        int mat[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Inserisci l'elemento di posizione " + i + " " + j);
                mat[i][j] = tastiera.nextInt();

            }
        }

        //controlla se dei numeri vengono ripetuti o non vengono proprio menzionati
        for (int n = 1; n <= N * N; n++) {
            int c = 0;
            for (int i = 0; i < N && c < 2; i++) {
                for (int j = 0; j < N && c < 2; j++) {
                    if (mat[i][j] == n) {
                        c++;
                        if (c > 1) {
                            System.out.println("Errore per numero ripetuto");
                            return;
                        }
                    }
                }
            }
            if (c == 0) {
                System.out.println("Errore per numero non trovato");
                return;
            }
        }

        //somma righe
        final int costanteMagica = (N * (N * N + 1)) / 2;
        for (int i = 0; i < N; i++) {
            somma = 0;
            for (int j = 0; j < N; j++) {
                somma = somma + mat[i][j];
            }
            if (somma != costanteMagica) {
                System.out.println("La somma della riga " + i + " e' sbagiata");
                return;
            }
        }

        //somma colonne
        for (int j = 0; j < N; j++) {
            somma = 0;
            for (int i = 0; i < N; i++) {
                somma = somma + mat[i][j];
            }
            if (somma != costanteMagica) {
                System.out.println("La somma della colonna " + j + " e' sbagiata");
                return;
            }
        }

        //somma diagonale principale
        somma = 0;
        for (int i = 0; i < N; i++) {
            somma = somma + mat[i][i];
        }

        if (somma != costanteMagica) {
            System.out.println("La somma della diagonale è sbagliata");
            return;
        }

        //somma diagonale esecondaria
        somma = 0;
        for (int i = 0; i < N; i++) {
            somma = somma + mat[i][N - 1 - i];
        }

        if (somma != costanteMagica) {
            System.out.println("La somma della diagonale opposta è sbagliata");
            return;
        }
        System.out.println("!!!Il quadrato è magico!!!");
    }
}
