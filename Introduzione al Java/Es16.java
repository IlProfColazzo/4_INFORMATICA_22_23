package introduzioneAlJava;

import java.util.Scanner;

/**
 * Riscrivi l'esercizio precedente utilizzando il tipo int per i numeri letti da
 * tastiera e il tipo float per le variabili in cui memorizzare i risultati
 * delle divisioni.
 */
public class Es16 {

    public static void main(String[] args) {
        int num1, num2, num3;
        double ris1, ris2, ris3, ris4, ris5, ris6, ris7, ris8, ris9;

        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Valore del primo numero reale: ");
        num1 = tastiera.nextInt();
        System.out.println("Valore del secondo numero reale: ");
        num2 = tastiera.nextInt();
        System.out.println("Valore del terzo numero reale: ");
        num3 = tastiera.nextInt();

        ris1 = num1 / num1;
        ris2 = num1 / num2;
        ris3 = num1 / num3;
        ris4 = num2 / num1;
        ris5 = num2 / num2;
        ris6 = num2 / num3;
        ris7 = num3 / num1;
        ris8 = num3 / num2;
        ris9 = num3 / num3;

        System.out.println("Risultato tra il primo e il primo numero " + ris1);
        System.out.println("Risultato tra il primo e il secondo numero " + ris2);
        System.out.println("Risultato tra il primo e il terzo numero " + ris3);
        System.out.println("Risultato tra il secondo e il primo numero " + ris4);
        System.out.println("Risultato tra il secondo e il secondo numero " + ris5);
        System.out.println("Risultato tra il secondo e il terzo numero " + ris6);
        System.out.println("Risultato tra il terzo e il primo numero " + ris7);
        System.out.println("Risultato tra il terzo e il secondo numero " + ris8);
        System.out.println("Risultato tra il terzo e il terzo numero " + ris9);

    }

}
