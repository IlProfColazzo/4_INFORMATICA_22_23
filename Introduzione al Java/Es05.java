package introduzioneAlJava;

import java.util.Scanner;

/**
 * Una sala cinematografica ha postiTotali posti dei quali 
 * postiGalleria in galleria e il resto in platea. 
 * Sapendo che il biglietto in platea costa bigliettoPlatea € 
 * e in galleria x € in più, calcolare l’incasso in una sera di tutto esaurito.
*/
public class Es05 {

    public static void main(String[] args) {
		
		int postiTotali, postiGalleria, postiPlatea;
		double bigliettoPlatea, bigliettoGalleria, incassoPlatea, incassoGalleria;
		double x, incassoTotale;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci i posti totali del teatro: ");
		postiTotali = tastiera.nextInt();
		System.out.println("Inserisci i posti in galleria: ");
		postiGalleria = tastiera.nextInt();
		System.out.println("Inserisci il costo del biglietto in platea: ");
		bigliettoPlatea = tastiera.nextDouble();
		System.out.println("Quanto costa in più il biglietto in galleria? ");
		x = tastiera.nextDouble();
		
		postiPlatea = postiTotali - postiGalleria;
		
		bigliettoGalleria = bigliettoPlatea + x;
		incassoGalleria = bigliettoGalleria * postiGalleria;
		incassoPlatea = bigliettoPlatea * postiPlatea;
		incassoTotale = incassoGalleria + incassoPlatea;

		System.out.println("Il teatro ha incassato " + incassoTotale + " euro.");
	}
}
