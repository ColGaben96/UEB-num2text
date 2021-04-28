package co.edu.unbosque.view;

import javax.swing.*;

import co.edu.unbosque.controller.Controlador;

import java.awt.*;

public class InterfazGUI extends JFrame
{
	private static final long serialVersionUID = 1L;
	private PanelCentral central = new PanelCentral();
	private PanelOperaciones operaciones = new PanelOperaciones();
	
	public InterfazGUI(Controlador control)
	{
		Cargar();
		EscucharComponentes(control);
	}
	
	public void Cargar()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Numeros a Texto");
		setLayout(new BorderLayout());
		add(central, BorderLayout.CENTER);
		add(operaciones, BorderLayout.SOUTH);
		setSize(800,300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void EscucharComponentes(Controlador control)
	{
		operaciones.getConvertir().addActionListener(control);
	}

	public PanelCentral getCentral() {
		return central;
	}

	public PanelOperaciones getOperaciones() {
		return operaciones;
	}
	
	
}
