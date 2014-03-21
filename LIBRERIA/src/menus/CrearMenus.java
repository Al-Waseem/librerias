package menus;

import javax.swing.JOptionPane;
/**
 * Clase que contiene métodos para crear menús dentro de un cuadro de diálogo.
 * Los métodos de la clase comprueban que la opción elegida por el usuario es 
 * una opción correcta.
 * 
 * @author pilarg
 * @version 1.0 
 *
 */
public class CrearMenus {
	/**
	 * Este método crea un menú dentro de un cuadro de diálogo y devuelve un número entero
	 * que se corresponde con la opción del menú elegida por el usuario.
	 * Recibe valores para el mensaje que aparecerá en el cuadro de diálogo, el título que 
	 * aparecerá en el cuadro de diálogo y el número total de opciones que tendrá el menú.
	 * La opción de salida del menú debe coincidir siempre con el número más alto.
	 * 
	 * @param mensaje cadena de caracteres (String) con las opciones y la leyenda que debe figurar en 
	 * cada una de ellas.
	 * @param titulo cadena de caracteres (String) que se mostrará como título del cuadro de diálogo.
	 * @param opciones número total de opciones que tendrá el menú. Debe ser un número de tipo int y su
	 * valor debe coincidir con la opción Salir del menú.
	 * 
	 * @return devuelve un número entero (int) que es la opción válida elegida por el usuario.
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
	}// Fin del método crearMenu
}// Fin de la clase
