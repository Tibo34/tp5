package layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BoutonJPanel extends JPanel{
	
	private JButton bBorder;
	private JButton bFlow;
	private JButton bGrid;
	private JButton bCompose;
	private JButton bQuit;
	private MiseEnPage page;
	private String[] listBorder= {}; 
	
	
	public BoutonJPanel(MiseEnPage p) {
		page=p;
		bBorder=new JButton("Border");
		bBorder.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				border();				
			}
		});
		bFlow=new JButton("Flow");
		bFlow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				flow();
			}
		});
		
		bGrid=new JButton("Grid");
		bGrid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				grid();
			}
		});
		bCompose=new JButton("Compose");
		bCompose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 compose();
			}
		});
		bQuit=new JButton("Quit");
		bQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quit();
			}

		});
		addBoutons();
		this.setLayout(new FlowLayout());
	}
	
	 public void flow() {		
			this.setLayout(new FlowLayout());
			page.setTitle("FlowLayout");			
			validate();			
	}
	 
	 public void compose() {
		 this.setLayout(new GridLayout(2,1,20,20));
		page.setTitle("Compose");
		removeAll();
		JPanel l1,l2;
		l1=new JPanel(new GridLayout(1,3,10,10));
		l1.add(bBorder);
		l1.add(bFlow);
		l1.add(bGrid);
		l2=new JPanel(new GridLayout(1,2,20,20));
		l2.add(bCompose);
		l2.add(bQuit);
		add(l1);
		add(l2);
		validate(); 			
	 }
	 
	 public void border() {
		 	setLayout(new BorderLayout());
			page.setTitle("BorderLayout");			
			addBoutonsBorder();
			validate();		
	}
	 
	public void grid() {			
			this.setLayout(new GridLayout(3,2));
			page.setTitle("GridLayout");			
			validate(); 			
	}
	
	

	private void addBoutons() {
		removeAll();
		add(bBorder);
		add(bFlow);
		add(bGrid);
		add(bCompose);
		add(bQuit);		
	}
	
	private void addBoutonsBorder() {
		removeAll();
		add(bBorder,BorderLayout.NORTH);
		add(bFlow,BorderLayout.WEST);
		add(bGrid,BorderLayout.EAST);
		add(bCompose,BorderLayout.CENTER);
		add(bQuit,BorderLayout.SOUTH);		
	}
	
	

	

	private void Quit() {
		System.exit(0);		
	}
	

}
