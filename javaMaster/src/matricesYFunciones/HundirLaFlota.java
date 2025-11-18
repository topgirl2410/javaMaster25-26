package matricesYFunciones;

import java.util.Random;
import java.util.Scanner;

public class HundirLaFlota {

	// Constantes del tablero
	static final int AGUA = 0;
	static final int BARCO = 1;
	static final int TOCADO = 2;
	static final int HUNDIDO = 3;
	static final int FALLO = 4;

	static Scanner sc = new Scanner(System.in);
	static Random rnd = new Random();

	public static void main(String[] args) {

		System.out.println("====== HUNDIR LA FLOTA ======");

		int tamaño = elegirNivel();
		int[][] tablero = new int[tamaño][tamaño];

		// Barcos según nivel
		int[] barcos = tamaño == 8 ? new int[] { 3, 2, 2, 1, 1 }
				: tamaño == 10 ? new int[] { 4, 3, 3, 2, 2, 1, 1 } : new int[] { 5, 4, 3, 3, 2, 2, 1, 1 };

		colocarBarcosAleatoriamente(tablero, barcos);

		int disparos = 0;
		int barcosHundidos = 0;
		int totalBarcos = barcos.length;

		boolean terminado = false;

		while (!terminado) {

			imprimirTablero(tablero, false);

			System.out.println("\nIntroduce coordenadas para disparar: ");
			int fila = pedirNumero("Fila (0-" + (tamaño - 1) + "): ", 0, tamaño - 1);
			int columna = pedirNumero("Columna (0-" + (tamaño - 1) + "): ", 0, tamaño - 1);

			disparos++;

			int resultado = procesarDisparo(tablero, fila, columna);

			if (resultado == FALLO)
				System.out.println("Agua");
			else if (resultado == TOCADO)
				System.out.println("¡Tocado!");
			else if (resultado == HUNDIDO) {
				barcosHundidos++;
				System.out.println("🔥 ¡BARCO HUNDIDO! 🔥");
			} else {
				System.out.println("Coordenada ya disparada.");
			}

			// Comprobar fin del juego
			if (barcosHundidos == totalBarcos)
				terminado = true;
		}

		// FIN DEL JUEGO
		System.out.println("\n====== ¡HAS GANADO! ======");
		imprimirTablero(tablero, true);

		System.out.println("\nEstadísticas:");
		System.out.println("Disparos realizados: " + disparos);
		System.out.println("Barcos hundidos: " + barcosHundidos + " / " + totalBarcos);
		System.out.println("Precisión: " + (100 * barcosHundidos / disparos) + "%");

		System.out.println("\nGracias por jugar :)");
	}

	// ------------------------------------------------------------------
	// -------------------------- MENÚ Y NIVELES -------------------------
	// ------------------------------------------------------------------

	public static int elegirNivel() {
		System.out.println("\nElige nivel:");
		System.out.println("1 - Fácil (8x8)");
		System.out.println("2 - Medio (10x10)");
		System.out.println("3 - Difícil (12x12)");

		int opcion = pedirNumero("Opción: ", 1, 3);

		return opcion == 1 ? 8 : opcion == 2 ? 10 : 12;
	}

	// ------------------------------------------------------------------
	// ----------------------- COLOCAR BARCOS ----------------------------
	// ------------------------------------------------------------------

	public static void colocarBarcosAleatoriamente(int[][] tablero, int[] barcos) {
		for (int tamañoBarco : barcos) {

			boolean colocado = false;

			while (!colocado) {

				int fila = rnd.nextInt(tablero.length);
				int col = rnd.nextInt(tablero.length);
				boolean horizontal = rnd.nextBoolean();

				if (puedeColocar(tablero, fila, col, tamañoBarco, horizontal)) {
					colocar(tablero, fila, col, tamañoBarco, horizontal);
					colocado = true;
				}
			}
		}
	}

	public static boolean puedeColocar(int[][] tab, int fila, int col, int tamaño, boolean horizontal) {

		if (horizontal) {
			if (col + tamaño > tab.length)
				return false;

			for (int c = col; c < col + tamaño; c++)
				if (tab[fila][c] != AGUA)
					return false;

		} else {
			if (fila + tamaño > tab.length)
				return false;

			for (int f = fila; f < fila + tamaño; f++)
				if (tab[f][col] != AGUA)
					return false;
		}

		return true;
	}

	public static void colocar(int[][] tab, int fila, int col, int tamaño, boolean horizontal) {
		if (horizontal) {
			for (int c = col; c < col + tamaño; c++)
				tab[fila][c] = BARCO;
		} else {
			for (int f = fila; f < fila + tamaño; f++)
				tab[f][col] = BARCO;
		}
	}

	// ------------------------------------------------------------------
	// -------------------------- DISPAROS -------------------------------
	// ------------------------------------------------------------------

	public static int procesarDisparo(int[][] tab, int fila, int col) {

		if (tab[fila][col] == AGUA) {
			tab[fila][col] = FALLO;
			return FALLO;
		}
		if (tab[fila][col] == FALLO || tab[fila][col] == HUNDIDO || tab[fila][col] == TOCADO)
			return -1;

		if (tab[fila][col] == BARCO) {
			tab[fila][col] = TOCADO;

			if (barcoHundido(tab, fila, col)) {
				marcarHundido(tab, fila, col);
				return HUNDIDO;
			}
			return TOCADO;
		}

		return -1;
	}

	// ------------------------------------------------------------------
	// ------------ COMPROBAR SI UN BARCO ENTERO ESTÁ HUNDIDO ----------
	// ------------------------------------------------------------------

	public static boolean barcoHundido(int[][] tab, int fila, int col) {
		return comprobarHorizontal(tab, fila, col) && comprobarVertical(tab, fila, col);
	}

	public static boolean comprobarHorizontal(int[][] tab, int fila, int col) {
		// Izquierda
		for (int c = col; c >= 0; c--)
			if (tab[fila][c] == BARCO)
				return false;

		// Derecha
		for (int c = col; c < tab.length; c++)
			if (tab[fila][c] == BARCO)
				return false;

		return true;
	}

	public static boolean comprobarVertical(int[][] tab, int fila, int col) {
		// Arriba
		for (int f = fila; f >= 0; f--)
			if (tab[f][col] == BARCO)
				return false;

		// Abajo
		for (int f = fila; f < tab.length; f++)
			if (tab[f][col] == BARCO)
				return false;

		return true;
	}

	public static void marcarHundido(int[][] tab, int fila, int col) {

		// Horizontal
		for (int c = col; c >= 0 && tab[fila][c] != AGUA && tab[fila][c] != FALLO; c--)
			tab[fila][c] = HUNDIDO;

		for (int c = col; c < tab.length && tab[fila][c] != AGUA && tab[fila][c] != FALLO; c++)
			tab[fila][c] = HUNDIDO;

		// Vertical
		for (int f = fila; f >= 0 && tab[f][col] != AGUA && tab[f][col] != FALLO; f--)
			tab[f][col] = HUNDIDO;

		for (int f = fila; f < tab.length && tab[f][col] != AGUA && tab[f][col] != FALLO; f++)
			tab[f][col] = HUNDIDO;
	}

	// ------------------------------------------------------------------
	// ----------------------------- UTILS -------------------------------
	// ------------------------------------------------------------------

	public static int pedirNumero(String msg, int min, int max) {
		int num;
		do {
			System.out.print(msg);
			while (!sc.hasNextInt()) {
				System.out.println("Introduce un número válido.");
				sc.next();
			}
			num = sc.nextInt();
		} while (num < min || num > max);
		return num;
	}

	public static void imprimirTablero(int[][] tab, boolean mostrarBarcos) {
		System.out.println("\n    0 1 2 3 4 5 6 7 8 9");
		System.out.println("   ---------------------");

		for (int i = 0; i < tab.length; i++) {
			System.out.print(i + " | ");
			for (int j = 0; j < tab[i].length; j++) {

				int celda = tab[i][j];

				if (!mostrarBarcos && celda == BARCO) {
					System.out.print("~ ");
				} else if (celda == AGUA || celda == BARCO) {
					System.out.print("~ ");
				} else if (celda == FALLO) {
					System.out.print("x ");
				} else if (celda == TOCADO) {
					System.out.print("* ");
				} else if (celda == HUNDIDO) {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
}
