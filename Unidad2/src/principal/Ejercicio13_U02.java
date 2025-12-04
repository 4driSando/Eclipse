package principal;

import java.util.Scanner;

public class Ejercicio13_U02 {
	public static void main(String[] args) {

		int nota;
		Scanner sc = new Scanner(System.in);

		System.out.println("Compañerete dime cuánto has sacado (del 1 al 10)");
		nota = sc.nextInt();

		switch (nota) {
		case 0, 1, 2, 3, 4:
			System.out.println("Has suspendido :(");
			break;
		case 5, 6, 7, 8, 9, 10:
			System.out.println("Has aprobado, genio ;)");
			break;
		}
	}
}
