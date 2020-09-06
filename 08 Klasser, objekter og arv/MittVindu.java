import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MittVindu extends JFrame implements ActionListener{
	public String svar = "Jordbær";
	JButton knapp = new JButton();
	JButton knapp2 = new JButton();
	JButton superknapp = new JButton();
	
	public MittVindu(){
		this.setVisible(true);
		FlowLayout f = new FlowLayout();
		this.setLayout(f);
		
		knapp.setText("Trykk her for å få vite en hemmelighet");
		this.add(knapp); // Legger til knappen på vinduet
		knapp.addActionListener(this); // Legger til så den kan brukes, "this" sier at det er "meg selv" som lytter
		
		knapp2.setText("Trykk her for å få vite fasit");
		this.add(knapp2);
		knapp2.addActionListener(this);
		
		superknapp.setText("Superknappen");
		this.add(superknapp);
		superknapp.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Hvis jeg trykker på X skal hele programmet slutte
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(knapp)){ // For å finne ut om det er knapp eller knapp2 man trykker på
			String brukersvar = JOptionPane.showInputDialog(this, "Gjett hemmeligheten");
			if(brukersvar.equals(this.svar)){
				JOptionPane.showMessageDialog(this, "Riktig gjettet");
			}
		}
		if(e.getSource().equals(knapp2)){
			JOptionPane.showMessageDialog(this, this.svar);
		}
		if(e.getSource().equals(superknapp)){
			JOptionPane.showMessageDialog(this, "Du har trykket på superknappen");
		}
	}
}
