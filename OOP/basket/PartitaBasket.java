package basket;

public class PartitaBasket {

    private String nomeSq1;
    private String nomeSq2;
    private int puntSq1;
    private int puntSq2;
    private boolean giocoInCorso;

    public PartitaBasket(String nomeSq1, String nomeSq2) {
        this.nomeSq1 = nomeSq1;
        this.nomeSq2 = nomeSq2;
        this.giocoInCorso = true;
        /*Di defaul gli interi vengono inizializzati a 0*/
    }

    public void registraUno(String nomeSq) {
        if (this.giocoInCorso) {
            if (nomeSq.equals(this.nomeSq1)) {
                this.puntSq1 += 1;
            } else if (nomeSq.equals(this.nomeSq2)) {
                this.puntSq2 += 1;
            } else {
                System.out.println("Il nome inserito non corrisponde a nessuna squadra!");
            }
        } else {
            System.out.println("La partita è già terminata!");
        }
    }

    public void registraDue(String nomeSq) {
        if (this.giocoInCorso) {
            if (nomeSq.equals(this.nomeSq1)) {
                this.puntSq1 += 2;
            } else if (nomeSq.equals(this.nomeSq2)) {
                this.puntSq2 += 2;
            } else {
                System.out.println("Il nome inserito non corrisponde a nessuna squadra!");
            }
        } else {
            System.out.println("La partita è già terminata!");
        }
    }

    public void registraTre(String nomeSq) {
        if (this.giocoInCorso) {
            if (nomeSq.equals(this.nomeSq1)) {
                this.puntSq1 += 3;
            } else if (nomeSq.equals(this.nomeSq2)) {
                this.puntSq2 += 3;
            } else {
                System.out.println("Il nome inserito non corrisponde a nessuna squadra!");
            }
        } else {
            System.out.println("La partita è già terminata!");
        }
    }

    public int punteggio(String nomeSq) {
        if (nomeSq.equals(this.nomeSq1)) {
            return this.puntSq1;
        } else if (nomeSq.equals(this.nomeSq2)) {
            return this.puntSq2;
        } else {
            System.out.println("Il nome inserito non corrisponde a nessuna squadra!");
            return -1;
        }
    }

    public void terminaPartita() {
        this.giocoInCorso = false;
    }

    public String restituisciVincitore() {
        if (!this.giocoInCorso) {
            if (this.puntSq1 > this.puntSq2) {
                return this.nomeSq1;
            } else if (this.puntSq1 < this.puntSq2) {
                return this.nomeSq2;
            } else {
                return "nessuno: partita terminata in pareggio.";
            }
        }
        return "La partita non è ancora terminata!";
    }

}
