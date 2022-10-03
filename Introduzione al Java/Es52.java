package introduzioneAlJava;

import java.util.Scanner;

/*
 * Scrivi un programma che verifica se l’anno è bisestile: 
 * l’utente inserisce un anno e il calcolatore verifica 
 * se è bisestile. Se l’utente inserisce un numero negativo 
 * il programma termina (senza nessuna verifica sulla 
 * bisestilità); altrimenti, al termine della verifica,
 * si ricomincia da capo (un anno è bisestile se è divisibile
 * per 4 ma non per 100, oppure se è divisibile per 400).
 */
public class Es52 {

    public static void main(String[] args) {
        int anno;

        Scanner tastiera = new Scanner(System.in);

        System.out.print("Inserisci anno: ");
        anno = tastiera.nextInt();
        while (anno >= 0) {
            if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
                System.out.println("L'anno " + anno + " e' bisestile");
            } else {
                System.out.println("L'anno " + anno + " non e' bisestile");
            }
            System.out.print("Inserisci anno: ");
            anno = tastiera.nextInt();
        }
    }
}
