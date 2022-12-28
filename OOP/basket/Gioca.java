package basket;

import java.util.Scanner;

public class Gioca {

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        PartitaBasket partita = new PartitaBasket("Gatti", "Cani");

        boolean termina = false;

        while (!termina) {
            System.out.println("Inserisci nome squadra e punti segnati.");
            System.out.println("Con punti negativi la partita termina.");
            String line = tastiera.nextLine();
            String nomeSq = line.split(" ")[0];
            int punti = Integer.parseInt(line.split(" ")[1]);
            if (punti < 0) {
                partita.terminaPartita();
                termina = true;
            } else {
                if (punti == 1) {
                    partita.registraUno(nomeSq);
                    int pnt1 = partita.punteggio("Gatti");
                    int pnt2 = partita.punteggio("Cani");
                    System.out.print("Gatti " + pnt1);
                    System.out.print(", Cani " + pnt2 + ". ");
                    if (pnt1 > pnt2)
                        System.out.println("I Gatti stanno vincendo.");
                    else if (pnt1 < pnt2)
                        System.out.println("I Cani stanno vincendo.");
                    else
                        System.out.println("La partita è in pareggio.");
                } else if (punti == 2) {
                    partita.registraDue(nomeSq);
                    int pnt1 = partita.punteggio("Gatti");
                    int pnt2 = partita.punteggio("Cani");
                    System.out.print("Gatti " + pnt1);
                    System.out.print(", Cani " + pnt2 + ". ");
                    if (pnt1 > pnt2)
                        System.out.println("I Gatti stanno vincendo.");
                    else if (pnt1 < pnt2)
                        System.out.println("I Cani stanno vincendo.");
                    else
                        System.out.println("La partita è in pareggio.");
                } else if (punti == 3) {
                    partita.registraTre(nomeSq);
                    int pnt1 = partita.punteggio("Gatti");
                    int pnt2 = partita.punteggio("Cani");
                    System.out.print("Gatti " + pnt1);
                    System.out.print(", Cani " + pnt2 + ". ");
                    if (pnt1 > pnt2)
                        System.out.println("I Gatti stanno vincendo.");
                    else if (pnt1 < pnt2)
                        System.out.println("I Cani stanno vincendo.");
                    else
                        System.out.println("La partita è in pareggio.");
                } else {
                    System.out.println("Punteggio non valido.");
                }
            }
        }
        System.out.println("Il vincitore della partita è: "+partita.restituisciVincitore());
    }
}
