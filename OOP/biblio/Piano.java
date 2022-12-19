/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblio;

/**
 *
 * @author andre
 */
public class Piano {
    
    private int nPiano;
    private Scaffale[] scaffali;

    public Piano(int nPiano) {
        this.scaffali = new Scaffale[30];
        this.nPiano = nPiano;
        for (int i = 0; i < 30; i++) {
            this.scaffali[i] = new Scaffale("SC"+(i+1));
        }
    }
    
    public boolean aggiungiLibro(String scaffale,int ripiano,Libro l){
        
        int nscaffale=0;
        if (scaffale.length()>2 && scaffale.length()<5){
            nscaffale = Integer.parseInt(scaffale.substring(2));
            return this.scaffali[nscaffale].aggiungiLibro(ripiano, l);
        }
        else{
            return false;
        }
    }
    
    public int cerca(String autore, String titolo) {
        int ncopie = 0;
        for (Scaffale scaffale : scaffali) {
            ncopie += scaffale.cerca(autore,titolo);
        }
        return ncopie;
    }
    
    
    
}
