/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblio;

/**
 *
 * @author andre
 */
public class Libro {
    
    private String autore;
    private String titolo;

    public Libro(String autore, String titolo) {
        this.autore = autore;
        this.titolo = titolo;
    }

    @Override
    public String toString() {
        return this.autore + ", " + this.titolo; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }
    
    
    
    
    
    
    
}
