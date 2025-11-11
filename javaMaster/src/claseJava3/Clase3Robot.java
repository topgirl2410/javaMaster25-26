package claseJava3;

import java.util.Random;

public class Clase3Robot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aleatorio = new Random();
		int buenos, validos;

		buenos = 0;
		validos = 0;

		for (int i = 0; i < 1000; i++) {
			int calidad = aleatorio.nextInt(101);
			if (calidad >= 85) {
				buenos++;
			}
		}
	}

}
