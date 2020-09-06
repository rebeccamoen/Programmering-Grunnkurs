package oblig17;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


// http://188.138.32.138/dat101/oppgaver/bilder/basket.jpg

public class Oblig17Kurv {
	
//	extends Applet
//	Image img;
	
	private int x = 300; // Start posisjon
	private int y = 600;
	private int bredde = 40; // Størrelse
	private int hoyde = 40;
	private Color farge = Color.BLACK;
	
//	public void init() {
//		try {
//            URL pic = new URL(getDocumentBase(), "http://188.138.32.138/dat101/oppgaver/bilder/basket.jpg");
//            img = ImageIO.read(pic);
//        } catch(Exception e) {
//            // tell us if anything goes wrong!
//            e.printStackTrace();
//        }
//		img = getImage(getDocumentBase(), getParameter("http://188.138.32.138/dat101/oppgaver/bilder/basket.jpg"));
//	}
	
	public void drawMe(Graphics k){
//		super.paint(k);
//        if (img!=null) {
//            k.drawImage(img, 100, 100, this);
//        }
		k.setColor(farge);
//		k.drawImage(img, 0, 0, this);
		k.fillRect(this.x, this.y, this.bredde, this.hoyde);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getBredde() {
		return bredde;
	}

	public void setBredde(int bredde) {
		this.bredde = bredde;
	}

	public int getHoyde() {
		return hoyde;
	}

	public void setHoyde(int hoyde) {
		this.hoyde = hoyde;
	}

	public Color getFarge() {
		return farge;
	}

	public void setFarge(Color farge) {
		this.farge = farge;
	}

}
