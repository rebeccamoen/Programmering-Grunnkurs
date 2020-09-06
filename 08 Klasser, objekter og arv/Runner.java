import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Forskjellen på en klasse og interface:
		 * 
		 * public class KLASSENAVN{
		 * KODE;
		 * METODER;
		 * }
		 * 
		 * public interface INTERFACENAVN{
		 * REGLER;
		 * }
		*/
		
		Hund porthos = new Hund();
		porthos.snakk();
		
		Katt lurifax = new Katt();
		lurifax.snakk();
		
		ArrayList<Snakking> a = new ArrayList<Snakking>();
		a.add(lurifax);
		a.add(porthos);
		
		for (int i = 0; i < a.size(); i++){
			Snakking noe = a.get(1);
			noe.snakk();
		}
		
		Firkant f = new Firkant();
		f.tegnMeg();
		
		/*
		Snakking etdyr = a.get(0); - Henter ut et objekt av arraylisten, i plass 0 (den første) som kalles etdyr
		Snakking etannetdyr = new Snakking - FEIL, ikke lov å lage objekt av interface
		 */
	
		MittVindu m = new MittVindu();
		
		int alder = 18;
			/*	if(alder>18){
			 *	JOptionPane.showMessageDialog(null, "Du kan komme inn");
			 */
		
		boolean kjennerEieren = true;
		if(alder>=18 || kjennerEieren==true){
			JOptionPane.showMessageDialog(null, "Du kan komme inn");
		}
		
		boolean harPeneSko = true;
		if(alder>18 && harPeneSko==true){
			JOptionPane.showMessageDialog(null, "Du kan komme inn");	
		}
	}

}
