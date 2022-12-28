package barcaamotore;

import java.util.Scanner;

public class GestioneBarche {
    
    public static void main(String[] args) {
        BarcaAMotore barca =new BarcaAMotore(500, 150, 120, 0.2);
        
        System.out.println(barca.getDistanzaPercorsa());
        
        Scanner s = new Scanner(System.in);
        
        
        barca.cambiaVelocita(5);
        while(true){
            System.out.println("Per quanto tempo vuoi navigare?");
            int t = s.nextInt();
            barca.naviga(t);
            System.out.println("Distanza percorsa: " + barca.getDistanzaPercorsa());
            System.out.println("Carburante attuale: " + barca.getCarburanteAttuale());
        }
    }
    
}
