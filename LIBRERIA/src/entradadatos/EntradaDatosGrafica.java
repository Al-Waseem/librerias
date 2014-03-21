package entradadatos;

import javax.swing.JOptionPane;
/**
 * Clase que contiene métodos para pedir numeros enteros dentro de un cuadro de diálogo.
 * Los métodos devuelve el valor del entero despues de convertir el valor de la cadena 
 * que se habia entrado por el usuario
 * 
 * 
 * @author Waseem ALKHALEL
 * @version 1.0 
 *
 */
public class EntradaDatosGrafica {
	
	/**
	 * 
	 * @param mensaje que sale en el InputBox para comunicar con el usuario y pedir un entero
	 * @return numero de tipo Integer
	 */
	public static int pedirEntero(String mensaje){
		String cadena;
		int numero;
		
		cadena = JOptionPane.showInputDialog(mensaje);
		numero = Integer.parseInt(cadena);
		return numero;
		
	}
	
	/**
	 * 
	 * @param mensaje que sale en el InputBox para comunicar con el usuario y pedir un float
	 * @return numero de tipo Float
	 */
	public static float pedirFloat(String mensaje){
		String cadena;
		float numero;
		
		cadena = JOptionPane.showInputDialog(mensaje);
		numero = Float.parseFloat(cadena);
		return numero;
		
	}
	
	
	/**
	 * 
	 * @param mensaje que sale en el InputBox para comunicar con el usuario y pedir un Double
	 * @return numero de tipo Double
	 */
	public static double pedirDouble(String mensaje){
		String cadena;
		double numero;
		
		cadena = JOptionPane.showInputDialog(mensaje);
		numero = Double.parseDouble(cadena);
		return numero;
		
	}
	
	public static String pedirCadena(String mensaje){
		
		String cadena = JOptionPane.showInputDialog(null, mensaje);
		return cadena;
	}
	
	

}
