package ex5;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantas contraseñas quieres crear?");
		int numPasswds = sc.nextInt();
		sc.nextLine();		
		
		Password passwords[] = new Password[numPasswds];
		boolean esFuerte[] = new boolean[numPasswds];
		
		System.out.println("Longitud de las contraseñas?");
		int longitudPass = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<passwords.length;i++) {
			passwords[i] = new Password(longitudPass);
			esFuerte[i] = passwords[i].esFuerte();
			System.out.println(passwords[i].getPass()+" "+esFuerte[i]);
		}
				
	}

}
