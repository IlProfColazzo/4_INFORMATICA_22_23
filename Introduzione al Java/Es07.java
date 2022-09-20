package introduzioneAlJava;

import java.util.Scanner;

/**
 * La paga di un operaio è di pagaOraria € all’ora. 
 * Sulla stessa paga viene effettuata una trattenuta pari al trattenutaPercentuale%. 
 * Date il numero delle ore lavorative svolte, calcolare la paga netta.
*/
public class Es07 {

    public static void main(String[] args) {
		
		double pagaOraria, trattenutaPercentuale, pagaLorda, trattenute, pagaNetta;
		int nOre;

		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci la paga oraria: ");
		pagaOraria = tastiera.nextDouble();
		System.out.println("Inserisci la percentuale di trattenute: ");
		trattenutaPercentuale = tastiera.nextDouble();
		System.out.println("Inserisci il numero di ore lavorate: ");
		nOre = tastiera.nextInt();
	 
		pagaLorda = nOre * pagaOraria;
		trattenute = pagaLorda * trattenutaPercentuale / 100;
		pagaNetta = pagaLorda - trattenute;
		
		System.out.println("paga lorda: " + pagaLorda + " trattenute: " + trattenute + " paga netta: " + pagaNetta);
    }
}
