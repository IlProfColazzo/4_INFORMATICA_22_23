package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivere un programma che permetta di acquisire i valori di un vettore di
 * lunghezza 10 e successivamente presenti all’utente un menù che permetta di:
 * visualizzare il contenuto del vettore visualizzare il contenuto del vettore
 * in ordine inverso visualizzare il valore massimo visualizzare il valore
 * minimo visualizzare solo gli elementi pari visualizzare solo gli elementi
 * dispari visualizzare la media dei valori contenuti.
 */
public class Es63 {

    public static void main(String[] args) {

        int scelta = 0;
        final int N = 10;
        int v[] = new int[N];

        Scanner tastiera = new Scanner(System.in);

        for (int i = 0; i < v.length; i++) {
            System.out.println("inserisci l'elemento numero " + (i + 1));
            v[i] = tastiera.nextInt();
        }

        System.out.println("1. visualizza il contenuto del vettore ");
        System.out.println("2. visualizza il contenuto del vettore in ordine inverso ");
        System.out.println("3. visualizza il valore massimo ");
        System.out.println("4. visualizza il valore minimo ");
        System.out.println("5. visualizza solo gli elementi pari ");
        System.out.println("6. visualizza solo gli elementi dispari ");
        System.out.println("7. visualizza la media dei valori contenuti. ");

        switch (scelta) {
            case 0:
                System.out.println("");
                break;
            case 1:
                for (int i = 0; i < N; i++) {
                    System.out.println("Elemento numero " + (i + 1) + " = " + v[i]);
                }
                break;
            case 2:
                for (int i = N - 1; i >= 0; i--) {
                    System.out.println("Elemento numero " + (i + 1) + " = " + v[i]);
                }
                break;
            case 3: {
                int max = Integer.MIN_VALUE;
                for (int i = 0; i < v.length; i++) {
                    if (v[i] > max) {
                        max = v[i];
                    }
                }
                System.out.println("Il valore massimo: " + max);
                break;
            }
            case 4: {
                int min = Integer.MAX_VALUE;
                for (int i = 0; i < v.length; i++) {
                    if (v[i] < min) {
                        min = v[i];
                    }
                }
                System.out.println("IL Valore minimo: " + min);
                break;
            }
            case 5: {
                System.out.println("Elementi pari nel vettore: ");
                for (int i = 0; i < v.length; i++) {
                    if (v[i] % 2 == 0) {
                        System.out.println(v[i]);
                    }
                }
                break;
            }
            case 6: {
                System.out.println("Elementi dispari nel vettore: ");
                for (int i = 0; i < v.length; i++) {
                    if (v[i] % 2 != 0) {
                        System.out.println(v[i]);
                    }
                }
                break;
            }
            case 7: {
                System.out.println("La media elementi nel vettore: ");
                int somma = 0;
                for (int i = 0; i < v.length; i++) {
                    somma += v[i];
                }
                int media = somma / v.length;
                System.out.println(media);
                break;
            }
            default:
                System.out.println("Errore");
                break;
        }
    }
}
