/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblio;

/**
 *
 * @author andre
 */
public class Biblioteca {
    
    private String nome;
    private Piano[] piani;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.piani = new Piano[3];
        for (int i = 0; i < 3; i++) {
            this.piani[i] = new Piano(i+1);
        }
    }
    
    public boolean aggiungiLibro(int nPiano,String scaffale,int ripiano,Libro l){
        if(nPiano-1<0 || nPiano-1>3){
            return false;
        }
        return this.piani[nPiano-1].aggiungiLibro(scaffale, ripiano, l);
    }

    public int cerca(String autore, String titolo) {
        int ncopie = 0;
        for (Piano piano : piani) {
            ncopie += piano.cerca(autore,titolo);
        }
        return ncopie;
    }
    
    
    
    
}
