package parola;

import java.util.Scanner;

public class GestioneParola {
    public static void main(String[] args) {
        
        Scanner tastiera = new Scanner(System.in);
        
        Parola p= new Parola("abracadabra");
         
        while(!p.isIndovinata()){
            System.out.println("Inserisci un carattere: ");
            char c = tastiera.next().charAt(0);
            if (p.indovina(c))
                System.out.println("Carattere corretto!");
            else
                System.out.println("Carattere errato!");
            System.out.println(p.getParolaScoperta());
        }
        
                
    }
}
