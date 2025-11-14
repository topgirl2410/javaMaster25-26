package ejerciciosOpcionales2;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 274;

		switch (num % 2) {
		case 0:
			System.out.println("Divisible por 2");
			break;

		default:
			System.out.println("No divisible por 2");
			break;
		}

		switch (num % 3) {
		case 0:
			System.out.println("Divisible por 3");
			break;

		default:
			System.out.println("No divisible por 3");
			break;
		}

		switch (num % 5) {
		case 0:
			System.out.println("Divisible por 5");
			break;

		default:
			System.out.println("No divisible por 5");
			break;
		}

		switch (num % 7) {
		case 0:
			System.out.println("Divisible por 7");
			break;

		default:
			System.out.println("No divisible por 7");
			break;
		}
	}

}
