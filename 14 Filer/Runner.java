import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.Random;

import javax.swing.JOptionPane;

public class Runner {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*
		try {
			FileReader f = new FileReader("eksamensoppgaver.txt");
			int i = f.read();
			while(i>-1){
				System.out.print((char)i);
				i = f.read();
			}
			f.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}
*/
		 try {
			 FileReader f = new FileReader("eksamensoppgaver.txt");
			 BufferedReader bf = new BufferedReader(f);
			 String linje = bf.readLine();
			 while(linje!=null){
				 JOptionPane.showMessageDialog(null, linje);
				 linje = bf.readLine();
			 }
			 bf.close();
			 f.close();
		 } catch (FileNotFoundException e){
			 e.printStackTrace();
		 } catch (IOException e){
			 e.printStackTrace();
		 }
		 
		 try {
			URL u = new URL("http://mortengoodwin.net/dat101/hobbit");
			InputStreamReader i = new InputStreamReader(u.openStream());
			BufferedReader br = new BufferedReader(i);
			String linje = br.readLine();
			 while(linje!=null){
				System.out.println(linje);
				 linje = br.readLine(); // Om ikke denne er med blir første setning skrevet i en evig løkke.
			 }
			 br.close();
			 i.close();
		 } catch (FileNotFoundException e){
			 e.printStackTrace();
		 } catch (IOException e){
			 e.printStackTrace();
		 }
		 
		 try {
			 FileWriter f = new FileWriter("alver.txt"); // Filen alver er blitt laget i mappen workspace.
			 f.write("Galadriel\n");
			 f.write("Gil");
			 f.close();
		 } catch (IOException e){
			 e.printStackTrace();
		 }

		 try {
			FileWriter f = new FileWriter("listeovernavn.txt");
			BufferedWriter bf = new BufferedWriter(f);
			String[] forste = {"Mo", "Jo", "Ma", "El"};
			String[] andre = {"rt","na","thi"};
			String[] siste = {"a", "e", "ie"};
			Random rg = new Random();
			for(int i=0;i<10000;i++){
				String navn = forste[rg.nextInt(forste.length)]+andre[rg.nextInt(andre.length)]+siste[rg.nextInt(siste.length)];
				bf.write(navn);;
				bf.write("\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 Ansatt t1 = new Ansatt();
		 t1.setNavn("Morten");
		 t1.setTimer(100);
		 try {
			FileOutputStream fos = new FileOutputStream("enreg");
			ObjectOutputStream o = new ObjectOutputStream(fos);
			o.writeObject(t1);
			o.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
