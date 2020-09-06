package oblig18;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller {

    //
    public Turnering turnering_ny(String navn, String dato) {
        Turnering t = new Turnering();
        t.setNavn(navn);
        t.setDato(dato);
        return t;
    }
    public void turnering_slett(DefaultListModel<Turnering> m,Turnering t){
        m.removeElement(t);
        t.pruneMatch();
        t.pruneSpiller();
    }

    public void spiller_ny (DefaultListModel<Spiller> m, String navn) {
        Spiller s = new Spiller();
        s.setNavn(navn);
        m.addElement(s);
    }
    public void spiller_slett (DefaultListModel<Spiller> m, Spiller s) {
        m.removeElement(s);
    }

    public void runde_avslutt (Runde r) {
        r.setStatus("Ferdig");
        DefaultListModel<Match> m_match = r.getMatch_liste();

        for (int i = 0; i < m_match.getSize(); i++) {
            Match m = m_match.getElementAt(i);
            if (m.getScoreA() > m.getScoreB()){
                m.getSpiller1().vinn();
            }
            else {
                m.getSpiller2().vinn();
            }



        }
    }

    public Runde runde_ny (DefaultListModel<Runde> m_runde, DefaultListModel<Spiller> m_spiller,JList<Match> liste) {
        Runde r = new Runde();
        Random rg = new Random();
        int maxvinn = 0;
        List<Integer> videre = new ArrayList<Integer>();
        r.setNr(m_runde.getSize()+1);
        r.setStatus("Pågående");

        for (int i = 0; i < m_spiller.getSize(); i++) {
            int vinn = m_spiller.getElementAt(i).getVinn();
            if (vinn > maxvinn) {
                videre.clear();
                maxvinn = vinn;
                videre.add(i);
            }
            else if (vinn == maxvinn) {
                videre.add(i);
            }
        }

        //walkover dersom oddetall
        if (m_spiller.getSize()/2*2 != m_spiller.getSize()){
            int i = rg.nextInt(videre.size());
            Spiller s = m_spiller.getElementAt(i);
            s.vinn();
            videre.remove(i);
        }

        for (int i = 0; i < videre.size(); i++) {
            if (videre.size() == 1) {
                r.setStatus(m_spiller.get(videre.get(0)).getNavn() + " vant.");
            }
            else {
                int j = rg.nextInt(videre.size());
                Match m = new Match();
                m.setSpiller1(m_spiller.getElementAt(videre.get(j)));
                m.setScoreA(1);
                videre.remove(j);
                j = rg.nextInt(videre.size());
                m.setSpiller2(m_spiller.getElementAt(videre.get(j)));
                m.setScoreB(1);
                videre.remove(j);
                r.addMatch(m);
            }

            
        }

        liste.setModel(r.getMatch_liste());
        return r;
    }
}