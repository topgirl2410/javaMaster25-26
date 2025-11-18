package matricesYFunciones;

import java.util.Random;
import java.util.Scanner;

public class HundirLaFlota {

	static final int AGUA = 0;
	static final int BARCO = 1;
	static final int FALLO = 2;
	static final int TOCADO = 3;
	static final int HUNDIDO = 4;

	static Scanner sc = new Scanner(System.in);
	static Random rnd = new Random();

	public static void main(String[] args) {

		System.out.println("====== HUNDIR LA FLOTA ======\n");

		int tamaño = elegirNivel();
		int[][] tablero = new int[tamaño][tamaño];

		int[] barcos = tamaño == 8 ? new int[] { 3, 2, 2, 1, 1 }
				: tamaño == 10 ? new int[] { 4, 3, 3, 2, 2, 1, 1 } : new int[] { 5, 4, 4, 3, 3, 2, 2, 1, 1 };

		colocarBarcos(tablero, barcos);

		int disparos = 0;

		while (true) {

			imprimirTablero(tablero, false);

			System.out.println("\nIntroduce coordenadas para disparar:");
			int fila = pedirNumero("Fila (0-" + (tamaño - 1) + "): ", 0, tamaño - 1);
			int col = pedirNumero("Columna (0-" + (tamaño - 1) + "): ", 0, tamaño - 1);

			disparos++;

			int res = disparar(tablero, fila, col);

			switch (res) {
			case FALLO -> System.out.println("Agua.");
			case TOCADO -> System.out.println("¡Tocado!");
			case HUNDIDO -> System.out.println("🔥 ¡BARCO HUNDIDO! 🔥");
			case -1 -> System.out.println("Ya habías disparado aquí.");
			}

			if (!quedanBarcos(tablero))
				break;
		}

		// JUEGO TERMINADO
		System.out.println("\n====== ¡HAS GANADO! ======");
		imprimirTablero(tablero, true);

		System.out.println("\nEstadísticas:");
		System.out.println("Total disparos: " + disparos);

		sc.close();
	}

	// ------------------------------------------------------------------
	// MENÚ
	// ------------------------------------------------------------------

	public static int elegirNivel() {
		System.out.println("Elige nivel:");
		System.out.println("1 - Fácil (8x8)");
		System.out.println("2 - Medio (10x10)");
		System.out.println("3 - Difícil (12x12)");

		int opt = pedirNumero("Opción: ", 1, 3);

		return opt == 1 ? 8 : opt == 2 ? 10 : 12;
	}

	// ------------------------------------------------------------------
	// COLOCAR BARCOS
	// ------------------------------------------------------------------

	public static void colocarBarcos(int[][] t, int[] barcos) {
		for (int tamaño : barcos) {

			boolean colocado = false;

			while (!colocado) {

				int fila = rnd.nextInt(t.length);
				int col = rnd.nextInt(t.length);
				boolean horizontal = rnd.nextBoolean();

				if (puedeColocar(t, fila, col, tamaño, horizontal)) {
					colocar(t, fila, col, tamaño, horizontal);
					colocado = true;
				}
			}
		}
	}

	public static boolean puedeColocar(int[][] t, int fila, int col, int size, boolean hor) {

		if (hor) {
			if (col + size > t.length)
				return false;
			for (int c = col; c < col + size; c++)
				if (t[fila][c] != AGUA)
					return false;

		} else {
			if (fila + size > t.length)
				return false;
			for (int f = fila; f < fila + size; f++)
				if (t[f][col] != AGUA)
					return false;
		}

		return true;
	}

	public static void colocar(int[][] t, int fila, int col, int size, boolean hor) {

		if (hor) {
			for (int c = col; c < col + size; c++)
				t[fila][c] = BARCO;

		} else {
			for (int f = fila; f < fila + size; f++)
				t[f][col] = BARCO;
		}
	}

	// ------------------------------------------------------------------
	// DISPAROS
	// ------------------------------------------------------------------

	public static int disparar(int[][] t, int fila, int col) {

		if (t[fila][col] == AGUA) {
			t[fila][col] = FALLO;
			return FALLO;
		}

		if (t[fila][col] == FALLO || t[fila][col] == TOCADO || t[fila][col] == HUNDIDO)
			return -1; // repetido

		if (t[fila][col] == BARCO) {
			t[fila][col] = TOCADO;

			if (barcoEnteroHundido(t, fila, col)) {
				hundirBarco(t, fila, col);
				return HUNDIDO;
			}

			return TOCADO;
		}

		return -1;
	}

	// ------------------------------------------------------------------
	// DETECTAR SI EL BARCO ESTÁ COMPLETO
	// ------------------------------------------------------------------

	public static boolean barcoEnteroHundido(int[][] t, int fila, int col) {

		// Extender horizontalmente
		int c = col;
		while (c >= 0 && esParteBarco(t[fila][c]))
			c--;
		int izquierda = c + 1;

		c = col;
		while (c < t.length && esParteBarco(t[fila][c]))
			c++;
		int derecha = c - 1;

		// Extender verticalmente
		int f = fila;
		while (f >= 0 && esParteBarco(t[f][col]))
			f--;
		int arriba = f + 1;

		f = fila;
		while (f < t.length && esParteBarco(t[f][col]))
			f++;
		int abajo = f - 1;

		// Buscar horizontal
		if (izquierda != derecha) {
			for (int x = izquierda; x <= derecha; x++)
				if (t[fila][x] == BARCO)
					return false;
			return true;
		}

		// Buscar vertical
		if (arriba != abajo) {
			for (int x = arriba; x <= abajo; x++)
				if (t[x][col] == BARCO)
					return false;
			return true;
		}

		// Barco de 1 celda
		return true;
	}

	public static boolean esParteBarco(int valor) {
		return valor == BARCO || valor == TOCADO || valor == HUNDIDO;
	}

	// ------------------------------------------------------------------
	// MARCAR COMO HUNDIDO TODAS LAS CELDAS DEL BARCO
	// ------------------------------------------------------------------

	public static void hundirBarco(int[][] t, int fila, int col) {

		// horizontal
		int c = col;
		while (c >= 0 && esParteBarco(t[fila][c])) {
			t[fila][c] = HUNDIDO;
			c--;
		}
		c = col;
		while (c < t.length && esParteBarco(t[fila][c])) {
			t[fila][c] = HUNDIDO;
			c++;
		}

		// vertical
		int f = fila;
		while (f >= 0 && esParteBarco(t[f][col])) {
			t[f][col] = HUNDIDO;
			f--;
		}
		f = fila;
		while (f < t.length && esParteBarco(t[f][col])) {
			t[f][col] = HUNDIDO;
			f++;
		}
	}

	// ------------------------------------------------------------------
	// COMPROBAR SI QUEDAN BARCOS
	// ------------------------------------------------------------------

	public static boolean quedanBarcos(int[][] t) {
		for (int[] fila : t)
			for (int celda : fila)
				if (celda == BARCO || celda == TOCADO)
					return true;
		return false;
	}

	// ------------------------------------------------------------------
	// UTILS
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

	public static void imprimirTablero(int[][] t, boolean mostrarBarcos) {

		System.out.print("\n   ");
		for (int i = 0; i < t.length; i++)
			System.out.print(i + " ");
		System.out.println("\n   " + "- ".repeat(t.length));

		for (int i = 0; i < t.length; i++) {
			System.out.print(i + " | ");
			for (int j = 0; j < t[i].length; j++) {

				int c = t[i][j];

				if (!mostrarBarcos && c == BARCO) {
					System.out.print("~ ");
				} else {
					switch (c) {
					case AGUA, BARCO -> System.out.print("~ ");
					case FALLO -> System.out.print("x ");
					case TOCADO -> System.out.print("* ");
					case HUNDIDO -> System.out.print("# ");
					}
				}
			}
			System.out.println();
		}
	}
}
