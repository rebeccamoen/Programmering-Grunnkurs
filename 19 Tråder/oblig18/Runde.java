import javax.swing.*;

public class Runde {
    private DefaultListModel<Match> m_match = new DefaultListModel<Match>();
    private int nr;
    private String navn;
    private String status;

    public DefaultListModel<Match> getMatch_liste() {
        return m_match;
    }

    public void addMatch(Match m) {
        m_match.addElement(m);
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "#" + Integer.toString(nr) + ": " + status;
    }
}