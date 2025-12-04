package principal;

import java.util.Scanner;

public class Ejercicio09_U02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1;

		System.out.println("Escribe un número del 1 al 7 y te digo el día de la semana que corresponde:");
		num1 = sc.nextInt();

		if (num1 == 1) {
			System.out.println("Lunes");
		} else if (num1 == 2) {
			System.out.println("Martes");
		} else if (num1 == 3) {
			System.out.println("Miércoles");
		} else if (num1 == 4) {
			System.out.println("Jueves");
		} else if (num1 == 5) {
			System.out.println("Viernes");
		} else if (num1 == 6) {
			System.out.println("Sábado");
		} else if (num1 == 7) {
			System.out.println("Domingo");
		} else {
			System.err.println("Te dicho que del 1 al 7...");
		}
	}

}
