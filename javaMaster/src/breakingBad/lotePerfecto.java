package breakingBad;

import java.util.Random;

public class lotePerfecto {
	public static void main(String[] args) {
		Random random = new Random();
		int buenas = 0;
		int total = 0;

		// Cocinar hasta conseguir 1000 pastillas buenas
		for (; buenas < 1000;) {
			int calidad = random.nextInt(101);
			total++;

			if (calidad >= 90) {
				buenas++;
			}
		}
		System.out.println("Pastillas buenas conseguidas: " + buenas);
		System.out.println("Total de pastillas fabricadas: " + total);
		System.out.println("Pastillas malas: " + (total - buenas));
	}
}
