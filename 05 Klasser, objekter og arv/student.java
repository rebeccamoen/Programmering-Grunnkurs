
public class student {
	public int studentnummer;	//lager en offentlig variabel for klassen, slik at alle kan se "studentnummeret".
	public String fornavn;		//det skal være til felles at alle studentene skal ha fornavn og etternavn.
	public String etternavn;
	public String fullførtutdannelse = "Videregående";	//alle har fullført videregående, så kan sette det fast.
	
	public int plussTo(int x, int y){
		int n = x+y;
		return n;
	}
	
	public String getFulltnavn(){	//get foran ting som skal hentes ut, tom parantes fordi ingenting skal inn.
		String fulltnavn = this.fornavn + " " + this.etternavn;
		return fulltnavn;
									//this foran for å være helt sikker på at den velger riktig.
	}

}
