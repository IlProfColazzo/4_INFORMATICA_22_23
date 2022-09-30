package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivere un programma che permetta di acquisire da tastiera una sequenza di
 * numeri e stamparne la somma. Il termine della sequenza viene indicato
 * inserendo un valore pari a zero: Esempio: Dammi un valore: 3 Dammi un valore:
 * 2 Dammi un valore: 7 Dammi un valore: 0 La somma vale: 12
 */
public class Es47 {

    public static void main(String[] args) {
        int dato = 7, somma = 0;

        Scanner tastiera = new Scanner(System.in);

        while (dato != 0) {
            System.out.println("Dammi un numero: ");
            dato = tastiera.nextInt();
            somma += dato;
        }
        System.out.println("La somma dei numeri vale " + somma);
    }

}
