package principal;

import java.util.Scanner;

public class Ejercicio37_U02 {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		int ale = (int) (Math.random() * (10 + 1));

		System.out.println(ale);

		System.out.println("Adivina un número del 1 al 10 en 5 oportunidades");
		for (int contador = 1; contador <= 5; contador++) {
			System.out.println("Oportunidad Nº " + contador);
			num = sc.nextInt();

			if (num == ale) {
				System.out.println("Enhorabuena mi rey, has acertado!");
				break;
			} else if (contador == 5) {
				System.out.println("Se te han acabado los intentos rey :(");
			}
		}
	}
}