package breakingBad;

import java.util.Random;

public class recetaPerfecta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		int intentos = 0;

		// Bucle for sin condicion de fin explicita (se interrumpe con break)
		for (;;) {
			intentos++;
			int calidad = random.nextInt(101); // Genera número aleatorio de 0 a 100
			System.out.println("Intento " + intentos + " calidad: " + calidad);

			if (calidad == 100) {
				System.out.println("\n¡Pastilla perfecta conseguida!");
				System.out.println("Intentos necesarios: " + intentos);
				break; // Sale del bucle
			}
		}
	}

}
