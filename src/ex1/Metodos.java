package ex1;

public class Metodos {

	// Marcamos un maximo para que nos genere un numero aleatorio entre 0 y 500
	
	public static int generarNumeroAleatorio() {

		int num = (int) (Math.random() * 500 + 1);
		return num;
	}

	// Comparamos el valor introducido por el usuario. Si no es numerico, nos saltara un error.
	
	public static int validarRespuesta(String num) {
		
		int numUser=0;
		
		try {
			numUser = Integer.parseInt(num);}
		catch(Exception e) {
			System.out.println("El valor introducido debe ser un numero");
		}
		
		return numUser;
		
	}
	
	public static boolean compararNumRespuesta(int numUser,int numRndom) {
		boolean adivinado = false;
		if (numUser < numRndom) {
			System.out.println("El numero introducido es menor que el numero aleatorio ");
		} else if (numUser > numRndom) {
			System.out.println("El numero introducido es mayor que el numero aleatorio ");
		} else {
			adivinado = true;
		}
		
		return adivinado;
	}
}

