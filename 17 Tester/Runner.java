import javax.swing.JOptionPane;


public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Konverterer k = new Konverterer();
		k.dollarTilKroner(24);
		//k.
		if(k.kilometerTilMeter(1)!=1000){
			JOptionPane.showMessageDialog(null, "Ikke riktig");
		}
	}

}