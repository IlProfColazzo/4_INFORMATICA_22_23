package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivi un programma che dato in input il valore del lato di un cubo, stampi a
 * video la superficie totale e il volume solo se il valore letto è positivo;
 * altrimenti non stampare un messagio di errore.
 */
public class Es23 {

    public static void main(String[] args) {
        int lato, superficie, volume;
        
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Inserisci il valore del lato di un cubo: ");
        lato = tastiera.nextInt();
        if (lato > 0) {
            superficie = 6 * (lato * lato);
            System.out.println("Il valore della superifie è di: " + superficie);

            volume = (lato * lato * lato);
            System.out.println("Il valore del volume è di: " + volume);
        } else {
            System.out.println("Errore! Il numero è negativo.");
        }
    }
}
