package rubrica;

public class Gestione {
    
    public static void main(String[] args) {
        Rubrica r1 = new Rubrica("Lavoro");
        r1.aggiungi("Nils", "Nilsson", "11235813");
        r1.aggiungi("Peter", "Hart", "21345589");
        r1.aggiungi("Bertram", "Raphael", "144233377");
        
        System.out.println(r1.primo());
        System.out.println(r1.voce(3));
        System.out.println(r1.voce(5));
        System.out.println(r1.elenco());
        System.out.println(r1.ricerca("art"));
        
    }
    
}
