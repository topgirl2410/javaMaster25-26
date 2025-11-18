package matricesYFunciones;

import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {
		int[][] tablero = {
				{ 0, 0, 0, 0, 1, 1, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 9, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, -1, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 1, 0, 0, 0, 0, 0, 0, 1, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				};
		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] == 0) {
					System.out.print(" ~ ");
				}

				else if (tablero[i][j] == 1) {
					System.out.print(" B ");
				} else {
					System.out.print(" X");
				}
			}
			System.out.println("");
		}
		Scanner sc = new Scanner(System.in);
		int aciertos = 0;
		System.out.print("Introduce fila (0 - 9): ");
		int fila = sc.nextInt();

		System.out.print("Introduce columna (0 - 9): ");
		int columna = sc.nextInt();

		if (tablero[fila][columna] == 0) {
			System.out.println("Agua");
			tablero[fila][columna] = -1;
			
		}else if(tablero[fila][columna] == 1) {
			System.out.println("Tocado");
			tablero[fila][columna] = 9;
			aciertos++;
			
		} else if(tablero[fila][columna] == 9){
			System.out.println("Deja de gastar municion que ya le has dado");
			
		} else {
			System.out.println("Ese tiro ya lo hiciste");
		}
	}

}
