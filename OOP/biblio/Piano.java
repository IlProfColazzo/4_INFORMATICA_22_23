package biblio;

public class Piano {

    private int nPiano;
    private Scaffale[] scaffali;

    public Piano(int nPiano) {
        this.nPiano = nPiano;
        scaffali = new Scaffale[30];
        for (int i = 0; i < scaffali.length; i++) {
            scaffali[i] = new Scaffale("SC" + (i + 1), this);
        }
    }

    public boolean aggiungi(Libro libro, String scaffale, int ripiano) {
        int nScaffale = Integer.parseInt(scaffale.substring(2, scaffale.length()));
        return scaffali[nScaffale].aggiungi(libro, ripiano);
    }

    public boolean contiene(Libro libro, String scaffale, int ripiano) {
        int nScaffale = Integer.parseInt(scaffale.substring(2, scaffale.length()));
        return scaffali[nScaffale].contiene(libro, ripiano);
    }

    public String getLibri(String scaffale) {
        int nScaffale = Integer.parseInt(scaffale.substring(2, scaffale.length()));
        return scaffali[nScaffale].getLibri();
    }

    public int getnPiano() {
        return nPiano;
    }

    public Libro cerca(String autore, String titolo) {
        for (Scaffale scaffale : scaffali) {
            Libro l = scaffale.cerca(autore, titolo);
            if (l != null) {
                return l;
            }
        }
        return null;
    }

    public boolean cercaPiano(Libro libro) {
        for (int i = 0; i < this.scaffali.length; i++) {
            if (this.scaffali[i].cercaPiano(libro)) {
                return true;
            }
        }
        return false;
    }

    public String cercaScaffale(Libro libro) {
        for (int i = 0; i < this.scaffali.length; i++) {
            String scaffale = this.scaffali[i].cercaScaffale(libro);
            if (scaffale != null) {
                return scaffale;
            }
        }
        return null;
    }

    public int cercaRipiano(Libro libro) {
        for (int i = 0; i < this.scaffali.length; i++) {
            int k = this.scaffali[i].cercaRipiano(libro);
            if (k >= 0) {
                return k;
            }
        }
        return -1;
    }

}
