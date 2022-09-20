package introduzioneAlJava;

/**
 * Una sala cinematografica ha 550 posti dei quali 
 * 250 in galleria e il resto in platea. 
 * Sapendo che il biglietto in platea costa 8 € 
 * e in galleria 2 € in più, calcolare l’incasso in una sera di tutto esaurito.
 */
public class Es02 {

    public static void main(String[] args) {
		
		int postiTotali, postiGalleria, postiPlatea;
		double bigliettoPlatea, bigliettoGalleria, incassoPlatea, incassoGalleria;
		double incassoTotale;
		
		postiTotali = 550;
		postiGalleria = 250;
		postiPlatea = postiTotali - postiGalleria;
		bigliettoPlatea = 8;
		bigliettoGalleria = bigliettoPlatea + 2;
		incassoGalleria = bigliettoGalleria * postiGalleria;
		incassoPlatea = bigliettoPlatea * postiPlatea;
		incassoTotale = incassoGalleria + incassoPlatea;

		System.out.println("Il teatro ha incassato " + incassoTotale + " euro.");
		
    }
}
