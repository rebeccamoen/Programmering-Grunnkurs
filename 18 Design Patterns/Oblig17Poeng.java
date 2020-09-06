package oblig17;

public class Oblig17Poeng {
	public double points;
	
	public int compareTo(Oblig17Poeng arg0){
		if(arg0.points==points){
			return 0;
		}
		else if(arg0.points<points){
			return -1;
		}
		return 1;
	}
}
