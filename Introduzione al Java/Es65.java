package introduzioneAlJava;

import java.util.Scanner;

/**
 * Si realizzi un programma in linguaggio Java che permetta di accettare o
 * rifiutare delle serie di misurazioni di calibrazione di uno strumento di
 * laboratorio utilizzando le regole di Westgard. L’utente inserisce due dati da
 * tastiera: un parametro (float) chiamato limite di controllo (CL) e un valore
 * N (N è uguale o superiore a 10) Successivamente l’utente inserisce una serie
 * di N valori reali corrispondenti alle misure effettuate. Si assuma,
 * nell’esempio, un valore di N pari a 10. Il programma deve analizzare la serie
 * inserita dall’utente e scartarla se almeno una delle seguenti regole è
 * verificata (se una serie è da scartare per entrambe le regole, basta
 * indicarne una delle due) R1.	Regola R4s: la serie di misure è da scartare
 * quando la serie contiene due misurazioni (non necessariamente consecutive) in
 * cui una eccede la media più due volte CL (> media + 2CL), e l’altra eccede la
 * media meno due volte CL (< media – 2CL). R2.	Regola 5x: la serie di misure è
 * da scartare quando 5 misurazioni consecutive della serie sono o tutte
 * superiori o tutte inferiori alla media
 *
 * Esempio: (CL = 0.9) 10 10 11 9 11 11 8.9 11 8.8 10 → accettata 9.3 10 12 9 17
 * 13 7 12 8 6 → rifiutata (R1) 6 10 11.2 11.8 13 8 8 8 8 8.2 → rifiutata (R2)
 */
public class Es65 {

    public static void main(String args[]) {

        boolean eccmedia1 = false, eccmedia2 = false, scart1 = false, scart2 = false;
        int Nsup = 0, Ninf = 0;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci N e CL:");
        int N = tastiera.nextInt();
        double CL = tastiera.nextDouble();
        double v[] = new double[N];
        System.out.println("Inserisci i valori:");
        for (int i = 0; i < v.length; i++) {
            v[i] = tastiera.nextDouble();
        }

        double somma = 0;
        for (double e : v) {
            somma += e;
        }
        double media = somma / v.length;

        for (double e : v) {
            //R1
            if (e > media + 2 * CL) {
                eccmedia1 = true;
            }

            if (e < media - 2 * CL) {
                eccmedia2 = true;
            }

            if (eccmedia1 && eccmedia2) {
                scart1 = true;
            }

            //R2
            if (e > media) {
                Nsup++;
                Ninf = 0;

            } else if (e < media) {
                Nsup = 0;
                Ninf++;
            }

            if (Nsup == 5 || Ninf == 5) {
                scart2 = true;
            }

        }

        if (!scart1 && !scart2) {
            System.out.println("La sequenza è accettabile");
        } else if (scart1) {
            System.out.println("La regola R4s non è rispettata");
        } else {
            System.out.println("La regola 5x non è rispettata");
        }

    }
}
