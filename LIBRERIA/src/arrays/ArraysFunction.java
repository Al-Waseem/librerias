package arrays;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ArraysFunction {
	
	/**
	 * Un metodo para mostrar una matriz de numeros enteros en un JTextArea
	 * @param matriz es la matriz que pasa en el metodo para mostrarla
	 */
	public void mostrarArray(int matriz [] ){
		
		//una variable de texto para guardar la cadena de los valores que 
		//se mostraran en el JTextArea
		String arr="";
		
		//bucle para escribir la cadena de los valores de la matriz
		for (int i=0;i<matriz.length;i++){
			arr += "El numero["+i+"]="+ matriz[i] +"\n";
		}
		
		// crear un JTextArea para mostrar la matriz
		JTextArea ta = new JTextArea(arr);
		//ta.append(arr); // lo utilizamos si no pasamos el texto al constructor
		ta.setEditable(false);
		JOptionPane.showMessageDialog(null, ta);
	}
	
	public void eliminarElementoDeArray(String [] datos, int elemento){
		
		for(int i=0;i<datos.length;i++){
			
		}
	}

}
