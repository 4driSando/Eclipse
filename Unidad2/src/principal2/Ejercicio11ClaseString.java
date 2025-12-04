package principal2;

import java.util.*;

public class Ejercicio11ClaseString {

	public static void main(String[] args) {

		String frase;
		int totalVocales;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase te diré cuántas 'a' hay");
		frase = sc.nextLine();

		totalVocales = frase.replaceAll("[^AÁaá]", "").length();
		System.out.println("En la frase '" + frase + "' hay un total de " + totalVocales + " 'as'");
	}
}