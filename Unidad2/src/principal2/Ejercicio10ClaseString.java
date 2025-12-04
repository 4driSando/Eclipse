package principal2;

import java.util.*;

public class Ejercicio10ClaseString {

	public static void main(String[] args) {

		String frase;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase y la verás sin los espacios");
		frase = sc.nextLine();

		System.out.println(frase.replaceAll(" ", ""));
	}
}
