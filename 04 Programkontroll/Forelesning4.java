
import javax.swing.JOptionPane;
public class Forelesning4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Løkke eller If-setning? Om ting skal gjøres flere ganger kan man bruke løkke i stedet for å skrive samme ting om igjen og om igjen.
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		/*
		 * If(noe som er sant eller usant){
		 * KODE;
		 * }
		 * 
		 * While-setning: Når man ikke vet på forhånd hvor mange ganger løkken skal kjøres
		 * while(Noe som er sant eller usant){
		 * KODE;
		 * }
		 */
		
		String alderTekst = JOptionPane.showInputDialog(null, "Tast inn alder");
		int alder = Integer.parseInt(alderTekst);
		int teller = 1;
		//teller = teller +1;
		//teller = teller +1;
		while(alder<0){
			JOptionPane.showMessageDialog(null, "Ugyldig alder");
			alderTekst = JOptionPane.showInputDialog(null, "Tast inn alder på nytt");
			alder = Integer.parseInt(alderTekst);
			teller = teller +1;
		}
		JOptionPane.showMessageDialog(null, "Du tastet: " + alder + " - Teller: " + teller);
		
		String timerTekst = JOptionPane.showInputDialog(null, "Tast antall timer");
		int timer = Integer.parseInt(timerTekst);
		
		while(timer>24){
			timerTekst = JOptionPane.showInputDialog(null, "Tast timer på nytt");
			timer = Integer.parseInt(timerTekst);
		}
		
		/*String antallDvergerSomTekst = JOptionPane.showInputDialog(null, "Antall dverger");
		int antallDverger = Integer.parseInt(antallDvergerSomTekst);
		
		if(antallDverger !=7){
			antallDvergerSomTekst = JOptionPane.showInputDialog(null, "Tast dverger igjen");
			antallDverger = Integer.parseInt(antallDvergerSomTekst);
		}*/
		
		/*for(start:hvor lenge skal vi holde på:endring per løkk){
		 * KODE;
		 * }
		 */
	
		for(int flasker=10;flasker>0;flasker = flasker -1){
			JOptionPane.showMessageDialog(null, flasker + " bottles of beer on the wall");
		}
		for(int i=1; i<=31; i=i+1){
			System.out.println("Januar: "+i);
		}
		for(int fiskeboller=1; fiskeboller<=10; fiskeboller = fiskeboller +1){
			JOptionPane.showMessageDialog(null, "Fiskeboller lever i havet, havet er fiskebollens hjem. Dette er det " + fiskeboller + ". verset av 10.");
		}
		String passord = JOptionPane.showInputDialog(null, "Tast inn passord: ");
		while(!passord.equals("mellon")){
			JOptionPane.showMessageDialog(null, "Feil passord!");
			passord = JOptionPane.showInputDialog(null, "Tast på nytt");
		}
		String svar = JOptionPane.showInputDialog(null, "Hvor bor julenissen?");
		while(!svar.equals("Nordpolen")){
			svar = JOptionPane.showInputDialog(null, "Julenissen bor hvor?");
		}
	}

}
