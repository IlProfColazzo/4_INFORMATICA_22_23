package rubrica;

public class Rubrica {
    
    private String nome;
    private Voce[] voci;
    private int nVoci;

    public Rubrica(String nome) {
        this.nome = nome;
        this.voci = new Voce[100];
        this.nVoci = 0;
    }

    public String getNome() {
        return nome;
    }
    
    public boolean aggiungi(String nome, String cognome, String numero){
        if (this.nVoci >= 100)
                return false;
        else{
            this.voci[this.nVoci] = new Voce(nome, cognome, numero);
            this.nVoci++;
        }
        return true;
    }
    
    public String primo(){
        if (this.nVoci > 0)
            return this.voci[0].toString();
        else
            return "Rubrica vuota.";
    }
    
    public String voce(int nVoce){
        if (this.nVoci > nVoce - 1)
            return this.voci[nVoce - 1].toString();
        else
            return "Voce inesistente.";
    }
    
    public String elenco(){
        String elenco = "(";
        if (this.nVoci > 0){
            for (int i = 0; i < this.nVoci; i++) {
                elenco = elenco + this.voci[i] + ", ";
                //nella riga precendete il metodo toString di Voce viene
                //richiamato implicitamente
            }
            return elenco.substring(0, elenco.length()-2) + ")";
        }
        else
            return "Rubrica vuota.";
    }
    
    public String ricerca(String daRicercare){
        for (int i = 0; i < this.nVoci; i++) 
            if (this.voci[i].contains(daRicercare))
                return this.voci[i].toString();
        return "Nessuna voce trovata.";
    }   
}
