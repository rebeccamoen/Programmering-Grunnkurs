
public class Hero {
	private String fornavn;
	private String etternavn;
	
	public String getFornavn() {
		return fornavn;
	}
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	public String getEtternavn() {
		return etternavn;
	}
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	
	public String toString(){ // Hvordan skal objektet skrives ut?
		return this.fornavn + " " + this.etternavn; // Sånn vil jeg at det skal se ut
	}
	
	/*
	 * @Override
	 * 	public String toString() {
	 * 		return "Hero [fornavn=" + fornavn + ", etternavn=" + etternavn + "]";
	 * 	}
	*/
	
}
