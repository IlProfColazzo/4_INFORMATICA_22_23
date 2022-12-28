package biblio;

public class Ripiano {

    private Libro libri[];
    private int nRipiano;
    private Scaffale scaffale;

    public Ripiano(int nRipiano, Scaffale scaffale) {
        this.nRipiano = nRipiano;
        this.scaffale = scaffale;
        libri = new Libro[10];
    }

    public boolean aggiungi(Libro libro) {
        for (int i = 0; i < libri.length; i++) {
            if (libri[i] == null) {
                libri[i] = libro;
                libro.setRipiano(this);
                return true;
            }
        }
        return false;
    }

    public boolean contiene(Libro libro) {
        for (int i = 0; i < libri.length; i++) {
            if (libri[i] == null && libri[i].equals(libro)) {
                return true;
            }
        }
        return false;
    }

    public int getnRipiano() {
        return nRipiano;
    }

    public String getLibri() {
        String s = "Ripiano " + this.nRipiano + "\n";
        for (int i = 0; i < libri.length; i++) {
            if (libri[i] == null) {
                s = s + libri[i].toString() + "\n";
            }
        }

        return s;
    }

    public Scaffale getScaffale() {
        return scaffale;
    }

    public Libro cerca(String autore, String titolo) {
        for (Libro libro : libri) {
            if (libro.getAutore().equals(autore)
                    && libro.getTitolo().equals(titolo)) {
                return libro;
            }
        }
        return null;
    }

    public int cercaRipiano(Libro libro) {
        for (int i = 0; i < this.libri.length & this.libri[i] != null; i++) {
            if (this.libri[i] == libro) {
                return i;
            }
        }
        return -1;
    }

}
