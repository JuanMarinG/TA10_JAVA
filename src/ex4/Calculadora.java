package ex4;

import javax.swing.JOptionPane;

public class Calculadora {
	public void start() {
		boolean loop = true;
		try {
			while(loop) {
				try {
					String operador = JOptionPane.showInputDialog("Operaciones:\nsuma, resta, mult, div, potencia,\nraiz2, raiz3\n\n\"exit\" para salir");
					String n1, n2 = "";

					if(operador.equals("exit"))
						throw new NullPointerException();

						if((!operador.equals("suma") || operador.equals("resta") || operador.equals("mult") || operador.equals("div") || operador.equals("potencia")
								|| operador.equals("raiz2") || operador.equals("raiz3")))
							throw new ArithmeticException();

					do {
						n1 = JOptionPane.showInputDialog(null, "Introduce el primer numero");
					} while(!esNum(n1));

					if(operador.equals("suma") || operador.equals("resta") || operador.equals("mult") || operador.equals("div")) {
						do{
							n2 = JOptionPane.showInputDialog(null, "Introduce el segundo numero");
						}while(!esNum(n2));
					}			

					switch (operador) {
					case "suma":
						suma(n1,n2);
						break;
					case "resta":
						resta(n1,n2);
						break;
					case "mult":
						mult(n1,n2);
						break;
					case "div":
						div(n1,n2);
						break;
					case "potencia":
						potencia(n1);
						break;
					case "raiz2":
						raiz(2,n1);
						break;
					case "raiz3":
						raiz(3,n1);
						break;
					case "exit":
						loop = false;
						break;
					default:
						JOptionPane.showMessageDialog(null, "Operador invalido");
						break;
					}
				}catch (ArithmeticException e) {
					JOptionPane.showMessageDialog(null, "Operador invalido");
				}
			}
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Adeu!");
		}
	}

	private void raiz(int i,String n1) {		
		double resultado = Math.pow(Integer.parseInt(n1),(double)1/2);
		JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
	}

	private void potencia(String n1) {
		String n2;
		do{
			n2 = JOptionPane.showInputDialog(null, "Introduce el exponente");
		}while(!esNum(n2));

		double resultado = Math.pow(Double.parseDouble(n1), Double.parseDouble(n2));
		JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
	}

	private void resta(String n1, String n2) {
		// TODO Auto-generated method stub
	}

	private void suma(String n1, String n2) {
		// TODO Auto-generated method stub
	}

	private void div(String n1, String n2) {		

		if(Double.parseDouble(n1)==0 || Double.parseDouble(n2)==0) {  // hay una exception en la API de java que controla div por 0.
			JOptionPane.showMessageDialog(null, "No se puede dividir por 0");
			return;
		}

		double resultado = Double.parseDouble(n1) / Double.parseDouble(n2);
		JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
	}

	private void mult(String n1, String n2) {		

		double resultado = Double.parseDouble(n1) * Double.parseDouble(n2);
		JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
	}

	public boolean esNum(String n){
		try{  
			Double.parseDouble(n);  
			return true;
		} 
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Por favor, introduce un numero valido.");
			return false;
		}
	}
}
