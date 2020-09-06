
public class Bok {
	private String tittel;
	
	public String getTittel(){
		return tittel;
	}
	
	public void setTittle(String tittel){
		this.tittel = tittel;
	}

	@Override
	public String toString() {
		return "Bok [tittel=" + tittel + "]";
	}
}
