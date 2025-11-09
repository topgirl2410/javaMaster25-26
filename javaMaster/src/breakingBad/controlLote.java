package breakingBad;

import java.util.Random;

public class controlLote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int totalLotes = 10;
		int pastillasPorLotes = 100;

		// Bucles para recorrer los 10 lotes
		for (int lote = 1; lote <= totalLotes; lote++) {
			int buenas = 0;

			// Bucle para fabricar las 100 pastillas de cada lote
			for (int i = 1; i <= pastillasPorLotes; i++) {
				int calidad = random.nextInt(101);
				if (calidad >= 90) {
					buenas++;
				}
			}
			System.out.println("Lote " + lote + ": " + buenas + " pastillas buenas de " + pastillasPorLotes);
		}
		System.out.println("\nProduccion completada.");
	}

}
