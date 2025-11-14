package ejeciciosOpcionales;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float c = 1000F;  // Capital
		float r = 0;  // redito
		int t = 50;  // tiempo

		if (t <= 24) {
			r = 5;
		} else if (t <= 60 && t > 24) {
			r = 8;

		} else {
			r = 10;
		}

		System.out.println("La renta es: " + (c + (c * r * t / 1200)));
	}

}
