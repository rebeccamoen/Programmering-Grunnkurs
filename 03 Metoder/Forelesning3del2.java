
public class Forelesning3del2 {
	//Pseudokode for hvordan man lager en funksjon, begynner alltid med offentlighet, hvem får lov til å bruke funksjonen? Bare jeg eller alle?
	/*
	 * offentlighet returverdi navn(Input){
	 * KODE;
	 * KODE;
	 * return returverdi;
	 * }
	 */
	//Lage en funksjon som tar inn kilometer og oversetter til meter. int KmTilMeter kommer ut, int km kommer inn (input og output).
	// int er heltall, double er med komma
	
	public int kmTilMeter(int km){
		int m = km*1000;
				return m;
	}
	
	public double krTilDollar(double kroner){
		double dollar = kroner/8.3;
		return dollar;
	}
	
	//Finne ut hvilket tall som er størst, om tall 1 er større enn tall 2, så skal man få opp tall 1:
	
	public double storste(double tall1, double tall2){
		if(tall1>tall2){
			return tall1;
		}
		else {
			return tall2;
		}
	}
}
