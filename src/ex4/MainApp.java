package ex4;

public class MainApp {

	public static void main(String[] args) {
		try {
			Calculadora calculadora = new Calculadora();
			calculadora.start();
		} catch (Exception e) {
			System.out.println("FIN PROGRAMA");
		}
		
	}

}
