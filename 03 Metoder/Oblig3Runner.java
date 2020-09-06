package oblig3;

import javax.swing.JOptionPane;

public class Oblig3Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Oblig3Funksjoner f = new Oblig3Funksjoner();

		String antallKroner = JOptionPane.showInputDialog(null, "Skriv antall kroner");
		
		double kroner = Double.parseDouble(antallKroner);
		double euro = f.kronerTilEuro(kroner);
		JOptionPane.showMessageDialog(null, kroner + " kr er " + euro + " euro");
		
		double yen = f.kronerTilYen(kroner);
		JOptionPane.showMessageDialog(null, kroner + " kr er " + yen + " yen");
		
	}

}
