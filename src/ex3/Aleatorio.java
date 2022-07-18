package ex3;

import java.util.Random;

public class Aleatorio {

	public void start() {

		System.out.println("Generando numero aleatorio...");
		Random newRandom = new Random();
		int random = newRandom.nextInt(999);

		try {
			if (random % 2 == 0) {
				throw new Exception("Es par");
			} else {
				throw new Exception("Es impar");
			}
		} catch (Exception e) {
			System.out.printf("El numero aleatorio generado es: "+random+"\n"+e.getMessage());
		}

	}

}
