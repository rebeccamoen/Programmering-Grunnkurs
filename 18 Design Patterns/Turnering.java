import javax.swing.*;
import java.util.Date;

public class Turnering {
    private DefaultListModel<Runde> runde_liste = new DefaultListModel<Runde>();
    private DefaultListModel<Spiller> spiller_liste = new DefaultListModel<Spiller>();
    private String dato = "";
    private String navn = "";

    public void pruneSpiller() {
    spiller_liste.clear();
}

    public void pruneMatch() {
        runde_liste.clear();
    }

    //Getters og setters
    public DefaultListModel<Runde> getRunde_liste() {
        return runde_liste;
    }

    public DefaultListModel<Spiller> getSpiller_liste() {
        return spiller_liste;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return navn + ": " + dato;
    }
}