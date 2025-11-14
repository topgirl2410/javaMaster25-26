package ejeciciosOpcionales;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Datos del empleado
		System.out.print("Ingrese el sueldo actual: ");
		double sueldo = sc.nextDouble();

		System.out.print("¿Es mujer? (s/n): ");
		char mujer = sc.next().toLowerCase().charAt(0);

		System.out.print("Ingrese el número de hijos: ");
		int hijos = sc.nextInt();

		double porcentaje = 0;

		// Aumento de sueldo
		if (sueldo < 15000) {
			porcentaje += 15;

		} else {
			porcentaje += 12;
		}

		// Aumento adicional por ser mujer
		if (mujer == 's') {
			porcentaje += 2;
		}

		// Aumento por hijos
		if (hijos > 0) {
			porcentaje += hijos * 1; // 1% por hijo

		}

		// Calcular nuevo sueldo
		double aumento = sueldo * porcentaje / 100;
		double nuevoSueldo = sueldo + aumento;

		// Mostrar resultados
		System.out.println("-----------------------------------------");
		System.out.println("Porcentaje total de aumento: " + porcentaje + "%");
		System.out.println("Monto del aumento: " + aumento);
		System.out.println("Nuevo sueldo: " + nuevoSueldo);

		sc.close();
	}

}
