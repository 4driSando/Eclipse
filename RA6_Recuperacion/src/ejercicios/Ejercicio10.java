package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		int respuesta;
		do {
			System.out.println("\nMenú de enteros");
			System.out.println("1. Agregar número");
			System.out.println("2. Buscar un número");
			System.out.println("3. Modificar un número");
			System.out.println("4. Eliminar un número");
			System.out.println("5. Insertar un número en una posición dada");
			System.out.println("6. Salir");
			respuesta = sc.nextInt();

			switch (respuesta) {
			case 1:
				System.out.print("Número a agregar: ");
				int numAgr = sc.nextInt();
				array.add(numAgr);
				break;

			case 2:
				System.out.print("Número a buscar: ");
				int numBus = sc.nextInt();

				if (array.contains(numBus)) {
					System.out.println(
							numBus + " está en el array y se encuentra en la posición " + array.indexOf(numBus));
				} else {
					System.out.println(numBus + " no está en el array");
				}
				break;

			case 3:
				System.out.print("Elige posición para modificar [" + array + "]: ");
				int numEle = sc.nextInt();
				System.out.print("Número nuevo: ");
				int numNue = sc.nextInt();
				array.add(numEle, numNue);
				break;

			case 4:
				System.out.print("Número a eliminar: ");
				int numBus2 = sc.nextInt();

				if (array.contains(numBus2)) {
					System.out.println(numBus2 + " eliminado con éxito");
					array.remove(numBus2);
				} else {
					System.out.println(numBus2 + " no está en el array");
				}
				break;

			case 5:

				break;

			case 6:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opción no válida");
				break;
			}

		} while (respuesta != 4);

	}

}
