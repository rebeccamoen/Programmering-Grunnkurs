package oblig9;

public class Oblig9Brus {
	private String navn;
	private int poengBrus;
	
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public int getPoengBrus() {
		return poengBrus;
	}
	public void setPoengBrus(int poengBrus) {
		this.poengBrus = poengBrus;
	}
	
	public String toString(){
		return this.navn + " " + this.poengBrus + " poeng.";
	}

}
