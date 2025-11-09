package buclesFor;

public class CuentaAtras {

	public static void main(String[] args) {
		// Cuenta atrás desde 100 hasta 0 restando 10 en cada paso
		for (int i = 100; i >= 0; i -= 10) {
			System.out.println(i);
		}
		// Mensaje final cuando llega a 0
		System.out.println("Maquina hackeada");
	}

}
