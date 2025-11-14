package ejerciciosOpcionales2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa la calificacion del estudiante(A, B, C, D , F )");
		String nota = sc.nextLine().toUpperCase();
		switch (nota) {
		case "A":
			System.out.println("Excelente");
			break;

		case "B":
			System.out.println("Bueno");
			break;

		case "C":
			System.out.println("Regular");
			break;

		case "D":
			System.out.println("Insuficiente");
			break;
		case "F":
			System.out.println("Reaprobado");
			break;
		default:
			System.out.println("Nota invalida");
		}
		sc.close();
	}

}
