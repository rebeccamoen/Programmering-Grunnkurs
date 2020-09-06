import java.net.MalformedURLException;
import java.net.URL;
 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
 
public class pannekaker extends JFrame {
 
    public pannekaker(){
 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(798, 471);
        URL u = null;
        try {
            u = new URL("http://mortengoodwin.net/mario/pancakes.jpg");
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(u!=null){
            ImageIcon i = new ImageIcon(u);
            System.out.println(i.getIconWidth());
            System.out.println(i.getIconHeight());
            JLabel l = new JLabel(i);
            this.add(l);
        }
        this.setVisible(true);
 
    }
 
}