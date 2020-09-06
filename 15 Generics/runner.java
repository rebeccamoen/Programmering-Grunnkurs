import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20); // Legger til element
		System.out.println(l.get(0)); // Leser det aller første elementet i listen
		
		l.add(12);
		l.add(59);
		for(int i=0;i<l.size();i++){
			if(l.get(i)<20){
				System.out.println(l.get(i));
			}
		}
		
		int[] minliste = new int[10];
		minliste[0] = 12;
		minliste[1] = 14;
		System.out.println("I plass 0 er det: " +minliste[0]);
		System.out.println("I plass 1 er det: " +minliste[1]);
		
		for (int i = 0; i < minliste.length; i++){
			System.out.println("I plass " + i + " er det " +minliste[i]);
		}
		
		LinkedList<Integer> minlinkedlist = new LinkedList<Integer>();
		minlinkedlist.add(10);
		minlinkedlist.add(50);
		minlinkedlist.add(20);
		
		for(Integer integer : minlinkedlist){
			System.out.println(integer);
		}
		
		//ArrayList a = new ArrayList(); - Om man ikke har med <Integer> etc, så må man spesifisere nedenfor*
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(20);
		//a.add("hei"); - String så denne er ugyldig
		//int i = (int)a.get(0); - * her, med (int) foran, om man har med <Integer> trengs ikke det!
		int i = a.get(0);
		System.out.println(i);
		
		new MittVindu();
		
		HashSet<Integer> mittsett = new HashSet<Integer>(); // Kan og gjøre det samme med LinkedHashSet, TreeSet (dataen sortert i rekkefølge)
		// Om man skal bruke TreeSet må man sette inn implements Comparable<Person> i "Person" klassen, for å si hvilken rekkefølge
		// Pluss legge til compareTo
		mittsett.add(10);
		System.out.println("Nå kommer HashSet");
		for(Integer i2:mittsett){
			System.out.println(i2);
		}
		
	}

}
