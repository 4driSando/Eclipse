package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10_U05 {

	public static void main(String[] args) {
		/**
		 * 10. Crea un programa que cree un array de tamaño 1000 y lo rellene con
		 * valores enteros aleatorios entre 0 y 99. Luego pedirá por teclado un valor N
		 * y se mostrará por pantalla si N existe en el array, además de cuantas veces.
		 */
		
		int[] array1 = new int[1000];
		int respuesta;
		Scanner sc = new Scanner(System.in);
        
		for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100);
        }

		System.out.println("ARRAY ALEATORIO GENERADO");
		System.out.println("Veamos si tu número está en el array generado y rellenado por números aleatorios hasta el 99");
		respuesta = sc.nextInt();
	}

}
