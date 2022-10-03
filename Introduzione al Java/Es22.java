package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che dato un numero in input, scriva a video un messaggio
 * che indichi se il numero è pari o dispari. (Hint: utilizzare l’operatore %).
 */
public class Es22 {

    public static void main(String[] args) {
        int N;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Inserisci n: ");
        N = s.nextInt();

        if (N % 2 == 0) {
            System.out.println(N + " è pari");
        } else {
            System.out.println(N + " è dispari");
        }

    }

}
