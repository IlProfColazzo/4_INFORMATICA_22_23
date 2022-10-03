package introduzioneAlJava;

import java.util.Scanner;

/**
 * Leggi un numero Num e un numero EXp e calcola la potenza senza utilizzare il
 * metodo pow().
 */
public class Es46 {

    public static void main(String[] args) {
        int base, esponente, risultato = 1;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserire la base : ");
        base = tastiera.nextInt();
        System.out.println("Inserire l'esponente : ");
        esponente = tastiera.nextInt();
        for (int i = 0; i < esponente; i++) {
            risultato = risultato * base;
        }
        System.out.println("Il risultato é : " + risultato);

    }

}
