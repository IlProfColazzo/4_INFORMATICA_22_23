package introduzioneAlJava;

import java.util.Scanner;

/**
* Calcolare e stampare a video la circonferenza e l’area di un cerchio
* con raggio r fornito in input. 
* Qual è la costante da definire?*/

public class Es10 {
    
    public static void main(String[] args) {
        double raggio, area, circonferenza;
        final double PIGRECO = 3.14;

        Scanner tastiera = new Scanner(System.in);
		       
	System.out.println("Inserisci il valore del raggio: ");
	raggio = tastiera.nextDouble();

	area = PIGRECO * raggio * raggio;
	circonferenza = PIGRECO * 2 * raggio;

	System.out.println("Il cerchio con raggio " + raggio + " ha area uguale a " + area + " e circonferenza uguale a " + circonferenza + ".");
 
    }
}
