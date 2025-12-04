package principal;

import java.util.Scanner;

public class Ejercicio11_U02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1;

		System.out.println("Escribe un número del 1 al 7 y te digo el día de la semana que corresponde:");
		num1 = sc.nextInt();

		switch (num1) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Del 1 al 7 zopenco...");
			break;

		}

	}

}
