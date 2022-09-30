package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che visualizzi il quoziente e il resto
 * della divisione tra due numeri interi letti da tastiera.
*/
public class Es12 {
    
    public static void main(String[] args) {
        
        int dividendo, divisore, quoziente, resto;

        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Inserisci il dividendo: ");
	dividendo = tastiera.nextInt();
        System.out.println("Inserisci il divisore: ");
	divisore = tastiera.nextInt();

	quoziente = dividendo / divisore;
	resto = dividendo % divisore;
	System.out.println(dividendo +" / " + divisore +" = " + quoziente + " con resto " + resto);
    }
    
}
