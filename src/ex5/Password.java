package ex5;

public class Password {

	// ATRIBUTS
	private int longitud = 0;
	private String pass;

	// CONSTRUCTORS
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.pass = generarPassword(longitud);
	}

	public Password() {
		this.longitud = 8;
	}

	// GETTERS SETTERS

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPass() {
		return pass;
	}

	// Metodo generarPasswd
	public String generarPassword(int longitud) {
		String dic = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "0123456789";
		String pswd = "";

		for (int i = 0; i < longitud; i++) {
			pswd += (dic.charAt((int) (Math.random() * dic.length())));
		}
		return pswd;
	}

	// METODE public boolean esFuerte(String passwd){}
	public boolean esFuerte(String passwd) {
		boolean forta = false;
		// Comptador numeros, minuscules i majuscules
		int nums = 0, minus = 0, majus = 0;
		// Comptar numeros, minuscules i majuscules
		for (int i = 0; i < passwd.length(); i++) {
			try {
				char c = passwd.charAt(i);
				int compNum = Integer.parseInt(String.valueOf(c));
				// Si peta a la linia anterior, no es un numero i no sumara res
				nums++;
			} catch (NumberFormatException e) {
			}

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
