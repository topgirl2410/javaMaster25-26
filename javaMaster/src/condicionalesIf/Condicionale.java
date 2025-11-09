package condicionalesIf;

import java.util.Scanner;

public class Condicionale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int edad;

		System.out.println("Dime una edad entre 0 y 100");
		edad = sc.nextInt();

		if (edad >= 0 && edad < 18) {
			int falta = 18 - edad;
			System.out.println(
					"Tienes " + edad + " años y te faltan " + falta + " años para llegar a la mayoria de edad");
		} else if (edad >= 18 && edad <= 100) {
			int falta = 100 - edad;
			System.out.println("Tienes " + edad + " años y te faltan " + falta + " años para llegar al siglo");
		} else {
			System.out.println("La edad no es valida");
		}
	}

}
