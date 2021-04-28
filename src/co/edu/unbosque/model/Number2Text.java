package co.edu.unbosque.model;

/**
* @author Gabriel Blanco
*
*/
public class Number2Text 
{	
	/**
	 * @author Gabriel Blanco
	 * Método para traducir de número entero a texto.
	 * CHANGELOG: V1.0
	 * @author Gabriel Blanco
	 * Se crea el método para cumplir con el requerimiento para traducir números entre 0 y 99.
	 * @param decena
	 * @param unidad
	 * @return
	 */
	public String ToText(int decena, int unidad)
	{
		String[] text = new String[2];
		/*
		 * text[0] = Unidades; text[1] = Decenas
		 */
		String ans = ""; //ans va a ser text[1] "y" text[0], según sea el caso.
			
		/*
		 * Configuración Decenas
		 */
		
		switch(decena)
		{
			default:
				text[1] = "";
				break;
			case 2:
				text[1] = "veinti";
				break;
			case 3:
				text[1] = "treinta";
				break;
			case 4:
				text[1] = "cuarenta";
				break;
			case 5:
				text[1] = "cincuenta";
				break;
			case 6:
				text[1] = "sesenta";
				break;
			case 7:
				text[1] = "setenta";
				break;
			case 8:
				text[1] = "ochenta";
				break;
			case 9:
				text[1] = "noventa";
				break;
		}
		
		/*
		 * Configuración Unidades
		 */
		switch(unidad)
		{
			default:
				text[0] = "";
				break;
			case 1:
				text[0] = "uno";
				break;
			case 2:
				text[0] = "dos";
				break;
			case 3:
				text[0] = "tres";
				break;
			case 4:
				text[0] = "cuatro";
				break;
			case 5:
				text[0] = "cinco";
				break;
			case 6:
				text[0] = "seis";
				break;
			case 7:
				text[0] = "siete";
				break;
			case 8:
				text[0] = "ocho";
				break;
			case 9:
				text[0] = "nueve";
				break;
		}
		
		/*
		 * Casos Especiales. Estos casos son números especificos, como el 11, el 15, o el 20, que no entran en la configuración
		 * porque se escriben diferente en el idioma español. En caso de tener la necesitad de añadir mas cifras significativas
		 * Crear parámetro Centenas; Mil; etc y ampliar el espacio del arreglo de text.
		 */
		if(decena == 0 && unidad == 0) {
			text[0] = "cero"; ans = text[0];
		}
		else if(decena == 1 && unidad == 0) {
			text[0] = "diez"; ans = text[0];
		}
		else if(decena == 1 && unidad == 1) {
			text[0] = "once"; ans = text[0];
		}
		else if(decena == 1 && unidad == 2) {
			text[0] = "doce"; ans = text[0];
		}
		else if(decena == 1 && unidad == 3) {
			text[0] = "trece"; ans = text[0];
		}
		else if(decena == 1 && unidad == 4) {
			text[0] = "catorce"; ans = text[0];
		}
		else if(decena == 1 && unidad == 5) {
			text[0] = "quince"; ans = text[0];
		}
		else if(decena == 1 && unidad == 6) {
			text[0] = "dieciseis"; ans = text[0];
		}
		else if(decena == 1 && unidad == 7) {
			text[0] = "diecisiete"; ans = text[0];
		}
		else if(decena == 1 && unidad == 8) {
			text[0] = "dieciocho"; ans = text[0];
		}
		else if(decena == 1 && unidad == 9) {
			text[0] = "diecinueve"; ans = text[0];
		}
		else if(decena == 2 && unidad == 0) {
			text[0] = "veinte"; ans = text[0];
		}
		else if(decena == 2 && unidad > 0)	{
			ans = text[1]+text[0];
		}
		else if(decena == 0 && unidad > 0)	{
			ans = text[0];
		}
		if(decena > 2 && unidad > 0) {
			ans = text[1]+" y "+text[0];
		}
		else if(decena > 2 && unidad == 0) {
			ans = text[1];
		}
		return ans;
	}
}
