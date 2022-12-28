package contatore;

public class Contatore {
    private int contatore;
    
    public void resetContatore(){
        this.contatore = 0;
    }
    public void incrementaContatore(){
        this.contatore += 1;
    }
    
    public void decrementaContatore(){
        if(this.contatore-1 >= 0)
            this.contatore -= 1;
    }

    public int getContatore() {
        return this.contatore;
    }
    public void mostraContatore(){
        System.out.println("Conatore: "+this.contatore);
    }
}
