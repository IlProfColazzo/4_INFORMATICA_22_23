package introduzioneAlJava;

import java.util.Scanner;

/** Dato in input un intero che indica la temperatura in gradi centigradi,
 * calcolare e stampare a video l’equivalente in Fahrenheit.
 * Il fattore di conversione deve essere una costante.
 */
public class Es09 {
    
    public static void main(String[] args) {
        double gradiCelsius, gradiFahrenheit;
        final double OFFSET1 = 1.8, OFFSET2 = 32;
        
        Scanner tastiera = new Scanner(System.in);
       
        System.out.println("Inserisci i gradi Celsius: ");
	gradiCelsius = tastiera.nextDouble(); 

	gradiFahrenheit = gradiCelsius * OFFSET1 + OFFSET2;

	System.out.println(gradiCelsius + " gradi Celsius corrispondono a " + gradiFahrenheit + " gradi Fahrenheit.");

    }
}
