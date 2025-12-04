package principal;

import java.util.Scanner;

public class Ejercicio22_U02 {

	public static void main(String[] args) {

		int num1;
		int op = 1;
		Scanner sc = new Scanner(System.in);
		int ale = (int) (100 + Math.random() * (999 - 100 + 1));
		System.out.println(ale);

		System.out.println("Adivina el número de 3 cifras:");

		do {
			System.out.println("Oportunidad Nº " + op);
			num1 = sc.nextInt();
			if (num1 != ale) {
				System.err.println("Mal!");
				System.out.println("Vuelva a probar");
			} else {
				System.out.println("Enhorabuena, coleguita!");
			}
			op++;
		} while (num1 != ale && op <= 5);
		if (num1 != ale) {
			System.out.println("Se te acabaron las oportunidades, rey. El número era " + ale);
		}
	}
}