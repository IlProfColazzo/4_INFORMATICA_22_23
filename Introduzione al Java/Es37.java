package introduzioneAlJava;

import java.util.Scanner;

/**
 * Scrivere un programma che permette di leggere due 
 * valori interi da tastiera e stampa a video un messaggio 
 * che indica se almeno uno dei due valori è positivo.
 */
public class Es37 {
    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        
        int primoNumero = in.nextInt();
        int secondoNumero = in.nextInt();
        
        if(primoNumero >=0 || secondoNumero>=0 )
            System.out.println("Almeno uno dei valori è positivo."); 
        else 
            System.out.println("Almeno uno dei valori non è positivo.");
        
    }
}
