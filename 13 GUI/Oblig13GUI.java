package oblig13;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Oblig13GUI extends JFrame implements ActionListener{
	
	JButton leggtil = new JButton();
	JButton selge = new JButton();
	JButton aapne = new JButton();
	JButton lagre = new JButton();
	
	double pris;
	int antall;
	
	public DefaultListModel varer = new DefaultListModel();
	
	JList liste = new JList(varer);
	
	public Oblig13GUI(){
		this.setLayout(new FlowLayout());
		this.setSize(500,500);
		
		this.add(lagre);
		this.add(leggtil);
		this.add(selge);
		this.add(aapne);
		this.add(liste);
		
		lagre.setText("Lagre beholdning");
		lagre.addActionListener(this);
		
		leggtil.setText("Legg til vare");
		leggtil.addActionListener(this);
		
		selge.setText("Selg vare");
		selge.addActionListener(this);
		
		aapne.setText("Åpne beholdning");
		aapne.addActionListener(this);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(leggtil)){
            String varer = JOptionPane.showInputDialog(null, "Legg til varer");
            int varepris = Integer.parseInt((JOptionPane.showInputDialog(null, "Legg til pris")));
 
            Oblig13Vare v = new Oblig13Vare();
            v.setPris(varepris);
            v.setVareNavn(varer);
		}
	}

}
