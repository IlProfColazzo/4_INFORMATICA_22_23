package introduzioneAlJava;

import java.util.Scanner;

/**
 * Dato un numeratore e un denominatore controllare la condizione di esistenza
 * del denominatore (denominatore diverso da 0) e in caso positivo fornire in
 * output il risultato della divisione, altrimenti stampare un messaggio di
 * errore.
 */
public class Es19 {

    public static void main(String[] args) {
        int numeratore, denominatore;
        float quoziente;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Introduci il numeratore e il denominatore: ");
        numeratore = tastiera.nextInt();
        denominatore = tastiera.nextInt();
        if (denominatore != 0) {  //istruzioni del ramo vero
            quoziente = (float) numeratore / denominatore;
            System.out.println("Il valore del quoziente e': " + quoziente);
        } else { //istruzioni del ramo falso
            System.out.println("Non è possibile dividere per zero!");
        }
    }

}
