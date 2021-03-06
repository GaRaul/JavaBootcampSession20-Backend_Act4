package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.TextArea;

public class Ventana extends JFrame implements WindowListener{

	private JPanel contentPane;
	public TextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void vista() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public Ventana() {
		
		addWindowListener(this);
		
		setTitle("Ventana oyente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEventos = new JLabel("Eventos");
		lblEventos.setBounds(10, 132, 46, 14);
		contentPane.add(lblEventos);
		
		textArea = new TextArea();
		textArea.setBounds(72, 62, 380, 160);
		contentPane.add(textArea);
		
		
	}

	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		textArea.append("Ventana abierta\n");
		
	}

	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		textArea.append("Cerrando ventana\n");
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		textArea.append("Ventana cerrada\n");
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		textArea.append("Ventana minimizada\n");
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		textArea.append("Ventana desminimizada\n");
	}

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		textArea.append("Ventana activada\n");
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		textArea.append("Ventana desactivada\n");
	}
	
}
