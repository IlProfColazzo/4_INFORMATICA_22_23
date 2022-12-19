/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblio;

/**
 *
 * @author andre
 */
public class Ripiano {
    
    private int nRipiano;
    private Libro libri[];
    private int posLibera;

    public Ripiano(int nRipiano) {
        this.libri = new Libro[10];
        this.nRipiano = nRipiano;
    }
    
    public boolean aggiungiLibro(Libro l){
        if(this.posLibera<this.libri.length){
            this.libri[this.posLibera] = l;
            this.posLibera++;
            return true;
        }
        return false;
    }
    
    public int cerca(String autore, String titolo) {
        int ncopie = 0;
        for (int i=0; i<this.posLibera;i++) {
            if(this.libri[i].getAutore().equals(autore) &&
            this.libri[i].getTitolo().equals(titolo)){
                ncopie++;
            }
            
        }
        return ncopie;
    }
    
    
}
