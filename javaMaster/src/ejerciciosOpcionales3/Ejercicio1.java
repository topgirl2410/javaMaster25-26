package ejerciciosOpcionales3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("PAR E IMPAR (1)");

		// Pedir número par
		System.out.print("Escriba un número par: ");
		int numeroPar = sc.nextInt();

		// Pedir número impar
		System.out.print("Escriba un número impar: ");
		int numeroImpar = sc.nextInt();

		// Verificar condiciones
		if (numeroPar % 2 == 0 && numeroImpar % 2 != 0) {
			System.out.println("¡Gracias por su colaboración!");
		} else {
			System.out.println("Uno o más de los valores que ha escrito no son correctos.");
			System.out.println("Ejecute de nuevo el programa para volver a intentarlo.");
		}

		sc.close();
	}

}
