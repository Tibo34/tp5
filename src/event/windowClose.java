package event;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import layout.MiseEnPage;

public class windowClose extends WindowAdapter {
	
	@Override
	public void windowClosing(WindowEvent e) {	
		System.out.println("Fermeture fenetre");
		super.windowClosing(e);
		System.exit(0);
		
	}

}
