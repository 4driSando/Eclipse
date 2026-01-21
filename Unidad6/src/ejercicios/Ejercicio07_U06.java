package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio07_U06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> array1 = new ArrayList<>();
		ArrayList<String> array2 = new ArrayList<>();
		String respuesta;

		System.out.println("Introduzca 10 cadenas de texto");
		System.out.println("---------------------");

		for (int i = 0; i < 5; i++) {
			System.out.println("1er String " + (i + 1) + ": 1er ArrayList");
			respuesta = sc.nextLine();
			array1.add(respuesta);
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("1er String " + (i + 1) + ": 2º ArrayList");
			respuesta = sc.nextLine();
			array2.add(respuesta);
		}

		System.out.println("Son iguales? " + array1.equals(array2));
		
		sc.close();

	}

}
