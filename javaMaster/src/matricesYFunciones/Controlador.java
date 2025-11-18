package matricesYFunciones;

public class Controlador {

	public static void main(String[] args) {
		int[][] tablero = { { 0, 0, 0, 0, 1, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0, 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };
		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero[i].length; j++) {
				if(tablero[i][j] == 0) {
					System.out.print(" ~ ");
				}
				
				if(tablero[i][j] == 1) {
					System.out.print(" B ");
				}
			}
			System.out.println("");
		}
	}

}
