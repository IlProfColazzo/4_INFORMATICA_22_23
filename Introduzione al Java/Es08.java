package introduzioneAlJava;

import java.util.Scanner;

/**Dato in input un intero che indica la temperatura in gradi centigradi,
* calcolare e stampare a video l’equivalente in Fahrenheit. 
* Il fattore di conversione deve essere una costante definita tramite 
* la direttiva #define.
*/
public class Es08 {
    
    public static void main(String[] args) {
        double saldoEuro, saldoDollari;
        final double EURODOLLARO = 0.96, EUROSTERLINE = 0.89;
        
        Scanner tastiera = new Scanner(System.in);
		
        System.out.println("Inserisci il saldo del conto corrente: ");
        saldoEuro = tastiera.nextDouble();
        
	saldoDollari = saldoEuro * EURODOLLARO;

	System.out.println("Il tuo saldo corrisponde a "  + saldoDollari + " dollari.");
	System.out.println("Il tuo saldo corrisponde a " + saldoEuro*EUROSTERLINE + "sterline.");

    }
    
}
