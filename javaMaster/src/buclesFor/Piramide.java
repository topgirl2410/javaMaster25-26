package buclesFor;

import java.util.Scanner;

public class Piramide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int altura;

		// Pedir la altura de la piramide
		System.out.print("Introduce la altura de la piramide: ");
		altura = sc.nextInt();

		// Validar que sea un numero positivo
		if (altura <= 0) {
			System.out.println("La altura debe ser un numero positivo");
		} else {

			// Generar la piramide
			for (int i = 1; i <= altura; i++) {
				// Imprimir los asteriscos de la fila i
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		}
		sc.close();
	}
}
