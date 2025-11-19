package espacio;

import java.util.Scanner;

public class BusquedaSeñales {

    public static void main(String[] args) {
        int[][] espacio = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,0,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,0,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,0,1,1,1,1,1},
            {1,1,1,1,1,0,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,0,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,0,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
        };

        boolean[][] visitado = new boolean[15][15];
        int totalSeñales = contarSeñales(espacio);
        int encontradas = 0;
        int intentos = 0;
        int maxIntentos = 30; // límite de intentos

        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenido a la búsqueda de señales extraterrestres! ");
        System.out.println("Tienes un máximo de " + maxIntentos + " intentos para encontrar todas las señales.\n");

        while (encontradas < totalSeñales && intentos < maxIntentos) {
            System.out.print("Ingresa fila (1-15): ");
            int fila = sc.nextInt() - 1;
            System.out.print("Ingresa columna (1-15): ");
            int columna = sc.nextInt() - 1;

            // Validar coordenadas
            if (fila < 0 || fila >= 15 || columna < 0 || columna >= 15) {
                System.out.println("Coordenadas inválidas. Intenta de nuevo.\n");
                continue;
            }

            intentos++; // sumar intento

            if (espacio[fila][columna] == 0 && !visitado[fila][columna]) {
                System.out.println("¡SEÑAL DETECTADA en (" + (fila+1) + ", " + (columna+1) + ")! ");
                visitado[fila][columna] = true;
                encontradas++;
            } else if (visitado[fila][columna]) {
                System.out.println("Ya habías detectado esta señal antes en (" + (fila+1) + ", " + (columna+1) + ").");
            } else {
                System.out.println("Silencio cósmico en (" + (fila+1) + ", " + (columna+1) + ")...");
            }

            System.out.println("Señales encontradas: " + encontradas + " de " + totalSeñales);
            System.out.println("Intentos usados: " + intentos + " de " + maxIntentos + "\n");
        }

        if (encontradas == totalSeñales) {
            System.out.println("¡Felicidades! Has encontrado todas las señales extraterrestres. ");
        } else {
            System.out.println("¡Misión fallida! No lograste encontrar todas las señales a tiempo. ☠");
        }

        // Mostrar matriz completa
        System.out.println("\nMatriz completa de señales (0 = señal, 1 = silencio):");
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(espacio[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static int contarSeñales(int[][] espacio) {
        int count = 0;
        for (int i = 0; i < espacio.length; i++) {
            for (int j = 0; j < espacio[i].length; j++) {
                if (espacio[i][j] == 0) count++;
            }
        }
        return count;
    }
}

