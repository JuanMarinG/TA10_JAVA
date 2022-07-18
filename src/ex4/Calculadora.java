package ex4;

import javax.swing.JOptionPane;

public class Calculadora {
	public void start() {
		boolean loop = true;
		
		while(loop) {
			String operador = JOptionPane.showInputDialog("Operaciones:\nsuma, resta, mult, div, potencia,\nraiz3, raiz3\n\n\"exit\" para salir");
			switch (operador) {
				case "suma":
					suma();
					break;
				case "resta":
					resta();
					break;
				case "mult":
					mult();
					break;
				case "div":
					div();
					break;
				case "potencia":
					potencia();
					break;
				case "raiz2":
					raiz(2);
					break;
				case "raiz3":
					raiz(3);
					break;
				case "exit":
					loop = false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Operador invalido");
					break;
			}
		}
	}

	private void raiz(int i) {
		// TODO Auto-generated method stub
	}

	private void potencia() {
		// TODO Auto-generated method stub
	}

	private void resta() {
		// TODO Auto-generated method stub
	}

	private void suma() {
		// TODO Auto-generated method stub
	}

	private void div() {
		String n1,n2;
		do {
			n1 = JOptionPane.showInputDialog(null, "Introduce el primer numero");
		} while(!esNum(n1));
		do {
			n2 = JOptionPane.showInputDialog(null, "Introduce el segundo numero");
		} while(!esNum(n2));
		
		if(Double.parseDouble(n1)==0 || Double.parseDouble(n2)==0) {
			JOptionPane.showMessageDialog(null, "No se puede dividir por 0");
			return;
		}
		
		double resultado = Double.parseDouble(n1) / Double.parseDouble(n2);
		JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
	}

	private void mult() {
		String n1,n2;
		do {
			n1 = JOptionPane.showInputDialog(null, "Introduce el primer numero");
		} while(!esNum(n1));
		do {
			n2 = JOptionPane.showInputDialog(null, "Introduce el segundo numero");				
		} while(!esNum(n2));
		
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
