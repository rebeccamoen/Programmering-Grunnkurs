
public class Konverterer {

	public int kilometerTilMeter(int km){
		return km*1000;
	}
	
	public double utslipp(double km,String type){
		if(type.equals("elbil")){
			return 0;
		}
		else if(type.equals("bensin")){
			return km*0.12;
		}
		else if(type.equals("diesel")){
			return km*0.09;
		}
		else{
			return 0;
		}
	}
	
	public boolean lovlig(int alder){
		/*if(alder>=18){
			return true;
		}
		else{
			return false;
		}*/
		//(PÅSTAND)?HVISSANT:HVISUSANT;
		//return (alder>=18)?true:false;
		return alder>=18;
	}
	
	public double konverterValuta(double NOK,double kurs){
		return NOK/kurs;
	}
	
	public boolean evigLokke(){
		boolean sann = true;
		while(sann){
			System.out.println("Noe");
		}
		return true;
	}
	
	/**
	 * Funksjon som oversetter fra dollar til kroner.
	 * @deprecated bruk dollarTilKroner(double dollar,double kurs)
	 * @param dollar antall dollar som kommatall.
	 * @return antall kroner.
	 */
	@Deprecated
	public double dollarTilKroner(double dollar){
		return dollar/5.5;
	}
	/**
	 * Funksjon som gir kroner for en gitt dollar med kurs
	 * @param dollar antall dollar som kommatall
	 * @param kurs kursen som kommatatall
	 * @return antall kroner.
	 */
	public double dollarTilKroner(double dollar,double kurs){
		return dollar/kurs;
	}
}
