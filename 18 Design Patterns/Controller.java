import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{

	View mittView;
	Model minModel;
	public Controller(){
		mittView = new View(this);
		minModel = new Model();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource().equals(mittView.knapp)){
			String data = this.minModel.hentFilData();
			this.mittView.felt.setText(data);
		}
	}

}
