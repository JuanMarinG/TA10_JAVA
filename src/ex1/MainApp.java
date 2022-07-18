package ex1;

public class MainApp {

	public static void main(String[] args) {
		int rand = Metodos.generarNumeroAleatorio();

		Adivina.start(rand);
	}

}
