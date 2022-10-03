package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che legge un numero intero compreso tra 0 e 255 e lo
 * trasforma in un numero binario utilizzando un vettore di dimensione 8.
 */
public class Es61 {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int n, resto, i = 7;
        int v[] = new int[8];
        do {
            System.out.println("Inserire il numero da convertire: ");
            n = tastiera.nextInt();
        } while (n < 0 || n > 255);
        
        while (n > 0) {
            resto = n % 2;
            v[i] = resto;
            n /= 2;
            i -= 1;
        }
        
        for (int e : v) {
            System.out.print(e);
        }
        System.out.println("");
    }

}
