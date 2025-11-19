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
            { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
            { 1, 1, 0, 0, 0, 0, 0, 0, 1, 1 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        };

        Scanner sc = new Scanner(System.in);
        boolean terminado = false;

        // BUCLE PRINCIPAL DEL JUEGO
        do {


            System.out.println("\nTABLERO:");
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {

                    if (tablero[i][j] == 0 || tablero[i][j] == 1) {

                        System.out.print(" ~ ");
                    } else if (tablero[i][j] == -1) {
                        System.out.print(" X ");
                    } else if (tablero[i][j] == 9) {
                        System.out.print(" * ");
                    }
                }
                System.out.println();
            }

            System.out.print("\nIntroduce fila (0-9): ");
            int fila = sc.nextInt();

            System.out.print("Introduce columna (0-9): ");
            int columna = sc.nextInt();


            if (fila < 0 || fila > 9 || columna < 0 || columna > 9) {
                System.out.println("Coordenadas fuera de rango.");
                continue;
            }

            if (tablero[fila][columna] == 0) {
                System.out.println("Agua.");
                tablero[fila][columna] = -1;

            } else if (tablero[fila][columna] == 1) {
                System.out.println("Tocado!");
                tablero[fila][columna] = 9;

            } else if (tablero[fila][columna] == 9) {
                System.out.println("Ya le habías dado a este barco.");

            } else if (tablero[fila][columna] == -1) {
                System.out.println("Ya habías disparado aquí.");

            }

            boolean quedanBarcos = false;

            for (int[] filaT : tablero) {
                for (int casilla : filaT) {
                    if (casilla == 1) {
                        quedanBarcos = true;
                        break;
                    }
                }
                if (quedanBarcos) break;
            }

            if (!quedanBarcos) {
                terminado = true;
                System.out.println("\n¡HAS HUNDIDO TODOS LOS BARCOS!");
            }

        } while (!terminado);

        sc.close();
    }
}
