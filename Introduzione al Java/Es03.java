package introduzioneAlJava;

/**
 * In un parco divertimenti i biglietti costano 25 € per ogni bambino 
 * con età inferiore a 10 anni, e 10 € in più per ogni altra persona. 
 * Sapendo che i bambini che sono entrati al parco sotto i dieci anni sono 2000, 
 * calcolare il guadagno del parco divertimenti sapendo che le altre persone 
 * sono esattamente il doppio dei bambini.
*/
public class Es03 {

    public static void main(String[] args) {
		
		double costoBigliettoBambino = 25, x = 10, guadagno;
		int nBambini = 2000, nAdulti;
	 
		nAdulti = nBambini * 2;
		guadagno = costoBigliettoBambino * nBambini + nAdulti * (costoBigliettoBambino + x);
		
		System.out.println("Il parco divertimenti ha incassato " + guadagno + " euro.");
		
    }
}
