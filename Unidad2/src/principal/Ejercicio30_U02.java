package principal;

import java.util.Scanner;

public class Ejercicio30_U02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		double mediaImpares;
		int contador = 0;
		int sumaImpares = 0;
		int contImpares = 0;
		int maxPar = Integer.MIN_VALUE;

		System.out.println("Ve introduciendo números. Para parar introduce un número negativo:");

		do {
			num = sc.nextInt();

			if (num >= 0) {
				contador++;

				if (num % 2 != 0) {
					sumaImpares += num;
					contImpares++;
				} else {
					if (num > maxPar) {
						maxPar = num;
					}
				}
			}

		} while (num >= 0);

		if (contImpares > 0) {
			mediaImpares = (double) sumaImpares / contImpares;
		} else {
			mediaImpares = 0;
		}

		System.out.println("Se han introducido " + contador + " números.");
		System.out.println("La media de los impares es: " + mediaImpares);

		if (maxPar == Integer.MIN_VALUE)
			System.out.println("No se introdujeron números pares.");
		else
			System.out.println("El mayor par es: " + maxPar);
	}
}
