package javaMaster;

import java.util.Scanner;

public class Nombre {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Dime como te llamas:");

		String name = sc.nextLine();
		System.out.println("¡Hola, " + name + "!");

		System.out.print("En que ano estamos:");
		int ano = sc.nextInt();
		System.out.println("Estamos en el ano: " + ano);

		sc.nextLine();

		System.out.print("Que programacion te gusta mas: ");
		String java = sc.nextLine();
		System.out.println(java);

		System.out.println("¡Hola " + name + " en este ano " + ano + " maseras una gran programadora en " + java);
	}

}
