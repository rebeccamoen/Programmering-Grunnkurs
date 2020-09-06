import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Model {
	public String hentFilData(){
		String s = "";
		try {
			FileReader f = new FileReader("vitser.txt");
			BufferedReader b = new BufferedReader(f);
			String linje = b.readLine();
			while(linje!= null){
				s+=linje + "\n";
				linje = b.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
		}
		return s;
	}
}
