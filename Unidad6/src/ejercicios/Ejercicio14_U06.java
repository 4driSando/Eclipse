package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio14_U06 {

	public static void main(String[] args) {

		HashMap<Integer, String> plantilla = new HashMap<>();
		plantilla.put(1, "Mateo");
		plantilla.put(3, "Michael");
		plantilla.put(5, "Carlos");
		plantilla.put(7, "Lucas Torio");
		plantilla.put(8, "Martín");
		plantilla.put(9, "Isaac");
		plantilla.put(10, "Lucas Salvatierra");
		plantilla.put(13, "Daniel");
		plantilla.put(17, "Nicolás");
		plantilla.put(18, "Giuseppe");
		plantilla.put(19, "Ariel");
		plantilla.put(23, "Emmanuel");
		plantilla.put(25, "Nacho");
		plantilla.put(31, "Aarón");

		Scanner sc = new Scanner(System.in);
		int respuesta, dorsal;
		String nombre;

		System.out.println("Plantilla Infantil 2025-26");

		do {
			System.out.println("\nMENÚ EQUIPO MORROCOTUDO");
			System.out.println("1. Añadir nuevo jugador");
			System.out.println("2. Eliminar jugador");
			System.out.println("3. Mostrar todos los jugadores");
			System.out.println("4. Buscar por dorsal");
			System.out.println("5. Salir");
			System.out.print("Opción: ");
			respuesta = sc.nextInt();
			sc.nextLine();

			switch (respuesta) {

			case 1:
				System.out.print("Nombre del jugador: ");
				nombre = sc.nextLine();
				System.out.print("Dorsal: ");
				dorsal = sc.nextInt();

				if (plantilla.containsKey(dorsal)) {
					System.err.println("Ese dorsal ya está asignado.");
				} else {
					plantilla.put(dorsal, nombre);
					System.out.println("Jugador añadido.");
				}
				break;

			case 2:
				System.out.print("Dorsal del jugador a eliminar: ");
				dorsal = sc.nextInt();

				if (plantilla.remove(dorsal) != null) {
					System.out.println("Jugador eliminado.");
				} else {
					System.out.println("No existe ningún jugador con ese dorsal.");
				}
				break;

			case 3:
				for (Integer d : plantilla.keySet()) {
					System.out.println(d + ". " + plantilla.get(d));
				}
				break;

			case 4:
				System.out.print("Dorsal a buscar: ");
				dorsal = sc.nextInt();

				if (plantilla.containsKey(dorsal)) {
					System.out.println("Jugador: " + plantilla.get(dorsal));
				} else {
					System.out.println("No hay jugador con ese dorsal.");
				}
				break;

			case 5:
				System.out.println("Saliendo de la plantilla morrocotuda");
				break;

			default:
				System.err.println("Opción no válida.");
			}

		} while (respuesta != 5);

		sc.close();
	}
}
