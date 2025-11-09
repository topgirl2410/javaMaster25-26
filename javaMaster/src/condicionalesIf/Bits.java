package condicionalesIf;

import java.util.Scanner;

public class Bits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Solicita al usuario el número de bits de la consola
		System.out.print("Introduce el numero de bits de la consola: ");
		int bits = sc.nextInt();

		// Determinar la generacíon de la consola usando una estructura if-else
		if (bits > 128) {
			System.out.println("Generacion: Novena generacíon (2020 - actualidad)");
		} else if (bits > 64) {
			System.out.println("Generacion: Octava generacíon (2012 - 2020)");
		} else if (bits > 32) {
			System.out.println("Generacion: Septima generacíon (2005 - 20112)");
		} else if (bits > 16) {
			System.out.println("Generacion: Sexta generacíon (1999 - 2005)");
		} else if(bits > 8) {
			System.out.println("Generacion: Quinta generacíon (1996 - 2001)");
		} else if(bits > 4) {
			System.out.println("Generacion: Cuarta generacíon (1987 - 1995)");
		}else if(bits > 2) {
			System.out.println("Generacion: Tercera generacíon (1983 - 1987)");
		}else if(bits > 1) {
			System.out.println("Generacion: Segunda generacíon (1976 - 1983)");
		} else {
			System.out.println("Generacion: Primera generacíon (1972 - 1978)");
		}
		
		sc.close();
	}
}
