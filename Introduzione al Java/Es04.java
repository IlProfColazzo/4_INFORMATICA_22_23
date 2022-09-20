package introduzioneAlJava;

/**
 * La paga di un operaio è di 15,00 € all’ora. 
 * Sulla stessa paga viene effettuata una trattenuta pari al 27%. 
 * Date il numero delle ore lavorative svolte, calcolare la paga netta.
*/
public class Es04 {

    public static void main(String[] args) {
		
		double pagaOraria = 15, trattenutaPercentuale = 27, pagaLorda, trattenute, pagaNetta;
		int nOre = 30;

	 
		pagaLorda = nOre * pagaOraria;
		trattenute = pagaLorda * trattenutaPercentuale / 100;
		pagaNetta = pagaLorda - trattenute;
		System.out.println("paga lorda: " + pagaLorda + " trattenute: " + trattenute + " paga netta: " + pagaNetta);
    }
}
