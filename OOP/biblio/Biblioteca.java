package biblio;

public class Biblioteca {

    private String nome;
    private Piano piani[];

    public Biblioteca(String nome) {
        this.nome = nome;
        piani = new Piano[3];
        for (int i = 0; i < piani.length; i++) {
            piani[i] = new Piano(i + 1);
        }
    }

    public void aggiungi(Libro libro, int piano, String scaffale, int ripiano) {
        this.piani[piano].aggiungi(libro, scaffale, ripiano);
    }

    public boolean contiene(int piano, String scaffale, int ripiano, Libro libro) {
        return this.piani[piano].contiene(libro, scaffale, ripiano);
    }

    public String getLibri(int piano, String scaffale) {
        return piani[piano].getLibri(scaffale);
    }

    public Libro cerca(String autore, String titolo) {
        for (int i = 0; i < piani.length; ++i) {
            Libro l = piani[i].cerca(autore, titolo);
            if (l != null) {
                return l;
            }
        }
        return null;
    }
    
    public int cercaPiano(Libro libro)
    {
        for(int i=0;i<this.piani.length;i++)
              if(this.piani[i].cercaPiano(libro))
                      return i;
        return -1;
    }
  
  public String cercaScaffale(Libro libro)
  {
        for(int i=0;i<this.piani.length;i++)
        {
            String scaffale=this.piani[i].cercaScaffale(libro);
            if(scaffale!=null)
                    return scaffale;
        }
            return "Libro inesistente";
  }
  
  public int cercaRipiano(Libro libro)
  {
        for(int i=0;i<this.piani.length;i++)
        {
                int k=this.piani[i].cercaRipiano(libro);
                if(k>=0)
                        return k;
        }
        return -1;
  }

}
