import java.util.Random;

import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rg = new Random(); // Skal lage et tilfeldig tall, trenger et objekt av klassen
								  // Kan importere ved å klikke cmd + shift + O, istedet for å høyreklikke
		int tall = rg.nextInt(3); // Tallet som kommer ut er LAVERE enn 3, kan være 0, 1 eller 2
		JOptionPane.showMessageDialog(null, "Tallet er " + tall);
		
		int tall2 = rg.nextInt(2); // Her blir tallet enten 0 eller 1
		if(tall2==0){			   // Skal lage et nytt program som velger middag, enten taco eller pizza
			JOptionPane.showMessageDialog(null, "Pizza");
		}						   // Om tallet blir 0 svarer den Pizza
		else{ 					   // Om tallet er 1 svarer den Taco
			JOptionPane.showMessageDialog(null, "Taco");
		}
		for (int i= 0; i < 7; i++){       // Velger ut 7 tilfeldig tall
			int tall3 = rg.nextInt(37)+1; // Tallene er fra 1 til 37, ikke fra 0 til 36
			System.out.println(tall3);
		}
		
		MittVindu mv = new MittVindu();   // Lager et nytt objekt av MittVindu
		
		Tetris t = new Tetris();
	}

}
