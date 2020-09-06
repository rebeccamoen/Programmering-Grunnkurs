package oblig2;

import javax.swing.JOptionPane;

public class Oblig2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String passord = JOptionPane.showInputDialog(null, "Hva er passordet?");
		JOptionPane.showMessageDialog(null, "Du har tastet følgende passord: " + passord);
		
		String ukersomtekst = JOptionPane.showInputDialog(null, "Skriv antall uker boken er lånt");
		int uker = Integer.parseInt(ukersomtekst);
		
		if(uker>4){
			JOptionPane.showMessageDialog(null, "Lever boken tilbake");
		}
		if(uker<4){
			JOptionPane.showMessageDialog(null, "Du kan låne boken lenger");
		}
		else{ //if(uker=4){
			JOptionPane.showMessageDialog(null, "Du må levere boken tilbake i dag");
		}
		
		String timersomtekst = JOptionPane.showInputDialog(null, "Hvor lenge bruker du på sosiale medier daglig?");
		int timer = Integer.parseInt(timersomtekst);
		
		if(timer>2){
			JOptionPane.showMessageDialog(null, "For mye");
		}
		if(timer<2){
			JOptionPane.showMessageDialog(null, "For lite");
		}
		else{ //if(timer=2){
			JOptionPane.showMessageDialog(null, "Akkurat passe");
		}
	}

}
