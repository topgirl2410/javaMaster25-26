package Robot;

public class valores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] logs = { "OK", "ERROR", "OK", "ERROR", "ERROR", "OK", "ERROR", "ERROR", "ERROR", "OK" };

		int i = 0; // Indice para recorrer el array
		int okCount = 0; // contador de accesos correctos
		int errorCount = 0; // contador de errores

		while (i < logs.length) {
			if (logs[i].equals("OK")) {
				okCount++;
			} else if (logs[i].equals("ERROR")) {
				errorCount++;
			}
			i++;
		}
		System.out.println("Accesos ok: " + okCount);
		System.out.println("Accesos error: " + errorCount);
		if (errorCount > okCount) {
			System.out.println("Servidor en peligro");
		}
	}

}
