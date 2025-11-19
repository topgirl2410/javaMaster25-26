package buclesFor;

import java.util.Scanner;

public class CajaRegistradora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double total = 0;
		double cantidad = -1;

		System.out.println("=== Simulacíon de Caja Registradora ===");


		for (; cantidad != 0;) {
			System.out.println("Introduce el precio del producto (0 para finalizar)");
			cantidad = sc.nextDouble();

			if (cantidad != 0) {
				total += cantidad;
				System.out.println("Subtotal actual: $" + total);
			}
		}
		System.out.println("-----------------------------------");
		System.out.println("Total de la compra: $" + total);

		if (total > 0) {
			System.out.println("¿Con cuanto dinero paga el cliente?: ");
			double pago = sc.nextDouble();

			if (pago >= total) {
				double cambio = pago - total;
				System.out.println("Cambio a devolver: $" + cambio);
			} else {
				System.out.println("El pago no es suficiente. Faltan $" + (total - pago));
			}
		}

		System.out.println("Gracias por su compra. ¡Vuelva pronto!");
		sc.close();
	}
}
