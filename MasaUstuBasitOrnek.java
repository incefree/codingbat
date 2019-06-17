package codingBat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class MasaUstuBasitOrnek {

	public static void main(String[] args) {
		
	JOptionPane.showMessageDialog(null, "hello");
		
		JFrame window = new JFrame();
		window.setSize(800, 600);
		window.setLocation(500, 400);
		window.setVisible(true);	
		
		JLabel label = new JLabel("Hello");
		
		window.add(label);
	}

}
