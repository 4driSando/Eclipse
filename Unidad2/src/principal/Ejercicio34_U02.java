package principal;

import java.util.Scanner;

public class Ejercicio34_U02 {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número para saber todos los impares menores que él:");
		num = sc.nextInt();

		if (num % 2 != 0) {
			do {
				num -= 2;
				System.out.println("- " + num);
			} while (num >= 2);
			
		} else if (num == 2 || num == 3) {
			System.out.println("- 1");
			
		} else {
			num -= 1;
			System.out.println("- " + num);
			do {
				num -= 2;
				System.out.println("- " + num);
			} while (num >= 2);
		}
	}
}
