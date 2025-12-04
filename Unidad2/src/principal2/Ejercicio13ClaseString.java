package principal2;

import java.util.*;

public class Ejercicio13ClaseString {

	public static void main(String[] args) {

		String email;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu email para generarte tu nombre de usuario");
		email = sc.next();

		System.out.println("Tu nombre de usuario es: " + email.substring(0, email.indexOf("@")));
	}
}