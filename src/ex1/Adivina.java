package ex1;

import javax.swing.JOptionPane;

public class Adivina {

public static void start(int rand) {
		
		int n = 0; // numero introducido por el usuario
		int cont = 0; // contador de intentos
		boolean loop = true; // estado del juego
		
		do {

			
			
			// Comparamos los dos numeros
			if(Metodos.mayorMenor(n, rand)) {
				// entra aqui si se ha adivinado
				
				// notificamos al usuario
				JOptionPane.showMessageDialog(null, "Lo has adivinado con "+cont+" intentos.");
				
				// paramos el juego
				loop = false;
			}
			
			cont++;
		}while(loop);
		
	}

}
