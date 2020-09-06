import javax.swing.JOptionPane;

public class Forelesning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		System.out.println("tekst til skjerm");
		JOptionPane.showMessageDialog(null, "En beskjed");
		JOptionPane.showInputDialog(null, "Her er et spørsmål");
		
		//TYPE navn = verdi;
		//Skruer Mortens_skruer = 549_skruer;
		
		//Gave Til_Kona = Diamanter;
		//Gave Til_Kona = 549_skruer; //FEIL
		
		//TYPE navn = verdi;
		String fornavn = "Morten";
		
		System.out.println(fornavn);
		System.out.println("Velkommen " + fornavn);
		
		int alder = 34;
		double lop60meteren = 11.21433;
		boolean santellerusant = false; //true eller false;
		
		int uker = 24;
		int timer = 2;
		int minutter = 45;
		int sekunder =  60;
		
		int sekundermedjava = uker*timer*minutter*sekunder;
		System.out.println(sekundermedjava);
		
		double lop100meteren = 13.3;
		lop100meteren = 12.2;
		System.out.println(lop100meteren);
		
		String navn = JOptionPane.showInputDialog(null, "Skriv navnet ditt");
		JOptionPane.showMessageDialog(null, "Ditt navn er " + navn);
	
		String passord = JOptionPane.showInputDialog(null, "Hva er passordet?");
		JOptionPane.showMessageDialog(null, "Du har tastet følgende passord: " + passord);
		*/
		
		/*
		String alder = "34";
		System.out.println(alder+1);
		int alder_som_tall = Integer.parseInt(alder);
		System.out.println(alder_som_tall+1);
		*/
		
		/*
		String alder = JOptionPane.showInputDialog(null, "Skriv alder");
		int alder_som_tall = Integer.parseInt(alder);
		JOptionPane.showMessageDialog(null,"neste år er du: " + (alder_som_tall+1) );
		*/
		
		//If (noe som er sant eller usant){
		//KODE;
		//}
		
		if(12<15){
			System.out.println("Stemmer");
		}
		
		//String alder_som_tekst = "34";
		
		String alder_som_tekst = JOptionPane.showInputDialog(null, "Skriv din alder");
		int alder = Integer.parseInt(alder_som_tekst);

		if(alder>14){
			System.out.println("Voksenbillett");
		}
		else { //if(alder<=14){
			System.out.println("Barnebillett");
		}
		
		String timersomtekst = JOptionPane.showInputDialog(null, "Skriv antall timer");
		int timer = Integer.parseInt(timersomtekst);
		
		if(timer>37){
			JOptionPane.showMessageDialog(null, "Overtid");
		}
		else{ //if(timer<=37){
			JOptionPane.showMessageDialog(null, "Ikke Overtid");
		}
	}

}
