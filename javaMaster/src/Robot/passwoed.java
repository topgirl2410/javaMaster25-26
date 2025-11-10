package Robot;

public class passwoed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] passwords = { "admin123", "e@mpl3", "supersecure99", "pass", "root@2020" };
		int containsAt = 0;
		int longerThan8 = 0;
		int endsWithNumber = 0;
		String longest = "";

		for (String pwd : passwords) {
			if (pwd.indexOf('@') >= 0) {
				containsAt++;
			}
			if (pwd.length() > 8) {
				longerThan8++;
			}
			if (!pwd.isEmpty()) {
				char last = pwd.charAt(pwd.length() - 1);
				if (Character.isDigit(last)) {
					endsWithNumber++;
				}
			}
			if (pwd.length() > longest.length()) {
				longest = pwd;
			}
		}

		System.out.println("Contienen '@': " + containsAt);
		System.out.println("Más de 8 caracteres: " + longerThan8);
		System.out.println("Terminan en número: " + endsWithNumber);
		System.out.println("Más larga: " + longest + " (" + longest.length() + " caracteres)");
	}

}
