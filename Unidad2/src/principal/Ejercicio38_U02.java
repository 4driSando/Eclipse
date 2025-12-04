package principal;

import java.util.Scanner;

public class Ejercicio38_U02 {

	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número y se mostrará una pirámide hasta éste");
		num = sc.nextInt();

		for (int pir = 1; pir <= num; ++pir) {
			for (int pir2 = 1; pir2 <= pir; ++pir2) {
				System.out.print(pir2 + " ");
			}
			System.out.println(" ");
		}
	}
}