package principal;

import java.util.Scanner;

public class Ejercicio31_U02 {

	public static void main(String[] args) {

		int num = 0;
		int contador = 0;
		int suma = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce números cuantos quieras");
		System.out.println("Cuando la suma total llegue a 10000 se mostrarán el total acumulado, el contador de los números introducidos y la media.");

		do {
			System.out.println("Número + (" + suma + ")");
			num = sc.nextInt();
			suma += num;
			contador++;
		} while (suma < 10000);

		System.out.println("Has legado a los 10000 (" + suma + ")");
		System.out.println("Has introducido un total de " + contador + " números");
		System.out.println("La media total es " + (suma / contador));
	}
}
