package introduzioneAlJava;

import java.util.Scanner;

/**
 * Riscrivi l'esercizio n°31 utilizzando il tipo float per i numeri letti da
 * tastiera e il tipo int per le variabili in cui memorizzare i risultati delle
 * divisioni.
 */
public class Es17 {

    public static void main(String[] args) {

        double num1, num2, num3;
        int ris1, ris2, ris3, ris4, ris5, ris6, ris7, ris8, ris9;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Valore del primo numero reale: ");
        num1 = tastiera.nextDouble();
        System.out.println("Valore del secondo numero reale: ");
        num2 = tastiera.nextDouble();
        System.out.println("Valore del terzo numero reale: ");
        num3 = tastiera.nextDouble();

        ris1 = (int)(num1 / num1);
        ris2 = (int)(num1 / num2);
        ris3 = (int)(num1 / num3);
        ris4 = (int)(num2 / num1);
        ris5 = (int)(num2 / num2);
        ris6 = (int)(num2 / num3);
        ris7 = (int)(num3 / num1);
        ris8 = (int)(num3 / num2);
        ris9 = (int)(num3 / num3);

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
