import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GUI extends JFrame implements ActionListener {
    Controller c = new Controller();
    Turnering t;
    Runde r;
    JPanel panel_11 = new JPanel();
    JPanel panel_12 = new JPanel();
    JPanel panel_13 = new JPanel();
    JPanel panel_21 = new JPanel();
    JPanel panel_22 = new JPanel();
    JPanel panel_23 = new JPanel();

    //panel_11
    DefaultListModel<Turnering> m_turnering = new DefaultListModel<Turnering>();
    JLabel panel_11_label = new JLabel("Turneringer:");
    JList panel_11_liste = new JList(m_turnering);
    JScrollPane panel_11_scrollpane = new JScrollPane(panel_11_liste);

    //panel_12
    JLabel panel_12_label = new JLabel("Administrering av turnering");
    JButton turnering_oppdater = new JButton("Oppdater");
    JButton turnering_load = new JButton("Last inn");
    JButton turnering_ny = new JButton("Legg til");
    JButton turnering_slett = new JButton("Slett");


    //Navn og datofelt panel
    JPanel panel_12_navnfelt = new JPanel(new FlowLayout());
    JPanel panel_12_b1_container = new JPanel(new FlowLayout());
    JPanel panel_12_b2_container = new JPanel(new FlowLayout());
    JLabel panel_12_navnlabel = new JLabel("Navn:");
    JTextField panel_12_navn = new JTextField("");
    JPanel panel_12_datofelt = new JPanel(new FlowLayout());
    JLabel panel_12_datolabel = new JLabel("Dato:");
    JTextField panel_12_dato = new JTextField();


    //panel_13
    DefaultListModel<Spiller> m_spiller = new DefaultListModel<Spiller>();
    JLabel panel_13_label = new JLabel("Spillere");
    JPanel panel_13_panel = new JPanel(new FlowLayout());
    JTextField panel_13_navn = new JTextField();
    JLabel panel_13_navnlabel = new JLabel("Navn:");
    JButton spiller_ny = new JButton("Legg til");
    JButton spiller_slett = new JButton("Slett");
    JList panel_13_liste = new JList(m_spiller);
    JScrollPane panel_13_scrollpane = new JScrollPane(panel_13_liste);

    //panel_21
    DefaultListModel<Runde> m_runde = new DefaultListModel<Runde>();
    JLabel panel_21_label = new JLabel("Runder");
    JList panel_21_liste = new JList(m_runde);
    JScrollPane panel_21_scrollpane = new JScrollPane(panel_21_liste);
    JPanel panel_21_knappepanel = new JPanel(new FlowLayout());
    JButton runde_ny = new JButton("Generer neste runde");
    JButton runde_avslutt = new JButton("Avslutt");

    //panel_22
    DefaultListModel<Match> m_match= new DefaultListModel<Match>();
    JLabel panel_22_label = new JLabel("Matcher");
    JList panel_22_liste = new JList(m_match);
    JScrollPane panel_22_scrollpane = new JScrollPane(panel_22_liste);


    public GUI() {
        this.setLayout(new GridLayout(2, 3));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 550);
        this.setTitle("Squash turnering");
        this.setResizable(false);

        //panel_11 venstre top
        panel_11.setLayout(new BoxLayout(panel_11, BoxLayout.PAGE_AXIS));
        panel_11.add(panel_11_label, LEFT_ALIGNMENT);
        panel_11.add(panel_11_scrollpane, LEFT_ALIGNMENT);


        //panel_12 midtre top
        panel_12.setLayout(new BoxLayout(panel_12, BoxLayout.PAGE_AXIS));
        panel_12.add(panel_12_label);

        //Navn og datofelt
        panel_12_navn.setPreferredSize(new Dimension(150, 20));
        panel_12_navnfelt.add(panel_12_navnlabel);
        panel_12.add(Box.createVerticalStrut(25));
        panel_12_navnfelt.add(panel_12_navn);
        panel_12.add(panel_12_navnfelt, LEFT_ALIGNMENT);
        panel_12_dato.setPreferredSize(new Dimension(150, 20));
        panel_12_datofelt.add(panel_12_datolabel);
        panel_12_datofelt.add(panel_12_dato);
        panel_12.add(panel_12_datofelt, LEFT_ALIGNMENT);
        //Knapper
        panel_12_b1_container.add(turnering_ny);
        panel_12_b2_container.add(turnering_load);
        panel_12_b1_container.add(Box.createHorizontalStrut(8));
        panel_12_b2_container.add(Box.createHorizontalStrut(25));
        panel_12_b1_container.add(turnering_oppdater);
        panel_12_b2_container.add(turnering_slett);
        panel_12.add(panel_12_b1_container);
        panel_12.add(panel_12_b2_container);
        panel_12.add(Box.createVerticalStrut(45));
        turnering_load.addActionListener(this);
        turnering_ny.addActionListener(this);
        turnering_oppdater.addActionListener(this);
        turnering_slett.addActionListener(this);

        //panel_13 høyre top
        panel_13.setLayout(new BoxLayout(panel_13, BoxLayout.PAGE_AXIS));
        panel_13.add(panel_13_label, LEFT_ALIGNMENT);
        panel_13_scrollpane.setPreferredSize(new Dimension(230, 150));
        panel_13_panel.add(panel_13_scrollpane);
        panel_13_panel.add(panel_13_navnlabel);
        panel_13_navn.setPreferredSize(new Dimension(150, 20));
        panel_13_panel.add(panel_13_navn);
        panel_13_panel.add(spiller_ny);
        panel_13_panel.add(spiller_slett);
        spiller_ny.addActionListener(this);
        spiller_slett.addActionListener(this);
        panel_13.add(panel_13_panel);


        //panel_21 venstre bunn
        panel_21.setLayout(new BoxLayout(panel_21, BoxLayout.PAGE_AXIS));
        panel_21.add(panel_21_label);
        panel_21.add(panel_21_scrollpane);
        panel_21_knappepanel.add(runde_ny);
        panel_21_knappepanel.add(runde_avslutt);
        panel_21.add(panel_21_knappepanel);
        panel_21_scrollpane.setPreferredSize(new Dimension(210,250));
        runde_avslutt.addActionListener(this);
        runde_ny.addActionListener(this);


        //panel_22 midtre bunn
        panel_22.setLayout(new BoxLayout(panel_22, BoxLayout.PAGE_AXIS));
        panel_22.add(panel_22_label);
        panel_22.add(panel_22_scrollpane);

        //panel_23 høyre bunn


        //Legger til alle panel og setter synlig
        this.add(panel_11);
        this.add(panel_12);
        this.add(panel_13);
        this.add(panel_21);
        this.add(panel_22);
        this.add(panel_23);
        this.setVisible(true);
        t = null;
    }

    public void reload_lister() {
        m_spiller = t.getSpiller_liste();
        m_runde = t.getRunde_liste();
        //m_match = r.getMatch_liste();

        panel_13_liste.setModel(m_spiller);
        panel_21_liste.setModel(m_runde);
        //panel_22_liste.setModel(m_match);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Turnering administrasjon
        if (e.getSource().equals(turnering_ny)) {
            String navn = panel_12_navn.getText();
            String dato = panel_12_dato.getText();
            t = c.turnering_ny(navn, dato);
            m_turnering.addElement(t);

            panel_11_liste.setSelectedValue(t, true);
            m_spiller = t.getSpiller_liste();
            reload_lister();
            panel_13_liste.setModel(m_spiller);
        } else if (e.getSource().equals(turnering_load)) {
            t = m_turnering.getElementAt(panel_11_liste.getSelectedIndex());
            reload_lister();

            panel_12_navn.setText(t.getNavn());
            panel_12_dato.setText(t.getDato());
        } else if (e.getSource().equals(turnering_oppdater)) {
            t.setNavn(panel_12_navn.getText());
            t.setDato(panel_12_dato.getText());
        } else if (e.getSource().equals(turnering_slett)) {
            if (m_turnering.getSize() > 0) {


                t = m_turnering.getElementAt(panel_11_liste.getSelectedIndex());
                c.turnering_slett(m_turnering, t);
                panel_12_navn.setText("");
                panel_12_dato.setText("");
                panel_13_navn.setText("");
                m_match.clear();
                panel_22_liste.setModel(m_match);
                if (m_turnering.getSize() > 0) {
                    t = m_turnering.getElementAt(m_turnering.getSize() - 1);
                    panel_11_liste.setSelectedValue(t, true);
                    reload_lister();
                } else {
                    t = null;
                }
            }
        } else if (t == null) {
            JOptionPane.showMessageDialog(null, "Lag en turnering først.");
        } else {
            //Spiller administrasjon
            if (e.getSource().equals(spiller_ny)) {
                String navn = panel_13_navn.getText();
                c.spiller_ny(m_spiller, navn);
                panel_13_navn.setText("");
            } else if (e.getSource().equals(spiller_slett)) {
                if ((panel_13_liste.getSelectedIndex() == -1) & m_spiller.getSize() > 0) {
                    c.spiller_slett(m_spiller, m_spiller.getElementAt(m_spiller.getSize() - 1));
                } else if (m_spiller.getSize() > 0) {
                    c.spiller_slett(m_spiller, m_spiller.getElementAt(panel_13_liste.getSelectedIndex()));
                }
            }

            //Runde administrering
            else if (m_spiller.getSize() > 0) {
                if (e.getSource().equals(runde_avslutt)& m_runde.size() > 0) {
                    c.runde_avslutt(r);
                    reload_lister();
                }
                if (e.getSource().equals(runde_ny)) {
                    if (r != null) {
                        c.runde_avslutt(r);
                        r = null;
                    }
                    else {
                    r = c.runde_ny(m_runde,m_spiller,panel_22_liste);
                    m_runde.addElement(r);
                    reload_lister();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Legg til spillere først.");
            }
        }

        revalidate();
        repaint();
    }
}