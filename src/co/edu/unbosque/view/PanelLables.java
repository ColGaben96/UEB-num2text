package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.*;

public class PanelLables extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JLabel numeros = new JLabel("Número"); private JLabel texto = new JLabel("Texto");
	
	public PanelLables()
	{
		Cargar();
	}
	
	public void Cargar()
	{
		setLayout(new GridLayout(1, 2));
		numeros.setFont(new Font("", Font.TRUETYPE_FONT, 20));
		texto.setFont(new Font("", Font.TRUETYPE_FONT, 20));
		add(numeros);
		add(texto);
	}
}
