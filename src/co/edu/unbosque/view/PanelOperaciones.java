package co.edu.unbosque.view;

import java.awt.*;
import javax.swing.*;

public class PanelOperaciones extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JButton convertir = new JButton("Convertir");
	public final String CONVERTIR = ("Convertir");
	public PanelOperaciones()
	{
		Cargar();
	}
	
	public void Cargar()
	{
		setLayout(new GridLayout(1, 1));
		convertir.setActionCommand(CONVERTIR);
		convertir.setFont(new Font("", Font.TRUETYPE_FONT, 20));
		convertir.setBackground(Color.CYAN);
		add(convertir);
	}

	public JButton getConvertir() {
		return convertir;
	}
}
