package principal;

import java.util.Scanner;

public class Ejercicio07_U02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1;

		System.out.println("Introduce un número del 1 al 999:");
		num1 = sc.nextInt();

		if (num1 > 0 && num1 < 10) {
			System.out.println("Su número tiene una cifra");
		} else if (num1 >= 10 && num1 < 99) {
			System.out.println("Su número tiene dos cifras");
		} else if (num1 >= 100 && num1 < 999) {
			System.out.println("Su número tiene tres cifras");
		} else {
			System.err.println("Te he dicho un número hasta el 999, mendrugo");
		}
	}

}
