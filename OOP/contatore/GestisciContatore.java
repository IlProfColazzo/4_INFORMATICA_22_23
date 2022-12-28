package contatore;

public class GestisciContatore {
    public static void main(String[] args) {
        Contatore c= new Contatore();
        c.incrementaContatore();
        c.mostraContatore();
        c.decrementaContatore();
        c.mostraContatore();
        c.decrementaContatore();
        c.mostraContatore();
    }
}
