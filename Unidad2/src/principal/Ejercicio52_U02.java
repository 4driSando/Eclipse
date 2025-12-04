package principal;

import java.util.Scanner;

public class Ejercicio52_U02 {

	public static void main(String[] args) {

		int aleatorio = (int) (Math.random() * 10 + 1);
		int[] oportunidades = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("Acierta un número del 1 al 10 con 5 oportunidades");

		for (int i = 0; i < oportunidades.length; i++) {
			System.out.println("Nº " + (i + 1));
			oportunidades[i] = sc.nextInt();
		}

		System.out.print("| ");

		for (int i = 0; i < oportunidades.length; i++) {
			System.out.print(oportunidades[i] + " | ");
		}

		for (int j = 0; j < oportunidades.length; j++)
			if (oportunidades[j] == aleatorio) {
				System.out.println("El número era " + aleatorio);
				System.out.println("Enhorabuena mi rey, has acertado!");
				break;
			} else {
				System.out.println("El número era " + aleatorio);
				System.out.println("Lo siento pero no has acertado");
				break;
			}
	}
}