package ejerciciosOpcionales3;

import java.util.Scanner;

public class Ejercicio2Mejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese el primer número: ");
		int numero1 = sc.nextInt();

		int numero2;
		do {
			System.out.print("Ingrese el segundo número (no puede ser 0): ");
			numero2 = sc.nextInt();
			if (numero2 == 0) {
				System.out.println("Error: no se puede dividir entre cero. Intente de nuevo.");
			}
		} while (numero2 == 0);

		int cociente = numero1 / numero2;
		int resto = numero1 % numero2;

		if (resto == 0) {
			System.out.println("La división es exacta. Cociente: " + cociente);
		} else {
			System.out.println("La división no es exacta. Cociente: " + cociente + ", Resto: " + resto);
		}

		sc.close();
	}

}
