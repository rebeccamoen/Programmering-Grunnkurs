import javax.swing.JOptionPane;

public class dnabevis extends bevis{
	public int kvalitet;
	
	public dnabevis(){
		String kvalitetTekst = JOptionPane.showInputDialog(null, "Skriv kvaliteten");
		this.kvalitet = Integer.parseInt(kvalitetTekst);
	}
}
