package matricesYFunciones;

import java.util.Scanner;

public class funcionesJava {
	public static int dameUnNumero(Scanner input) {
		System.out.println("Dame un numero");
		int numero = input.nextInt();
		return numero;
	}

	public static int suma(int n1, int n2) {
		int total = n1 + n2;
		return total;
	}

	public static void total(int total) {
		System.out.println("El total es: " + total);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = dameUnNumero(sc);
		int n2 = dameUnNumero(sc);

		int total = suma(n1, n2);
		
		total(total);
	}
}
