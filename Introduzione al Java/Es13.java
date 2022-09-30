package introduzioneAlJava;

/**
 * Effettuiamo la divisione tra numeri interi salvando 
 * il risultato prima in una variabile intera e 
 * successivamente in una variabile reale.
 */
public class Es13 {
    
    public static void main(String[] args) {
        int dividendo = 3, divisore = 2, ris1;
        float ris2;
        ris1 = dividendo / divisore;
        ris2 = dividendo / divisore;
        System.out.println("Risultato nella variabile intera: " + ris1);
        System.out.println("Risultato nella variabile reale: " + ris2);
    }
}
