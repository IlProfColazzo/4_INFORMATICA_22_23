package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che dato un numero in input, scriva a video un messaggio
 * che indichi se il numero è maggiore o minore di 10
 */
public class Es21 {

    public static void main(String args[]) {
        final int N = 10;
        
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Inserisci il numero:");
        int num = tastiera.nextInt();
        if (num == 10) {
            System.out.println("Il numero è 10");
        } else if (num > 10) {
            System.out.println("Il numero è maggiore di 10");
        } else {
            System.out.println("Il numero è minore di 10");
        }
    }
}
