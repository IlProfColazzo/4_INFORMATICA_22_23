package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che legge un numero NUM e stampi a video la relativa
 * tabellina.
 */
public class Es45 {

    public static void main(String[] args) {
        int num;

        Scanner s = new Scanner(System.in);

        System.out.print("Inserisci NUM: ");
        num = s.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

}
