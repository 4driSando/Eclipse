package principal;

import java.util.Scanner;

public class Ejercicio29_U02 {

	public static void main(String[] args) {

		int num;
		String pir;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una altura para la pirámide;");
		num = sc.nextInt();

		System.out.println("Introduce un CARACTER para la pirámide:");
		pir = sc.next();

		for (int i = 0; i < num; i++) {
			for (int j = i; j < num; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print(pir);
			}
			System.out.println();
		}
	}
}