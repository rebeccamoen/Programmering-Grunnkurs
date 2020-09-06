import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Konverterer k = new Konverterer();
		int tall = k.kilometerTilMeter(10);*/
		int tall = Konverterer.kilometerTilMeter(10);
		System.out.println(tall);
		
		JOptionPane a = new JOptionPane();
		a.showMessageDialog(null, "hei");
		
		Controller c = new Controller();
	}

}
