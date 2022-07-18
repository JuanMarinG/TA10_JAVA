package ex1;

public class Metodos {

	public static int generarNumeroAleatorio() {

		int num = (int) (Math.random() * 500 + 1);
		return num;
	}

	public static int validarRespuesta(String num) {
		
		int numUser=0;
		
		try {
		numUser = Integer.parseInt(num);}
		catch(Exception e) {
			System.out.println("El valor introducido debe ser un numero");
		}
		
		return numUser;
		
	}
	
	public static boolean compararNumRespuesta(int numUser, int numRndom) {
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

