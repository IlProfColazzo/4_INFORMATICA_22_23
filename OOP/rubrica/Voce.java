package rubrica;

public class Voce {
    
    private String nome;
    private String cognome;
    private String numero;

    public Voce(String nome, String cognome, String numero) {
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;
    }

    public String toString() {
        return this.nome + " " + this.cognome + " " + this.numero;
    }

    public boolean contains(String daRicercare) {
        return this.nome.contains(daRicercare) ||
                this.cognome.contains(daRicercare) ||
                this.numero.contains(daRicercare);
    }
    
}
