import java.io.Serializable;

public class Ansatt implements Serializable{
	private String navn;
	private int timer;
	private int lonn;
	
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public int getTimer() {
		return timer;
	}
	public void setTimer(int timer) {
		this.timer = timer;
	}
	public int getLonn() {
		return lonn;
	}
	public void setLonn(int lonn) {
		this.lonn = lonn;
	}
}
