package principal;

import java.util.Scanner;

public class Ejercicio08_U02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num1;

		System.out.println("Introduzca su temperatura corporal:");
		num1 = sc.nextDouble();

		if (num1 < 34 || num1 > 41) {
			System.err.println("Posible error, vuelva a medirse la temperatura");
		} else if (num1 >= 34.1 && num1 <= 37.1) {
			System.out.println("Temperatura correcta, tas bien");
		} else if (num1 >= 37.2 && num1 <= 38.3) {
			System.out.println("Estas malito, corre al médico");
		} else if (num1 >= 38.4 && num1 <= 40.9) {
			System.out.println("Corre al médico urgente que te mueres, rey");
		}

	}

}
