package ex5;

public class Password {

	// ATRIBUTS

	// CONSTRUCTORS

	// GETTERS SETTERS

	// METODE public String generarPassword(int longitud){}

	// METODE public boolean esFuerte(String passwd){}
	public boolean esFuerte(String passwd) {
		boolean forta = false;
		// Comptador numeros, minuscules i majuscules
		int nums=0, minus=0, majus=0;
		// Diccionaris
		String dicMinus = "abcdefghijklmnopqrstuvwxyz";
		String dicMajus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		// Comptar numeros, minuscules i majuscules
		for (int i=0; i<passwd.length(); i++) {
			try {
				char c = passwd.charAt(i);
				int compNum = Integer.parseInt(String.valueOf(c));
				// Si peta a la linia anterior, no es un numero i no sumara res
				nums++;
			} catch (NumberFormatException e) {}
			
			if ((passwd.charAt(i) < 91) && (passwd.charAt(i) > 64)) {
				majus++;
			} else if ((passwd.charAt(i) < 123) && (passwd.charAt(i) > 96)) {
				minus++;
			}
		}

		// Comprovar que es una contrasenya forta
		if ((majus > 2) && (minus > 1) && (nums > 5)) {
			forta = true;
		}

		return forta;
	}

}
