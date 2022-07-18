package ex2;

import javax.swing.JOptionPane;

import excepcionCustom.ExcepcionCustomizada;

public class MainApp {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce c�digo error"));
		
		try {
			throw new ExcepcionCustomizada(n);
		} catch (ExcepcionCustomizada e) {
			System.out.println("Mensaje mostrado por pantalla."
					+ "\nExcepcion capturada con mensaje: " + e.getMessage()
					+ "\nPrograma terminado.");
		}

	}

}
