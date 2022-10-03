package introduzioneAlJava;

import java.util.Scanner;

/**
 * Si scriva un programma in linguaggio Java che implementi una semplice
 * calcolatrice in grado di compiere le 6 operazioni (+ – * / % ^) tra numeri
 * interi. Il programma chiede all’utente di inserire il carattere
 * rappresentante l’operazione da svolgere e in seguito i due operandi. Il
 * programma stamperà a video il risultato dell’operazione.
 */
public class Es41 {

    public static void main(String[] args) {
        String operazione;
        int a, b;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserire operazione da compiere :");
        operazione = tastiera.nextLine();
        System.out.println("Inserire a :");
        a = tastiera.nextInt();
        System.out.println("Inserire b:");
        b = tastiera.nextInt();

        if (operazione.equals("+") == true) {
            System.out.println("La somma di a e b e' : " + (a + b));
        } else if (operazione.equals("-") == true) {
            System.out.println("La sottrazione di a e b e' : " + (a - b));
        } else if (operazione.equals("*") == true) {
            System.out.println("La moltiplicazione di a e b e' : " + (a * b));
        } else if (operazione.equals("/") == true) {
            System.out.println("La divisione tra a e b e' : " + (a / b));
        } else if (operazione.equals("%") == true) {
            System.out.println("Il modulo tra a e b e' : " + (a % b));
        } else if (operazione.equals("^") == true) {
            System.out.println("a elevanto a b e' : " + Math.pow(a, b));
        } else {
            System.out.println("Operazione sconosciuta.");
        }
    }
}
