package breakingBad;

import java.util.Random;

public class PromedioCalidad {

	public static void main(String[] args) {
		Random random = new Random();
		int totalPastillas = 1000;
		int sumaCalidades = 0;

		// Generar calidades aleatorias y acumular su valor
		for (int i = 1; i <= totalPastillas; i++) {
			int calidad = random.nextInt();
			sumaCalidades += calidad;
		}

		// Calcular el promedio (como double para obtener decimales)
		double promedio = (double) sumaCalidades / totalPastillas;

		System.out.println("Número total de pastillas: " + totalPastillas);
		System.out.println("Suma total de calidades: " + sumaCalidades);
		System.out.println("Promedio de calidad: " + promedio);

	}

}
