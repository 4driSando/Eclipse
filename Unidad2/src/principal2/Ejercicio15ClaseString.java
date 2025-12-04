package principal2;

import java.util.Scanner;

public class Ejercicio15ClaseString {

	public static void main(String[] args) {

		String frase;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase para reemplazar 'Java' por 'Phyton'");
		frase = sc.nextLine();

		System.out.println(frase.replace("java", "Phyton"));
	}
}