package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che legge 10 numeri in sequenza e li visualizza senza
 * stampare uno stesso numero due volte.
 */
public class Es62 {

    public static void main(String[] args) {
        int[] v = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < v.length; i++) {
            System.out.println("Inserisci un numero: ");
            v[i] = s.nextInt();
        }

        for (int currentPos = 0; currentPos < v.length; currentPos++) {
            int count = 0;
            for (int i = currentPos - 1; i >= 0; i--) {
                if (v[currentPos] == v[i]) {
                    count++;
                }
            }
            if (count < 1) {
                System.out.println(v[currentPos]);
            }

        }
    }
}
