package ex3;

import java.util.Random;

public class Aleatorio {

	public void start() {

		int min = 0;
		int max = 999;

		Random newRandom = new Random();
		int random = newRandom.nextInt(max) + min;

		try {

			if (random % 2 == 0) {
				throw new Exception("ES PAR");
			} else {
				throw new Exception("ES IMPAR");
			}
		} catch (Exception e) {

			System.out.printf(e.getMessage());
		}

	}

}
