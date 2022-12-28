package biblio;

public class Libro {

    private String autore;
    private String titolo;
    private Ripiano ripiano;

    public Libro(String autore, String titolo) {
        this.autore = autore;
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public String toString() {
        return autore + ", " + titolo;
    }

    public boolean equals(Libro other) {
        if (other == null) {
            return false;
        }
        return other.getAutore().equals(this.autore)
                && other.getTitolo().equals(this.titolo);
    }

    public void setRipiano(Ripiano ripiano) {
        this.ripiano = ripiano;
    }

    public int getPiano() {
        return this.ripiano.getScaffale().getPiano().getnPiano();
    }

    public String getScaffale() {
        return ripiano.getScaffale().getNome();
    }

    public int getRipiano() {
        return ripiano.getnRipiano();
    }

}
