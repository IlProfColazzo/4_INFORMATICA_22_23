package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivere un programma che stampa a video il valore assoluto (numero senza
 * segno) di un numero letto da tastiera.
 */
public class Es20 {

    public static void main(String[] args) {
        int numero;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Introduci un numero: ");
        numero = tastiera.nextInt();
        if (numero < 0) {  //confrontalo con 0
            numero = -1 * numero; //cambia il segno se il numero è < 0
        }
        System.out.println("Il valore assoluto del numero letto e' " + numero);
    }

}
