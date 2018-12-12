package layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import com.sun.glass.events.MouseEvent;
import event.windowClose;

public class MiseEnPage extends JFrame {

	private int width=300;
	private int height=300;
	private String titre="Le titre";
	private Point position=new Point(200,200);
	private BoutonJPanel panel;
	
	
	
	public MiseEnPage() {
		super();		
		this.setTitle(titre);		
	}
	
	public void initialisation() {	
		setSize(width, height);
		setLocation(position.x, position.y);
		panel=new BoutonJPanel(this);
		add(panel);
		setVisible(true);		
	}	


	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getTitle() {
		return titre;
	}

	public void setTitle(String title) {
		super.setTitle(title);
		this.titre = title;		
	}

	
	
	public static void main(String[] args) {
		MiseEnPage page=new MiseEnPage();		
		page.initialisation();
		page.panel.flow();
		page.addWindowListener(new windowClose());	
				
	}
}
