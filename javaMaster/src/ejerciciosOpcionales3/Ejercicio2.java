package ejerciciosOpcionales3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el primer número: ");
		int numero1 = sc.nextInt();

		System.out.println("Ingrese el segundo número: ");
		int numero2 = sc.nextInt();

		// Verificar división por cero
		if (numero2 == 0) {
			System.out.println("No se puede dividir entre cero.");
		} else {
			int cociente = numero1 / numero2;
			int resto = numero1 % numero2;

			if (resto == 0) {
				System.out.println("La división es exacta. Cociente: " + cociente);
			} else {
				System.out.println("La división no es exacta. Cociente: " + cociente + ", Resto: " + resto);
			}
		}

		sc.close();
	}

}
