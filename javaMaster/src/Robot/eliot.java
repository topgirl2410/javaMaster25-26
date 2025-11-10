package Robot;

public class eliot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] balances = { 12000, -50, 5000, 15000, 0, -300, 800, 22000, 9999, 100 };

		int cuentasNegativas = 0;
		int cuentasSuperiores = 0;
		int suma = 0;

		// Recorre el array
		for (int balance : balances) {
			if (balance < 0) {
				cuentasNegativas++;
			}
			if (balance > 10000) {
				cuentasSuperiores++;
			}
			suma += balance;
		}

		// Calcular saldo medio
		double saldoMedio = (double) suma / balances.length;

		// Mostrar resultados
		System.out.println("Balances de Evil Corp");
		for (int balance : balances) {
			System.out.println(balance);
		}

		System.out.println("\n-- Resultados --");
		System.out.println("Cuentas con saldo negativo: " + cuentasNegativas);
		System.out.println("Cuentas con saldo > 10000 $: " + cuentasSuperiores);
		System.out.println("Saldo medio: " + saldoMedio);
	}

}
