package introduzioneAlJava;

/**
 * Polibio descrive nelle sue Storie un metodo per sostituire lettere a coppie
 * di numeri mediante una scacchiera: l’idea è quella di sostituire le lettere
 * con una coppia di numeri ottenuta dalle coordinate che individuano la lettera
 * da cifrare all’interno di una matrice rettangolare come quella riportata
 * sotto. Ogni carattere viene sostituito con le coordinate che questo ha nella
 * tabella, per esempio: plain text: alba cipher text: 11232111 Scrivere un
 * programma che tramite opportuno menu permetta di cifrare/decifrare una
 * parola.
 */
public class Es70 {

    public static String encrypt(String plaintext, String k[][]) {
        String ciphertext = "";
        for (char c : plaintext.toCharArray()) {
            /**
             * plain_text.toCharArray() converte una 
             * stringa in un vettore di caratteri
            */
            boolean exit = false;
            for (int i = 0; i < k.length && !exit; i++) {
                for (int j = 0; j < k[i].length && !exit; j++) {
                    if (k[i][j].contains(c + "") == true) {
                        /**
                         * k[i][j].contains(c + "") verifica
                         * che la stringa c+"" sia contenuta
                         * all'interno di k[i][j].
                         * Non e' possibile utilizzare il metodo
                         * equals perchè esiste una stringa (K/Q) che
                         * contiene più caratteri al suo interno.
                         */
                        ciphertext = ciphertext + (i + 1) + (j + 1);
                        exit = true;
                    }
                }
            }
        }

        //char [] v = plain_text.toCharArray();
        /*for (int i = 0; i < plain_text.length(); i++) {  
            char c = plain_text.charAt(i);
        }*/
        return ciphertext;
    }

    public static String decrypt(String ciphertext, String k[][]) {
        String plaintext = "";
        for (int i = 0; i < ciphertext.length() - 1; i += 2) {
            plaintext += k[ciphertext.charAt(i) - 48 - 1][ciphertext.charAt(i + 1) - 48 - 1];
        }
        
        /**
         * k[cypher_text.charAt(i) - 48 - 1]
         * cypher_text.charAt(i) ritorna il carattere
         * contenuto in posizione i di cypher_text
         * Un carattere puo' essere manipolato come un intero
         * (tabella ASCII), quindi sottraendo 48 si "converte"
         * il carattere in numero intero.
         * Es: char c = '5' --> int a = c - 48 --> in a verra'
         * salvato il valore intero 5.
         * E' necessario sottrarre ancora 1 perchè la matrice
         * è indicizzata a partire dagli indici 0:0.
         */
        return plaintext;
    }

    public static void main(String[] args) {

        String[][] k = {{"A", "B", "C", "D", "E"},
        {"F", "G", "H", "I", "J"},
        {"(K/Q)", "L", "M", "N", "O"},
        {"P", "R", "S", "T", "U"},
        {"V", "W", "X", "Y", "Z"}};

        String plaintext = "ALBA";
        
        String ciphertext = encrypt(plaintext, k);
        System.out.println("Ciphertext: " + ciphertext);
        plaintext = decrypt(ciphertext, k);
        System.out.println("Testo decifrato: " + plaintext);
    }

}
