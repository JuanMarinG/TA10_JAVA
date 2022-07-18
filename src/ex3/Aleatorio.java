package ex3;

import java.io.IOException;

public class Aleatorio {

	public void start() {

		int random = 0;

		try {

			if (random % 2 == 0) {
				 throw new Exception("ES PAR");
            }else{
            	throw new Exception("ES IMPAR");
			}
		} catch (Exception e) {

			System.out.printf(e.getMessage());
		}
	}

}
