package javaMaster;

import java.util.Scanner;

public class Nombre {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Dime como te llamas:");

		String name = sc.nextLine();

		System.out.println("¡Hola, " + name + "!");
	}

}
