package breakingBad;

import java.util.Random;

public class Recuento_del_lote {

	public static void main(String[] args) {
		Random random = new Random();
		int totalPastillas = 1000;
		int buenas = 0;

		// Bucle simular 1000 pastillas
		for (int i = 1; i <= totalPastillas; i++) {
			int calidad = random.nextInt(101); // Genera numero de 0 a 100

			if (calidad >= 90) {
				buenas++; // Contar pastillas con calidad >=90
			}
		}
		System.out.println("Pastillas totales: " + totalPastillas);
		System.out.println("Pastillas aceptadas (>=90)" + buenas);
		System.out.println("Pastillas rechazadas: " + (totalPastillas - buenas));
	}

}
