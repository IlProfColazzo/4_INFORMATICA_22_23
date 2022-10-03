package introduzioneAlJava;

import java.util.Scanner;

/* Dato un numero intero tra 1 e 12, che rappresenta il mese corrente, stampare
 * il nome del mese per esteso ("Gennaio"..."Dicembre").
 */
public class Es33 {

    public static void main(String[] args) {
        int n;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci il numero che rappresenta il mese corrente: ");
        n = tastiera.nextInt();

        if (n == 1) {
            System.out.println("Il mese corrente è gennaio");
        } else if (n == 2) {
            System.out.println("Il mese corrente è febbraio");
        } else if (n == 3) {
            System.out.println("Il mese corrente è marzo");
        } else if (n == 4) {
            System.out.println("Il mese corrente è aprile");
        } else if (n == 5) {
            System.out.println("Il mese corrente è maggio");
        } else if (n == 6) {
            System.out.println("Il mese corrente è giugno");
        } else if (n == 7) {
            System.out.println("Il mese corrente è luglio");
        } else if (n == 8) {
            System.out.println("Il mese corrente è agosto");
        } else if (n == 9) {
            System.out.println("Il mese corrente è settembre");
        } else if (n == 10) {
            System.out.println("Il mese corrente è ottobre");
        } else if (n == 11) {
            System.out.println("Il mese corrente è novembre");
        } else if (n == 12) {
            System.out.println("Il mese corrente è dicembre");
        } else {
            System.out.println("Mese inesistente!");
        }
    }
}