package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivere un programma che letto in input il voto di informatica di uno
 * studente, visualizzi in output un messaggio per indicare il livello di
 * sufficienza o insufficienza raggiunta. Se il voto è maggiore o uguale a 6 si
 * ha una sufficienza piena. Se il voto è compreso tra 5 e 6 si ha una
 * insufficienza lieve. Se il voto è inferiore a 5 ha una insufficienza grave.
 */
public class Es28 {

    public static void main(String[] args) {
        int voto;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Introduci il voto: ");
        voto = tastiera.nextInt();
        if (voto >= 6) {
            System.out.println("Studente pienamente sufficiente");
        } else if (voto >= 5) {
            System.out.println("Studente con insufficienza lieve");
        } else {
            System.out.println("Studente con insufficienza grave");
        }
    }

}
