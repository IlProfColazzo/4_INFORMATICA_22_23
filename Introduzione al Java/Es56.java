package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che effettua la somma dei numeri inseriti dall'utente
 * fino a raggiungere o superare il numero 1000 e indica quanti numeri sono
 * stati sommati
 */
public class Es56 {

    public static void main(String args[]) {
        int sum = 0, N = 0;

        Scanner tastiera = new Scanner(System.in);

        do {
            System.out.println("Inserisci il numero:");
            sum += tastiera.nextInt();
            N++;
        } while (sum < 1000);
        System.out.println("Sono stati inseriti " + N + " numeri.");
    }
}
