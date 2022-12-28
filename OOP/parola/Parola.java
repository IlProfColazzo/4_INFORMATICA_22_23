package parola;

public class Parola {

    private String parolaNascosta;
    private String parolaScoperta;
    private int tentativiTotali;
    private int tentativiErrati;

    public Parola(String parolaNascosta) {
        this.parolaNascosta = parolaNascosta;
        this.parolaScoperta = "";
        for (int i = 0; i < this.parolaNascosta.length(); i++) {
            this.parolaScoperta += "?";
        }
    }

    public String getParolaScoperta() {
        return this.parolaScoperta;
    }
    
    public String getParolaDaIdovinare() {
        return this.parolaNascosta;
    }

    public boolean indovina(char c) {
        boolean isIndovinata = false;
        String s = "";

        for (int i = 0; i < this.parolaNascosta.length(); i++) {
            if (this.parolaNascosta.charAt(i) == c) {
                s += c;
                isIndovinata = true;
            } else {
                s += this.parolaScoperta.charAt(i);
            }
        }
        this.parolaScoperta = s;
        return isIndovinata;
    }

    public int getNumeroTentativi() {
        return this.tentativiTotali;
    }
    
    public boolean isIndovinata(){
        return this.parolaNascosta.equals(this.parolaScoperta);
    }
}
