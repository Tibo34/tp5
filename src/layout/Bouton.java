package layout;

import javax.swing.JButton;

public class Bouton extends JButton {
	
	private int width=10;
	private int height=10;
	
	
	public Bouton(String name) {
		super();
		this.setText(name);
		this.setSize(width, height);
	}
	
}
