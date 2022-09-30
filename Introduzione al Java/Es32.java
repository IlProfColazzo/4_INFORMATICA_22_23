/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduzioneAlJava;

/**
 * Le spese di spedizione di pacchi variano a secondo del peso: fino a 3kg, 
 * il costo è di 5€; dopo i 3Kg  e fino a 10Kg, 
 * il costo è di 8€; oltre i 10Kg è di 10€. 
 * Dato il peso del pacco, calcola la spesa di spedizione.
 */

import java.util.Scanner;
public class Es32 {
    public static void main(String[] args) {
        double peso;
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Inserisci il peso: ");
        peso = tastiera.nextDouble();
        
        if(peso<=3) {
            System.out.println("Il costo è di 5€");   
        }else if(peso<=10){
            System.out.println("Il costo è di 8€"); 
        }
        else{
            System.out.println("Il costo è di 10€");
        }
    }
    
}
