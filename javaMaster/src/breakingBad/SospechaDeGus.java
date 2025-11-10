package breakingBad;

import java.util.Random;

public class SospechaDeGus {

	public static void main(String[] args) {
		Random random = new Random();

		int buenas = 0;
		int malasSeguidas = 0;
		int total = 0;

		// Cocinar hasta conseguir 500 pastillas buenas
		for (; buenas < 500;) {
			total++;
			int calidad = random.nextInt(101); // calidad entre 0 y 100

			if (calidad >= 90) {
				buenas++;
				malasSeguidas = 0; // reinicia el contador de malas seguidas
			} else {
				malasSeguidas++;
			}

			// Si hay 50 malas seguidas, mostrar alerta
			if (malasSeguidas == 50) {
				System.out.println("🔥 Gus Fring sospecha del laboratorio...");
				malasSeguidas = 0; // reiniciar después de la advertencia
			}
		}

		System.out.println("\nPastillas buenas obtenidas: " + buenas);
		System.out.println("Total de pastillas fabricadas: " + total);

	}

}
