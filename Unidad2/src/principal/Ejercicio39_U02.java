package principal;

import java.util.Scanner;

public class Ejercicio39_U02 {

	public static void main(String[] args) {

		int anyo, mes;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un año");
		anyo = sc.nextInt();

		System.out.println("Introduce el número de un mes (1.Enero, 2.Febrero, etc...)");
		mes = sc.nextInt();
		if (mes >= 13 || mes < 0) {
			System.err.println("Ese mes no existe compañerete!");
		}

		if (anyo % 4 == 0 && anyo % 100 != 0) {
			System.out.println(anyo + " es bisiesto");
		} else if (anyo % 100 == 0 && anyo % 400 == 0) {
			System.out.println(anyo + " es bisiesto");
		} else {
			System.out.println(anyo + " no es bisiesto");
		}

		if (mes != 2 && mes % 2 != 0 && mes < 13 && mes > 0) {
			System.out.println("El mes " + mes + " tiene 31 días");
		} else if (mes != 2 && mes % 2 == 0 && mes < 13 && mes > 0) {
			System.out.println("El mes " + mes + " tiene 30 días");
		} else if (mes == 2 && anyo % 4 == 0 && anyo % 100 != 0) {
			System.out.println("El mes " + mes + " tiene 29 días");
		} else if (mes == 2 && anyo % 100 == 0 && anyo % 400 == 0) {
			System.out.println("El mes " + mes + " tiene 29 días");
		} else {
			System.out.println("El mes " + mes + " tiene 28 días");
		}

	}
}
