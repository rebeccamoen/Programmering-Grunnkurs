import java.awt.Point;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		Point p = new Point();
		
		String navn = "Leia Organa"; //Primitiv
		String navn2 = new String("Leia Organa"); //Objekt
		
		int[] mangetall = new int[10];
		mangetall[0] = 15;
		System.out.println(mangetall[0]);
		System.out.println(mangetall.length);
		
		String navn3 = "Leia Organa";
		System.out.println(navn3.charAt(0));
		System.out.println(navn3.length());
		
		for(int i=0; i<navn3.length();i++){
			JOptionPane.showMessageDialog(null, "Bokstaven i plass nummer "+i+ " er " + navn3.charAt(i));
		}
		
		int tall1 = 29;
		int tall2 = 43;
		if(tall1==tall2){
			System.out.println("Like");	
		}
		
		String name1 = JOptionPane.showInputDialog(null, "skriv navn 1");
		String name2 = JOptionPane.showInputDialog(null, "skriv navn 2");
		if(name1.equals(name2)){
			System.out.println("Like");
		}
		
		if(name1.startsWith("Leia")){
			System.out.println("Starter med Leia");
		}
		if(name1.endsWith("Organa")){
			System.out.println("Slutter med Organa");
		}
		String tekst = "Dette er en nokså lang tekst";
		String ingress = tekst.substring(0,10);
		JOptionPane.showMessageDialog(null, "Ingressen er: " +ingress);
		
		String etNyttNavn = JOptionPane.showInputDialog(null, "Skriv et navn");
		if(etNyttNavn.endsWith("Organa")){
			System.out.println(etNyttNavn.substring(0, 5));
		}
		if(etNyttNavn.endsWith("Solo")){
			System.out.println(etNyttNavn.substring(0,3));
		}
		
		String studenter = "Merry Pippin Bilbo Bill Daisy Willy Drogo Frodo Sam";
		String[]studentarray = studenter.split(" "); //For å dele opp en string og få nye arrays
		Arrays.sort(studentarray); //Sorterer arrayen alfabetisk
			for(int i = 0; i < studentarray.length; i++){
				JOptionPane.showMessageDialog(null, "Student " +i+ " heter " + studentarray[i]);
			}
		
			
		int posisjon = studenter.indexOf("Willy");
		JOptionPane.showMessageDialog(null, "Willy er på posisjon " +posisjon);
		if(posisjon>-1){
			JOptionPane.showMessageDialog(null, "Wilma finnes og er i posisjon: " +posisjon);
		}
		
		String tekst2 = "sau hest ku okse sau";
		String[]tekst2array = tekst.split(" ");
		for(int i=0;i<tekst2array.length;i++){
			JOptionPane.showMessageDialog(null, tekst2array[i].toUpperCase());
		}
		
		new GUI(); // Nytt objekt av GUIen
	}

}
