package biblio;

public class Scaffale {

    private String nome;
    private Ripiano[] ripiani;
    private Piano piano;

    public Scaffale(String nome, Piano piano) {
        this.nome = nome;
        this.piano = piano;
        ripiani = new Ripiano[6];
        for (int i = 0; i < ripiani.length; i++) {
            ripiani[i] = new Ripiano(i, this);
        }
    }

    public boolean aggiungi(Libro libro, int ripiano) {
        return this.ripiani[ripiano].aggiungi(libro);
    }

    public boolean contiene(Libro libro, int ripiano) {
        return this.ripiani[ripiano].aggiungi(libro);
    }

    public String getLibri() {
        String s = "";
        for (Ripiano ripiano : ripiani) {
            s = s + ripiano.getLibri();
        }
        return s;
    }

    public Piano getPiano() {
        return piano;
    }

    public String getNome() {
        return nome;
    }

    public Libro cerca(String autore, String titolo) {
        for (Ripiano ripiano : ripiani) {
            Libro l = ripiano.cerca(autore, titolo);
            if (l != null) {
                return l;
            }
        }
        return null;
    }

    public boolean cercaPiano(Libro libro) {
        for (int i = 0; i < this.ripiani.length; i++) {
            if (this.ripiani[i].contiene(libro)) {
                return true;
            }
        }
        return false;
    }

    public String cercaScaffale(Libro libro) {
        for (int i = 0; i < this.ripiani.length; i++) {
            if (this.ripiani[i].contiene(libro)) {
                return this.nome;
            }
        }
        return null;
    }

    public int cercaRipiano(Libro libro) {
        for (int i = 0; i < this.ripiani.length; i++) {
            int k = this.ripiani[i].cercaRipiano(libro);
            if (k >= 0) {
                return i;
            }
        }
        return -1;
    }

}
