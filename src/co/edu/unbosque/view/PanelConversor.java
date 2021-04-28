package co.edu.unbosque.view;
import javax.swing.*;
import java.awt.*;
public class PanelConversor extends JPanel
{	
	private static final long serialVersionUID = 1L;
	private JTextArea numeros = new JTextArea(), texto = new JTextArea();
	
	public PanelConversor()
	{
		Cargar();
	}
	
	public void Cargar()
	{
		setLayout(new GridLayout(1, 2));
		numeros.setFont(new Font("", Font.PLAIN, 90));
		texto.setFont(new Font("", Font.PLAIN, 35));
		add(numeros);
		add(texto);
		texto.setEditable(false);
		texto.setBackground(Color.LIGHT_GRAY);
	}

	public JTextArea getNumeros() {
		return numeros;
	}

	public JTextArea getTexto() {
		return texto;
	}
}
