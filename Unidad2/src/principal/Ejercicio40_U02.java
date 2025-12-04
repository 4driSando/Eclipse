package principal;

import java.util.Scanner;

public class Ejercicio40_U02 {

	public static void main(String[] args) {

		int num;
		int contador = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número para saber sus 5 siguientes pares");
		num = sc.nextInt();

		if (num % 2 == 0) {
			do {
				System.out.println(num += 2);
				contador++;
			} while (contador < 5);
		} else {
			num -= 1;
			do {
				System.out.println(num += 2);
				contador++;
			} while (contador < 5);
		}
	}
}
