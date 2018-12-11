package layout;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;

import com.sun.glass.events.MouseEvent;

import event.windowClose;

public class MiseEnPage extends JFrame {

	private int width=300;
	private int height=300;
	private String titre="Le titre";
	private Point position=new Point(200,200);
	private Bouton bBorder;
	private Bouton bFlow;
	private Bouton bGrid;
	private Bouton bCompose;
	private Bouton bQuit;	
	
	public MiseEnPage() {
		super();
		bBorder=new Bouton("Border");
		bBorder.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		bFlow=new Bouton("Flow");
		bFlow.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				flow();
			}
		});
		bGrid=new Bouton("Grid");
		bGrid.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				grid();
			}
		});
		bCompose=new Bouton("Compose");
		bCompose.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		bQuit=new Bouton("Quit");
		bQuit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		this.setTitle(titre);		
	}
	
	public void initialisation() {	
		setSize(width, height);
		setLocation(position.x, position.y);		
		setVisible(true);		
	}	
	
	 public void flow() {		
		setTitle("FlowLayout");
		setLayout(new FlowLayout());
		removeBoutons();
		addBoutons();
		repaint();
	 }
	 
	 private void addBoutons() {
		add(bBorder);
		add(bFlow);
		add(bGrid);
		add(bCompose);
		add(bQuit);		
	}

	public void grid() {
		titre="GridLayout";
		setLayout(new GridLayout(3,2));
		removeBoutons();
		addBoutons();
		repaint();		
	 }
	

	private void removeBoutons() {
		remove(bBorder);
		remove(bFlow);
		remove(bGrid);
		remove(bCompose);
		remove(bQuit);		
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
		page.grid();
		page.addWindowListener(new windowClose());
		
				
		
		
	}
}
