package ejerciciosOpcionales2;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char estado = 'm';

		switch (estado) {
		case 'I':
		case 'i':
			System.out.println("Uno");
			break;

		case 'V':
		case 'v':
			System.out.println("Cinco");
			break;

		case 'X':
		case 'x':
			System.out.println("Diez");
			break;

		case 'L':
		case 'l':
			System.out.println("Cincuenta");
			break;

		case 'C':
		case 'c':
			System.out.println("Cien");
			break;

		case 'D':
		case 'd':
			System.out.println("Quinientos");
			break;

		case 'M':
		case 'm':
			System.out.println("Mil");
			break;
		}
	}

}
