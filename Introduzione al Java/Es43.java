package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che legge un numero NUM e visualizza tutti i numeri pari
 * inferiori a tale numero.
 */
public class Es43 {

    public static void main(String[] args) {
        int num = 0;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserire il numero desiderato: ");

        num = tastiera.nextInt();

        System.out.println("I numeri pari inferiori di " + num + " sono:");
        for (int i = num - 1; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        /*
        //Soluzione più efficiente
        for (int i = num - 1; i > 0; i-=2) {
            System.out.println(i);
        }
        */
    }

}
