package ejeciciosOpcionales;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingresa un número: ");
		int n = sc.nextInt();

		boolean esPar = (n % 2 == 0);
		boolean multiplo3 = (n % 3 == 0);

		if (esPar && multiplo3) {
			System.out.println("Es par y múltiplo de 3");
		} else if (!esPar && multiplo3) {
			System.out.println("Es impar y múltiplo de 3");
		} else if (esPar && !multiplo3) {
			System.out.println("No es múltiplo de 3 pero es par");
		} else {
			System.out.println("No es ni par ni múltiplo de 3");
		}

		sc.close();
	}

}
