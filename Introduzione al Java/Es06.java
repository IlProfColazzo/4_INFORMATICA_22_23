package introduzioneAlJava;

import java.util.Scanner;

/**
 * In un parco divertimenti i biglietti costano costoBambino € 
 * per ogni bambino con età inferiore a 10 anni, 
 * e x € in più per ogni altra persona. 
 * Sapendo che i bambini che sono entrati al parco sotto 
 * i dieci anni sono nBambini, calcolare il guadagno del 
 * parco divertimenti sapendo che le altre persone sono esattamente il doppio dei bambini.
*/
public class Es06 {

    public static void main(String[] args) {
		
		double costoBambino, x, guadagno;
		int nBambini, nAdulti;

		Scanner tastiera = new Scanner(System.in);

		System.out.println("Inserisci il prezzo del biglietto dei bambini: ");
		costoBambino = tastiera.nextDouble();
		System.out.println("Inserisci il numero dei bambini: ");
		nBambini = tastiera.nextInt();
		System.out.println("Inserisci la differenza di prezzo per gli adulti: ");
		x = tastiera.nextDouble();

		nAdulti = nBambini * 2;
		guadagno = costoBambino * nBambini + nAdulti * (costoBambino + x);
		
		System.out.println("Il parco divertimenti ha incassato " + guadagno + " euro.");
	}
}
