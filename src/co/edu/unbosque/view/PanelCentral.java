package co.edu.unbosque.view;

import java.awt.*;
import javax.swing.*;

public class PanelCentral extends JPanel
{
	private static final long serialVersionUID = 1L;
	private PanelConversor conversor = new PanelConversor();
	private PanelLables labels = new PanelLables();
	
	public PanelCentral()
	{
		Cargar();
	}
	
	public void Cargar()
	{
		setLayout(new BorderLayout());
		add(conversor, BorderLayout.CENTER);
		add(labels, BorderLayout.NORTH);
	}

	public PanelConversor getConversor() {
		return conversor;
	}
	
	
}
