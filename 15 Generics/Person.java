
public class Person {
	private String navn;
	private String handle;
	public Person(String navn, String handle){
		super();
		this.navn = navn;
		this.handle = handle;
	}
	
	@Override
	public String toString() {
		return navn + "(" + handle + ")";
	}

}
