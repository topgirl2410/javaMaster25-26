package Robot;

public class analizarServidores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] vulnerables = { false, true, false, false, true, false, true, false };
		int contador = 0;
		System.out.println("Servidores vulnerables en posiciones: ");
		for (int i = 0; i < vulnerables.length; i++) {
			if (vulnerables[i]) {
				contador++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\nTotal de servidores vulnerables: " + contador);
	}

}
