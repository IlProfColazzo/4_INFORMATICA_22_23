package barcaamotore;

public class BarcaAMotore {
    private double capacitaSerbatoio;
    private double carburanteAttuale;
    private int vMax;
    private int vAttuale;
    private double distanzaPercorsa;
    private double efficenza;

    public BarcaAMotore(double capacitaSerbatoio, double carburanteAttuale, int vMax, double efficenza) {
        this.capacitaSerbatoio = capacitaSerbatoio;
        this.carburanteAttuale = carburanteAttuale;
        this.vMax = vMax;
        this.efficenza = efficenza;
    }
    
    public int cambiaVelocita(int v) {
        int c = this.vAttuale + v;
        if(c <= this.vMax && c >= 0)
            this.vAttuale += v;
        else if(c > this.vMax){
            this.vAttuale = this.vMax;
        }
        else{
            this.vAttuale = 0;
        }
        return this.vAttuale;
    }
    
    public void naviga(int tempo){
        int distanza = this.vAttuale * tempo;
        this.distanzaPercorsa += distanza;
        this.carburanteAttuale -= this.efficenza * Math.pow(this.vAttuale, 2) * tempo;
    }
    
    public void rifornisci(double litri){
        if (this.capacitaSerbatoio <= this.carburanteAttuale + litri)
            this.carburanteAttuale = (this.carburanteAttuale + litri);
        else
            this.carburanteAttuale = this.capacitaSerbatoio;
    }

    public double getCarburanteAttuale() {
        return carburanteAttuale;
    }

    public double getDistanzaPercorsa() {
        return distanzaPercorsa;
    }
    
    
    
    
    
}
