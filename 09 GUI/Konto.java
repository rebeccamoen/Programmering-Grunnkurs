import javax.swing.JOptionPane;

public class Konto {
	private int saldo = 0;
	public void setSaldo(int saldo){ // metode som ikke tar inn noen ting, men setter en variabel saldo
		if(saldo>0){
		this.saldo = saldo; // setter this.saldo for saldoen til denne klassen, om ikke this blir det den nærmeste
		}
		else{
			JOptionPane.showMessageDialog(null, "Ikke lov med negativ saldo, skaff mere penger");
		}
	}
	public int getSaldo(){
		return this.saldo;
	}
}
