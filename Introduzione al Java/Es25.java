package introduzioneAlJava;

/**
 * Una nuova compagnia telefonica ha promosso l’offerta “oltre 80”: alla cifra
 * fissa di 0.10 € (costo alla risposta) occorre aggiungere la cifra di 0.15€
 * per ogni secondo del tempo della telefonata; però oltre gli 80 secondi la
 * tariffa di ogni secondo è di 0.09. Fornito da tastiera il numero dei secondi
 * della telefonata, visualizzare il costo totale della chiamata. Le tariffe
 * indicate nel testo sono delle costanti.
 */
import java.util.Scanner;

public class Es25 {

    public static void main(String[] args) {
        final double costoRisposta = 0.10, costoSecondi = 0.15, costoOfferta = 0.09;
        double totale = costoRisposta;
        
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Inserisci la durata della chiamata: ");
        double durata = tastiera.nextDouble();

        if (durata > 80) {
            totale += (costoSecondi * 80) + (costoOfferta * (durata - 80));
        } else {
            totale += (costoSecondi * durata);
        }
        System.out.println("Bolletta: " + totale + " euro.");
    }

}
