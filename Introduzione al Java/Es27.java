package introduzioneAlJava;

import java.util.Scanner;

/**
 * Dato in input una base ed un esponente, visualizzare a video il valore della
 * relativa potenza.
 */
public class Es27 {

    public static void main(String[] args) {
        double base, esponente, risultato;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserire la base: ");
        base = tastiera.nextDouble();

        System.out.println("Inserire l'esponente: ");
        esponente = tastiera.nextDouble();

        /*for (int i=0, risultato=1; i<esponente; i++){
            risultato= risultato*base;
        }*/
        risultato = Math.pow(base, esponente);
        System.out.println(risultato);

    }
}
