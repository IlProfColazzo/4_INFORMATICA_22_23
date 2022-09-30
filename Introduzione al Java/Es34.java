package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivere un programma che, in base all’età, indichi se si ha diritto
 * all’ingresso gratuito in un museo. I bambini con meno di 10 anni e gli
 * anziani con più di 80 anni non pagano il biglietto
 */
public class Es34 {

    public static void main(String[] args) {
        int eta;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Introduci l'età: ");
        eta = tastiera.nextInt();
        if (eta > 10 && eta < 80) {
            System.out.println("Devi pagare il biglietto");
        } else {
            System.out.println("Hai diritto al biglietto gratuito");
        }
    }

}
