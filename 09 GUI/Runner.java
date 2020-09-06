import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Konto k = new Konto();
		k.setSaldo(200); // da kjøres setSaldoen fra "Konto" klassen, og Saldoen (private variabelen) endrer seg
		k.setSaldo(k.getSaldo() - 500); // får ut Saldo som er 200, og trekker fra 500, -300 settes inn som Saldo
		JOptionPane.showMessageDialog(null, "Saldo er: " + k.getSaldo()); // Må bruke k.getSaldo - k.saldo er privat
		
		/*
		Denne metoden brukes om variabelen er offentlig: (public int saldo = 0; i klassen konto)
		
		k.saldo = 200;
		k.saldo = k.saldo - 500;
		JOptionPane.showMessageDialog(null, "Saldo er " + k.saldo + " kroner");
		*/
		
		Hero h = new Hero();
		h.setFornavn("James");
		h.setEtternavn("Bond");
		JOptionPane.showMessageDialog(null, h);
		
		mittVindu m = new mittVindu();
		
	}

}
