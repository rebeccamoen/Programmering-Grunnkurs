
public class Forfatter {
	private String navn;
	private int antallBoker;
	
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public int getAntallBoker() {
		return antallBoker;
	}
	public void setAntallBoker(int antallBoker) {
		this.antallBoker = antallBoker;
	}
	
	public String toString(){
		return this.navn + " " + this.antallBoker;
	}
	

}
