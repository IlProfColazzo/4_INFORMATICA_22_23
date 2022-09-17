package it.giorgi.basetriangolo;

/**
 * Scrivere un programma che calcoli l’altezza di 
 * un triangolo conoscendo il valore della sua area 
 * e della sua base. 
 * Il risultato dovrà essere fornito in 
 * output.
 */
public class Es1 {

    public static void main(String[] args) {
        double A=17.2, b=3, h;
        h = 2 * A / b;
        System.out.println("Il triangolo con area "+A+" e base "+b+" ha altezza "+h);
    }
}
