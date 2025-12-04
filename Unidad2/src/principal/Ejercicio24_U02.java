package principal;

import java.util.Scanner;

public class Ejercicio24_U02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		int suma = 0;
		int contador = 0;

		System.out.println("Introduce números cuantos quieras y te calcularé la media");
		System.out.println("Introduzca un negativo para terminar");

		do {
			System.out.println("Número " + contador);
			num = sc.nextInt();
			if (num >= 0) {
				suma += num;
				contador++;
			}
		} while (num >= 0);

		if (contador > 0) {
			System.out.println("La media de tus números es " + (suma / contador));
		} else {
			System.out.println("No se introdujeron números válidos.");
		}
	}
}