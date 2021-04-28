package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Mundo;
import co.edu.unbosque.view.Interfaz;
import co.edu.unbosque.view.InterfazGUI;

/**
 * @author Gabriel Blanco
 * Clase para ejecutar el controlador
 */
public class Controlador implements ActionListener
{
	private Mundo mundo = new Mundo();
	private Interfaz gui = new Interfaz();
	private InterfazGUI frame;
	
	/**
	 * Método constructor donde indica que método ejecutar.
	 */
	public Controlador()
	{
		Consola();
	}
	
	/**
	 * Modo Debugger
	 */
	public void Consola()
	{
		boolean activo = true;
		while(activo == true)
		{
			try 
			{
				int opcion = Integer.parseInt(gui.input(System.in, "Insert Title Here", gui.ayuda(), JOptionPane.PLAIN_MESSAGE));
				switch(opcion)
				{
					default:
						gui.output("Opcion Invalida", "La opcion que se acaba de marcar, es inválida", JOptionPane.ERROR_MESSAGE);
						break;
					case 0:
						activo = false;
						break;
					case 1:
						Number2TextTest();
						break;
					case 2:
						activo = false;
						iniciarGUI();
						break;
				}
			} 
			catch (Exception e) 
			{
				String errorStack = String.valueOf(e.fillInStackTrace());
				gui.output("Ha ocurrido un error inesperado", errorStack, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	/**
	 * Método para iniciar la GUI. Este es utilizado para lanzar versiones.
	 * @throws Exception
	 */
	public void iniciarGUI() throws Exception
	{
		frame = new InterfazGUI(this);
	}
	
	/**
	 * Método para probar las decenas y unidades en consola.
	 * @throws Exception
	 */
	public void Number2TextTest() throws Exception
	{
		int writtenNum = Integer.parseInt(gui.input(System.in, "Convertir de Números a Texto", "Ingresa un número entero de 0 a 99", JOptionPane.PLAIN_MESSAGE));
		if(writtenNum >= 0 && writtenNum <= 99)
		{
			if(writtenNum <= 9)
			{
				gui.output("Operacion Finalizada", mundo.getConversor().ToText(0, writtenNum), JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				String nums = String.valueOf(writtenNum);
				String[] digits = nums.split("");
				int decena = Integer.parseInt(digits[0]);
				int unidad = Integer.parseInt(digits[1]);
				gui.output("Operacion Finalizada", mundo.getConversor().ToText(decena, unidad), JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else
		{
			gui.output("Error", "El número debe ser un entero y debe estar en el rango de 0 y 99", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 *Método actionPerformed, auto-generado por ActionListener.
	 */
	@Override
	public void actionPerformed(ActionEvent action)
	{
		try 
		{
			if(action.getActionCommand() == frame.getOperaciones().CONVERTIR)
			{
				/*
				 * Como el sistema va a obtener números, en caso de error debe mostrar al usuario un InputMismatchException
				 * en un JOptionPane.
				 */
				int writtenNum = Integer.parseInt(frame.getCentral().getConversor().getNumeros().getText());
				/*
				 * Se especifica writtenNum para que sea válido solamente entre el rango de 0 a 99.
				 */
				if(writtenNum >= 0 && writtenNum <= 99)
				{
					/*
					 * En caso tal de que el número sea <= 9, solo se usarán unidades. Luego, los números de una sola
					 * cifra generalmente suelen ser unidades.
					 */
					if(writtenNum <= 9)
					{
						frame.getCentral().getConversor().getTexto().setText(mundo.getConversor().ToText(0, writtenNum));
					}
					else
					{
						/*
						 * Se utiliza nums y luego un arreglo digits para separar de writtenNum las decenas y unidades.
						 */
						String nums = String.valueOf(writtenNum);
						String[] digits = nums.split("");
						int decena = Integer.parseInt(digits[0]);
						int unidad = Integer.parseInt(digits[1]);
						frame.getCentral().getConversor().getTexto().setText(mundo.getConversor().ToText(decena, unidad));
					}
					
				}
				else
				{
					gui.output("Error", "El número debe ser un entero y debe estar en el rango de 0 y 99", JOptionPane.ERROR_MESSAGE);
				}
			}
		} 
		catch (Exception e) 
		{
			String errorStack = String.valueOf(e.fillInStackTrace());
			gui.output("Ha ocurrido un error inesperado", errorStack, JOptionPane.ERROR_MESSAGE);
		}
		
	}
}

