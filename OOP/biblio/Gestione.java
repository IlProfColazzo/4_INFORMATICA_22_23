/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblio;

/**
 *
 * @author andre
 */
public class Gestione {
    
    public static void main(String[] args) {
        Biblioteca giorgi = new Biblioteca("Giorgi");
        
        Libro l = new Libro("Dante", "La divina commedia");
        System.out.println(giorgi.aggiungiLibro(1, "SC4", 4, l));
        //l = new Libro("Dante", "La divina commedia");
        System.out.println(giorgi.aggiungiLibro(2, "SC4", 4, l));
        System.out.println(giorgi.aggiungiLibro(2, "SC4", 5, l));
        System.out.println(giorgi.aggiungiLibro(3, "SC1", 1, l));
        
        
        System.out.println(giorgi.cerca("Dante","La divina commedia"));
    }
    
}
