package ex1;


import javax.swing.JOptionPane;

public class Adivina {

public static void start(int rand) {
		
		int n = 0; // numero introducido por el usuario
		int cont = 0; // contador de intentos
		boolean loop = true; // estado del juego
		
		try {
			do {
				String numUser = JOptionPane.showInputDialog("Adivina el numero");
				
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
			}while(loop);
			
		}catch(NumberFormatException ex) {
			System.out.println("El valor introducido debe ser un numero. Has hecho "+cont+" intentos");
			System.out.println(ex);
		}
		
	}


}
