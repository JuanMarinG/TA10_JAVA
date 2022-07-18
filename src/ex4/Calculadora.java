package ex4;

import javax.swing.JOptionPane;

public class Calculadora {
	public void Operaciones() {

		String operador = JOptionPane.showInputDialog("Operacion:");
		switch (operador) {
			case "+":
				break;
			case "-":
				break;
			case "*":
				break;
			case "/":
				break;
			case "^2":
				break;
			case "^3":
				break;
			default:
				System.out.println("Operador invalido");
				break;
		}
	}
}
