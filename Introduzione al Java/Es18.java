package introduzioneAlJava;

/**
 * Scrivere un programma che permetta di separare la parte intera dalla parte
 * decimale del risultato di una divisione. L’algoritmo è il seguente: leggi due
 * numeri interi; esegui la divisione tra interi: converti i numeri interi in
 * reali; esegui la divisione tra reali; sottrai al risultato reale la parte
 * intera, ottenendo così solo la parte decimale; visualizza i risultati sullo
 * schermo.
 */
import java.util.Scanner;

public class Es18 {

    public static void main(String[] args) {
        int a, b;
        Scanner tastiera = new Scanner(System.in);
        System.out.println("inserisci A: ");
        a = tastiera.nextInt();
        System.out.println("inserisci B: ");
        b = tastiera.nextInt();
        if (b != 0) {
            int parteIntera = a / b;
            double parteDecimale = (double) a / b - parteIntera;
            System.out.println("la parte intera equivale a: " + parteIntera + " e la parte decimale equivale a: " + parteDecimale);
        } else {
            System.out.println("Errore!!!");
        }
    }
}
