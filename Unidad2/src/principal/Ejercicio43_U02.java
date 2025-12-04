package principal;

import java.util.Scanner;

public class Ejercicio43_U02 {

	public static void main(String[] args) {

		String vocal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce letras para saber si es vocal o no, 'salir' para acabar");
		
		do {
			vocal = sc.nextLine().toLowerCase();

			switch (vocal) {
			case "a", "e", "i", "o", "u":
				System.out.println("La letra " + vocal + " es una vocal");
				break;
			case "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x",
					"y", "z":
				System.out.println("La letra " + vocal + " es una consonante");
				break;
			case "salir":
				System.out.println("Gracias por confiar en Sandoval!");
				break;
			default:
				System.err.println("Carácter inválido, gamberrete");
				break;
			}
		} while (!vocal.equals("salir"));
	}
}