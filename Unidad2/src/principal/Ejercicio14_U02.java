package principal;

import java.util.Scanner;

public class Ejercicio14_U02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num1;
		double num2;

		System.out
				.println("Introduzca la operación que desea realizar (1.Suma, 2.Resta, 3.Multiplicación, 4.División)");
		int opcion = sc.nextInt();

		System.out.println("Número 1:");
		num1 = sc.nextDouble();
		System.out.println("Número 2:");
		num2 = sc.nextDouble();

		switch (opcion) {
		case 1:
			System.out.println("El resultado de tu suma es " + (num1 + num2));
			break;
		case 2:
			System.out.println("El resultado de tu resta es " + (num1 - num2));
			break;
		case 3:
			System.out.println("El resultado de tu multiplicación es " + (num1 * num2));
			break;
		case 4:
			System.out.println("El resultado de tu división es " + (num1 / num2));
			break;

		}
	}

}
