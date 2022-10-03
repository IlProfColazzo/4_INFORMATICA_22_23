package introduzioneAlJava;

import java.util.Scanner;

/**
 * Un supermercato applica uno sconto del 20% sull’importo che supera i 100€:
 * scrivi un programma che, leggendo il totale della spesa, calcola l’eventuale
 * importo scontato.
 */
public class Es24 {

    public static void main(String[] args) {
        final int psconto = 20;
        final double soglia = 100;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("inserire l'importo della spesa:");
        double spesa = tastiera.nextDouble();
        double totale = spesa;
        if (spesa > soglia) {
            spesa -= soglia;
            double sconto = (spesa * psconto) / 100;
            totale = spesa - sconto + soglia;
        }
        System.out.println("L'importo da pagare e' di: " + totale);
    }

}
