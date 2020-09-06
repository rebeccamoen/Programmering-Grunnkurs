package oblig4;

import javax.swing.JOptionPane;

public class Oblig4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String riktigTall = JOptionPane.showInputDialog(null, "Gjett et tall mellom 1 og 10");
		int tall = Integer.parseInt(riktigTall);
		int teller = 1;
		
		while(!riktigTall.equals("4")){
			if(tall<4){
				JOptionPane.showMessageDialog(null, "Du har gjettet feil. Riktig tall er høyere.");
				}
			else if(tall>4){
				JOptionPane.showMessageDialog(null, "Du har gjettet feil. Riktig tall er lavere.");
				}
		riktigTall = JOptionPane.showInputDialog(null, "Gjett et tall mellom 1 og 10");
		teller = teller +1;
		}
			
		JOptionPane.showMessageDialog(null, "Du har gjettet riktig. Du gjettet " + teller + " ganger.");
		
	}

}
