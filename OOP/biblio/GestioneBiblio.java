package biblio;

import java.util.Scanner;

public class GestioneBiblio {

    public static void start(Biblioteca biblio) {

        Scanner console = new Scanner(System.in);

        System.out.println("**GESTIONE BIBLIOTECA***");

        while (true) {
            System.out.print(">");
            String cmd = console.nextLine();
            if (cmd.equals("Add")) {
                System.out.print("Autore: ");
                String autore = console.nextLine();
                System.out.print("Titolo: ");
                String titolo = console.nextLine();
                System.out.print("Piano: ");
                int piano = Integer.parseInt(console.nextLine());
                System.out.print("Scaffale: ");
                String scaffale = console.nextLine();
                System.out.print("Ripiano: ");
                int ripiano = Integer.parseInt(console.nextLine());
                biblio.aggiungi(new Libro(autore, titolo), piano, scaffale, ripiano);
            } else if (cmd.equals("List")) {
                System.out.print("Piano: ");
                int piano = Integer.parseInt(console.nextLine());
                System.out.print("Scaffale: ");
                String scaffale = console.nextLine();
                System.out.println(biblio.getLibri(piano, scaffale));
            } else if (cmd.equals("Libro")) {
                System.out.print("Autore: ");
                String autore = console.nextLine();
                System.out.print("Titolo: ");
                String titolo = console.nextLine();
                Libro libro = biblio.cerca(autore, titolo);
                if (libro != null) {
                    System.out.println("Libro: " + libro);
                    System.out.println("Piano: " + biblio.cercaPiano(libro));
                    System.out.println("Scaffale: " + biblio.cercaScaffale(libro));
                    System.out.println("Ripiano: " + biblio.cercaRipiano(libro));
                } else {
                    System.out.println("LIBRO INESISTENTE");
                }

            } else if (cmd.equals("Contiene")) {
                System.out.print("Autore: ");
                String autore = console.nextLine();
                System.out.print("Titolo: ");
                String titolo = console.nextLine();
                System.out.print("Piano: ");
                int piano = Integer.parseInt(console.nextLine());
                System.out.print("Scaffale: ");
                String scaffale = console.nextLine();
                System.out.print("Ripiano: ");
                int ripiano = Integer.parseInt(console.nextLine());
                Libro libro = new Libro(autore, titolo);
                System.out.println(biblio.contiene(piano, scaffale, ripiano, libro));

            } else if (cmd.equals("Quit")) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca("Giorgi");
        start(biblio);
    }
}
