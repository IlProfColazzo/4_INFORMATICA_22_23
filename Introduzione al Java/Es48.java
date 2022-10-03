package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che richiede di inserire un numero finché non si
 * inserisce un numero dispari. Quando questo avviene, il programma termina
 * scrivendo quanti numeri pari erano stati inseriti in precedenza.
 */
public class Es48 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Inserire un nuemro: ");
        int N = s.nextInt(), conta = 0;
        while (N % 2 == 0) {
            conta++;
            System.out.println("Inserire un nuemro: ");
            N = s.nextInt();
        }
        System.out.println("I numeri pari inseriti sono in totale: " + conta);

    }

}
