package windows;

import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static void centrar(JFrame ventana){
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = ventana.getSize();
		
		if(frameSize.height > screenSize.height){
			frameSize.height = screenSize.height;
		}
		
		if(frameSize.width > screenSize.width){
			frameSize.width = screenSize.width;
		}
		
		ventana.setLocation((screenSize.width - frameSize.width)/2 ,
				(screenSize.height - frameSize.height)/2);
	}
	
}
