package Robot;

public class hack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intentos = { 82, 13, 45, 79, 90, 5, 33, 72, 18, 65, 40, 100, 29, 10, 67, 55, 88, 60, 14, 3 };

		int max = intentos[0];
		int min = intentos[0];
		int exitosos = 0;
		boolean todosMenoresDe30 = true;

		for (int intento : intentos) {
			// Maximo y minimo
			if (intento > max)
				max = intento;
			if (intento < min)
				min = intento;

			// Contar los exitosos (> 70)
			if (intento > 70)
				exitosos++;

			// Verificar si todos son menores de 30
			if (intento >= 30) {
				todosMenoresDe30 = false;
			}
		}
		System.out.println("Valor maximo: " + max);
		System.out.println("Valor minimo: " + min);
		System.out.println("Intentos exitosos (>70): " + exitosos);

		if (todosMenoresDe30) {
			System.out.println("Mr Robot sospecha que estas desconectado");
		}
	}

}
