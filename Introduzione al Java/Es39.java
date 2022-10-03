package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivere un programma che determini se un anno acquisito da tastiera è
 * bisestile. Un anno è bisestile se il suo numero è divisibile per 4, con
 * l'eccezione che gli anni secolari (quelli divisibili per 100) sono bisestili
 * solo se divisibili per 400. (Attenzione: conviene usare delle parentesi
 * tonde).
 */
public class Es39 {

    public static void main(String[] args) {
        int anno;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci l'anno da controllare: ");
        anno = tastiera.nextInt();
        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
            System.out.println("L'anno " + anno + " e' bisestile");
        } else {
            System.out.println("L'anno " + anno + " non e' bisestile");
        }
    }

}
