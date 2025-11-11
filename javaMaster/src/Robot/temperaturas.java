package Robot;

public class temperaturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temperatura = { 45, 49, 52, 57, 60, 59, 55, 48, 46, 50 };

		int i = 0;
		int suma = 0;
		int contadorAtlas = 0;
		boolean sobrecalentamiento = false;

		// Recorremos las temperaturas con while
		while (i < temperatura.length) {
			int temp = temperatura[i];
			suma += temp;

			// Contar cuantas superan los 55ºC
			if (temp > 55) {
				contadorAtlas++;
			}

			// Si alguna es 60 o mas, activar sobrecalentamiento
			if (temp >= 60) {
				sobrecalentamiento = true;
			}
			i++;
		}
		// Calcular temperatura media
		double media = (double) suma / temperatura.length;

		// Mostrar resultados
		System.out.println("Temperatura media: " + media + " ºC");
		System.out.println("Mediciones > 55ºC: " + contadorAtlas);

		if (sobrecalentamiento) {
			System.out.println("¡Sobrecalentamiento detectado!");
		} else {
			System.out.println("Sistema estable");
		}
	}

}
