package vista;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventosVentana implements WindowListener{
	
	Ventana ventana;
	
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("OPENED");
		
	}

	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("CLOSING");
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("CLOSED");
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ICONIFIED");
		try {
			ventana.textArea.append("Hola2");

		}catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("DEICONIFIED");
	}

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ACTIVATED");
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("DEACTIVATED");
	}

}
