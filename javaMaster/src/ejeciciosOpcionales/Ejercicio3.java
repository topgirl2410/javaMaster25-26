package ejeciciosOpcionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su primer número: ");
		int a = sc.nextInt();
		
		System.out.println("Ingrese su segundo número: ");
		int b = sc.nextInt();
		
		System.out.println("Ingrese su tercer número: ");
		int c = sc.nextInt();
		
		int mayor = Math.max(a, Math.max(b, c));
		
		System.out.println("El número mayor es: " + mayor);
	}

}
