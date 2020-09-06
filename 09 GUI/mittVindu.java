import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class mittVindu extends JFrame implements ActionListener{
	
	JButton leggTil = new JButton(); // Legger til en knapp
	DefaultListModel<Forfatter> forfatterModel = new DefaultListModel<Forfatter>();
	DefaultListModel<Bok> bokModel = new DefaultListModel<Bok>();
	
	public mittVindu(){
		FlowLayout f = new FlowLayout();
		this.setLayout(f);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		String[] valg = new String[3]; // Kan ha 3 ting
		valg[0] = "Americano"; // Valg nr 1
		valg[1] = "Espresso"; // Valg nr 2
		valg[2] = "Latte"; // Valg nr 3
		
		JList liste = new JList(valg); // Må lage liste i JList for at valgene skal synes, valg = listen som vises
		this.add(liste); // Denne legger til listen
		*/
		

		leggTil.setText("Legg til forfatter"); // Gir tekst til knappen
		this.add(leggTil); // Legger til knappen i GUI'et
		leggTil.addActionListener(this);
		
		JList liste = new JList(forfatterModel);
		this.add(liste);
		
		JList liste2 = new JList(bokModel);
		this.add(liste2);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(leggTil)){ // Om kilden er knappen, så skal dette skje:
			
			Forfatter f = new Forfatter();
			
			String navn = JOptionPane.showInputDialog(this, "Skrive forfatter");
			f.setNavn(navn); // Skriver tilbake det brukeren taster inn
			String antallBoker = JOptionPane.showInputDialog(this, "Skriv inn antall bøker");
			int antall = Integer.parseInt(antallBoker); // Siden antall bøker er tall må denne til
			
			f.setAntallBoker(antall);
			forfatterModel.addElement(f);
			
			Bok b = new Bok();
			b.setTittle("Lord of the Rings");
			bokModel.addElement(b);
			
		}
	}

}
