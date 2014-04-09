package menus;

import javax.swing.JOptionPane;
/**
 * Clase que contiene m�todos para crear men�s dentro de un cuadro de di�logo.
 * Los m�todos de la clase comprueban que la opci�n elegida por el usuario es 
 * una opci�n correcta.
 * 
 * @author pilarg
 * @version 1.0 
 *
 */
public class CrearMenus {
	/**
	 * Este m�todo crea un men� dentro de un cuadro de di�logo y devuelve un n�mero entero
	 * que se corresponde con la opci�n del men� elegida por el usuario.
	 * Recibe valores para el mensaje que aparecer� en el cuadro de di�logo, el t�tulo que 
	 * aparecer� en el cuadro de di�logo y el n�mero total de opciones que tendr� el men�.
	 * La opci�n de salida del men� debe coincidir siempre con el n�mero m�s alto.
	 * 
	 * @param mensaje cadena de caracteres (String) con las opciones y la leyenda que debe figurar en 
	 * cada una de ellas.
	 * @param titulo cadena de caracteres (String) que se mostrar� como t�tulo del cuadro de di�logo.
	 * @param opciones n�mero total de opciones que tendr� el men�. Debe ser un n�mero de tipo int y su
	 * valor debe coincidir con la opci�n Salir del men�.
	 * 
	 * @return devuelve un n�mero entero (int) que es la opci�n v�lida elegida por el usuario.
	 */
	public static int crearMenu(String mensaje, String titulo, int opciones) {
		int opcion = 0;
		do {
			String caracterOpcion = JOptionPane.showInputDialog(null, mensaje, titulo,
					JOptionPane.PLAIN_MESSAGE);
			try{
			opcion=Integer.parseInt(caracterOpcion);
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Elige una de las opciones indicadas.");
			}
		} while (opcion<1 || opcion >opciones);
		return opcion;
	}// Fin del m�todo crearMenu
}// Fin de la clase
