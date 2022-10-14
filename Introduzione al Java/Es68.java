package introduzioneAlJava;

import java.util.Scanner;

/**
 * Una stazione meteorologica esegue ogni giorno un insieme di 
 * letture per le ore più calde (11:00 - 16:00). 
 * Ipotizzando di avere a disposizione le registrazioni di una 
 * settimana (dal lunedì alla domenica) visualizzare in quale 
 * giorno e ora si è registrata la temperatura massima e quale 
 * è stata la temperatura media per ogni fascia 
 * (della durata di un’ora).
 */
public class Es68 {

    public static void main(String[] args) {
        
        final int r = 5, c = 7;
        double mat[][] = new double[r][c];
        String[] fasce={"11-12","12-13","13-14","14-15","15-16"}; 
        String[] giorni = {"Lun", "Mar", "Mer", "Gio", "Ven", "Sab", "Dom"};
        
        Scanner tastiera = new Scanner(System.in);
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Inserisci la temperatura: ");
                mat[i][j] = tastiera.nextInt();
            }
        }
        
        System.out.print("            ");
        for (int i = 0; i < giorni.length; i++) {
            System.out.print(giorni[i] + "       ");
        }
        
        System.out.println();
        for (int i = 0; i < r; i++) {
            System.out.print(""+fasce[i]);
            for (int j = 0; j < c; j++) {
                System.out.format("%10.2f",mat[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        
        double max = Integer.MIN_VALUE;
        int giorno = 0, x=0, fascia=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (max < mat[i][j]) {
                    max = mat[i][j];
                    giorno = j;
                    fascia = i;
                }
            }
        }
        System.out.println("La temperatura massima si è registrata " +
                "nel giorno " + giorni[giorno] + " nella fascia " + fasce[fascia] +
                    " con valore di " + max + " gradi.");
        
        for (int i = 0; i < mat.length; i++) {
            double somma = 0;
            for (int j = 0; j < mat[i].length; j++) {
                somma += mat[i][j];
            }
            System.out.println("La temperatura media della fascia " + fasce[i] + " è " + (somma / mat[i].length));
        }
    }
}