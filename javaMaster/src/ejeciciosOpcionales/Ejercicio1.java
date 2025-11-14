package ejeciciosOpcionales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese un número: ");
		int n = sc.nextInt();

		System.out.println("El número es: " + ((n % 2 == 0) ? "Par" : "Impar")); // Operador Ternario 

	}

}
