
public class Telleklasse {
	String navn;
	
	public Telleklasse(String navn){
		this.navn = navn;
	}
	
	public void telloppover() {
		for(int i=0;i<100;i++){
		System.out.println(navn + " " + i);
		}
	}
}
