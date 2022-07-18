package ex1;


import javax.swing.JOptionPane;

public class Adivina {

public static void start(int rand) {
		
		int n = 0; // numero introducido por el usuario
		int cont = 0; // contador de intentos
		boolean loop = true; // estado del juego
		int max_intentos = 0;
		
		do {
			String numUser = JOptionPane.showInputDialog("Adivina el número");
			
			//validamos que sea un num
	        n = Metodos.validarRespuesta(numUser);	        
			
			// Miramos que no ha habido error y comparamos los dos numeros
			if(n!=0 && Metodos.compararNumRespuesta(n, rand)) {
				// entra aqui si se ha adivinado				
				// notificamos al usuario
				JOptionPane.showMessageDialog(null, "Lo has adivinado con "+cont+" intentos.");
				
				// paramos el juego
				loop = false;
			}
			
			cont++;
			max_intentos++;
		}while(loop&&max_intentos<5);
		
	}


}
