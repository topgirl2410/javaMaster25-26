package condicionalesIf;

import java.util.Scanner;

public class Zodiaco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("¿En que año nacio o nacera?");
		int anio = sc.nextInt();

		String signo;

		switch (anio) {
		case 2020:
			signo = "Rata";
			break;

		case 2021:
			signo = "Buey";
			break;

		case 2022:
			signo = "Tigre";
			break;

		case 2023:
			signo = "Conejo";
			break;

		case 2024:
			signo = "Dragón";
			break;

		case 2025:
			signo = "Serpiente";
			break;

		case 2026:
			signo = "Caballo";
			break;

		case 2027:
			signo = "Cabra";
			break;

		case 2028:
			signo = "Mono";
			break;

		case 2029:
			signo = "Gallo";
			break;

		case 2030:
			signo = "Perro";
			break;

		case 2031:
			signo = "Cerdo";
			break;

		default:
			signo = "Año fuera de rango (debe ser entre 2020 y 2031) ";
		}

		System.out.println("Su signo es: " + signo);
		sc.close();

	}

}
