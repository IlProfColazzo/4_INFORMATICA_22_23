package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che legge in input un valore corrispondente a un numero di secondi
 * e lo trasforma in ore, minuti e secondi.
 * (Esempio: 36956 secondi corrispondono a 10 ore, 15 minuti e 56 secondi)
*/
public class Es11 {
    
    public static void main(String[] args) {
        final int SECINORA = 3600, SECINMINUTO = 60;
        int secondiTotali, ore, minuti, secondi, resto;

        Scanner tastiera = new Scanner(System.in);
		
        System.out.println("Inserisci il numero di secondi: ");
        secondiTotali = tastiera.nextInt();

        ore = secondiTotali / SECINORA;
	resto = secondiTotali % SECINORA;
	minuti = resto / SECINMINUTO;
	resto = resto % SECINMINUTO;
	secondi = resto;

        System.out.println(secondiTotali + " secondi corrispondono a " + ore + " ore, "+ minuti + " minuti e " + secondi + " secondi");
  
    }
    
}
