package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Crear secuencia aritmética");
		System.out.println("Valor inicial:");
		int v = sc.nextInt();
		System.out.println("Incremento:");
		int i = sc.nextInt();
		System.out.println("Valores a crear:");
		int n = sc.nextInt();

		for (int j = 0; j < n; j++) {
			array.add(v);
			v = v + i;
		}

		System.out.println(array);

		// Ejemplo iterator
		
		// Se declara el iterator
		Iterator<Integer> it = array.iterator();

		// Se comprueba que haya siguiente
		while (it.hasNext()) {
			
			// Si hay siguiente, se guarda en una variable 
 			int numero = it.next();

 			// Si el siguiente es un número impar
			if (numero % 2 != 0) {
				
				// Se imprime para saber cuáles se van a borrar
				System.out.print(" | " + numero);

				// Se borra el siguiente número impar 
				it.remove();
			}
		}

		// Vuelvo a mostrar el array sin los impares
		System.out.println("\n" + array);

		sc.close();
	}

}
