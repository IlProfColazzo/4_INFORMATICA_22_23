/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblio;

/**
 *
 * @author andre
 */
public class Scaffale {
    
    private String codice;
    private Ripiano[] ripiani;

    public Scaffale(String codice) {
        this.ripiani = new Ripiano[6];
        for (int i = 0; i < 6; i++) {
            this.ripiani[i] = new Ripiano(i+1);
        }
        this.codice = codice;
    }
    
    public boolean aggiungiLibro(int nRipiano,Libro l){
        if (nRipiano-1<0 || nRipiano-1>=6)
            return false;
        return this.ripiani[nRipiano-1].aggiungiLibro(l);
    }
    
    public int cerca(String autore, String titolo) {
        int ncopie = 0;
        for (Ripiano ripiano : ripiani) {
            ncopie += ripiano.cerca(autore,titolo);
        }
        return ncopie;
    }
    
    
    
}
