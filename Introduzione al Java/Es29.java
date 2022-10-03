package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che visualizzi la differenza di due numeri a e b se il
 * loro prodotto è maggiore di 10, oppure la loro somma se il loro prodotto è
 * minore o uguale a 10.
 */
public class Es29 {

    public static void main(String[] args) {
        double a, b, p;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un a: ");
        a = scanner.nextDouble();
        System.out.println("Inserisci un b: ");
        b = scanner.nextDouble();

        p = a * b;

        if (p > 10) {
            System.out.println("Differenza tra a e b: " + (a - b));
        } else {
            System.out.println("Somma tra a e b: " + (a + b));
        }
    }

}
