package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.TextArea;

public class Ventana extends JFrame{

	private JPanel contentPane;
	public TextArea textArea;
	
	public TextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(TextArea textArea) {
		this.textArea = textArea;
	}
	
	public String textoTextArea() {
		return textArea.getText();
	
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	String estadoVentana = "";
	
	/**
	 * Create the frame.
	 */
	public Ventana() {
		EventosVentana eventosVentana = new EventosVentana();
		addWindowListener(eventosVentana);
		
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

		textArea.append("Hola");		
		textArea.append("Hola mundo");		
		textArea.append("Hola mundo 2");
		
		
	}

	
	
}
