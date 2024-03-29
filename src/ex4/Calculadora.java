package ex4;

import javax.swing.JOptionPane;

public class Calculadora {
	public void start() {
		while (true) {
			String operador = (String) JOptionPane.showInputDialog(null,
		        "Operacion:", 
		        "Operacion",
		        JOptionPane.PLAIN_MESSAGE,
		        null,
		        new String[]{"Suma", "Resta", "Multiplicacion", "Division", "Potencia", "Raiz2", "Raiz3", "EXIT"}, null);
			
			String n1, n2 = "";
			operador = operador.toLowerCase();
			if (operador.equals("exit")) {
				System.exit(0);				
			}
			
			do {
				n1 = JOptionPane.showInputDialog(null, "Introduce el primer numero");
			} while (!esNum(n1));

			if (operador.equals("suma") || operador.equals("resta") || operador.equals("multiplicacion")
					|| operador.equals("division")) {
				do {
					n2 = JOptionPane.showInputDialog(null, "Introduce el segundo numero");
				} while (!esNum(n2));
			}

			switch (operador) {
			case "suma":
				suma(n1, n2);
				break;
			case "resta":
				resta(n1, n2);
				break;
			case "multiplicacion":
				mult(n1, n2);
				break;
			case "division":
				div(n1, n2);
				break;
			case "potencia":
				potencia(n1);
				break;
			case "raiz2":
				raiz(2, n1);
				break;
			case "raiz3":
				raiz(3, n1);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Operador invalido");
			}
		}
	}

	private void raiz(int i, String n1) {
		double resultado = Math.pow(Integer.parseInt(n1), (double) 1 / i);
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
	}

	private void potencia(String n1) {
		String n2;
		do {
			n2 = JOptionPane.showInputDialog(null, "Introduce el exponente");
		} while (!esNum(n2));

		double resultado = Math.pow(Double.parseDouble(n1), Double.parseDouble(n2));
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
	}

	private void resta(String n1, String n2) {
		double resultado = Double.parseDouble(n1) - Double.parseDouble(n2);
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
	}

	private void suma(String n1, String n2) {
		double resultado = Double.parseDouble(n1) + Double.parseDouble(n2);
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
	   
	}

	private void div(String n1, String n2) {
		try {
			if (Double.parseDouble(n1) == 0 || Double.parseDouble(n2) == 0) { 
				// Se tiene que forzar la excepcion poerque con doubles no detecta el 0
				throw new ArithmeticException();
			}
	
			double resultado = Double.parseDouble(n1) / Double.parseDouble(n2);
			JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
		}catch (ArithmeticException  e) {
			JOptionPane.showMessageDialog(null, "No se puede dividir por 0");
		}
	}

	private void mult(String n1, String n2) {

		double resultado = Double.parseDouble(n1) * Double.parseDouble(n2);
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
	}

	public boolean esNum(String n) {
		try {
			Double.parseDouble(n);
			return true;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Por favor, introduce un numero valido.");
			return false;
		}
	}
}
