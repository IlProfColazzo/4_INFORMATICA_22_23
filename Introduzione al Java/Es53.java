package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivere un programma che permetta di verificare se un numero è pari o
 * dispari. Ad ogni verifica, il programma chiederà all’utente se vuole inserire
 * un nuovo numero: se l’utente inserirà la stringa Si verrà rieseguita la
 * verifica, altrimenti il programma termina. Esempio: Dammi un valore: 2 Il
 * numero è pari. Vuoi continuare? Si Dammi un valore: 7 Il numero è dispari.
 * Vuoi continuare? No Arrivederci
 */
public class Es53 {

    public static void main(String[] args) {
        int dato;
        String risposta;

        Scanner tastiera = new Scanner(System.in);

        do {
            System.out.println("Dammi un numero: ");
            dato = tastiera.nextInt();
            if (dato % 2 == 0) {
                System.out.println("Il numero è pari");
            } else {
                System.out.println("Il numero è dipari");
            }
            tastiera.nextLine(); //inserire questa nextLine 
            // permete di leggere il \n lasciato sul buffer dalla precente
            // nextInt
            System.out.println("Vuoi continuare?");
            risposta = tastiera.nextLine();
        } while (risposta.equals("Si"));
        System.out.println("Arrivederci");
    }

}
