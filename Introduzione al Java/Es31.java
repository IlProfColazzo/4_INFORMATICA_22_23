package introduzioneAlJava;

import java.util.Scanner;

/**
 * Si scriva un programma in grado di calcolare la radice quadrata di un numero
 * inserito da tastiera. Il calcolo dece essere effettuato se e solo se il
 * numero inserito risulta essere maggiore o uguale a 0; altrimenti fornire in
 * output un opportuno messaggio di errore.
 */
public class Es31 {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserire un numero: ");
        int N = tastiera.nextInt();
        if (N > 0) {
            double radq = Math.sqrt(N);
            System.out.println("La radice quadrata di " + N + " e': " + radq);
        } else {
            System.out.println("Numero negativo: impossibile calcolare la radice quadrata.");
        }
    }

}
