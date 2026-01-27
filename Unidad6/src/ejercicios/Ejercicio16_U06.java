package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio16_U06 {

	public static void main(String[] args) {

		HashMap<Integer, Jugador> plantilla = new HashMap<>();
		Jugador mateo = new Jugador("Mateo", posicion.PORTERO);
		Jugador michael = new Jugador("Michael", posicion.CIERRE);
		Jugador carlos = new Jugador("Carlos", posicion.CIERRE);
		Jugador lucasT = new Jugador("Lucas Torio", posicion.CIERRE);
		Jugador martin = new Jugador("Martín", posicion.PIVOT);
		Jugador isaac = new Jugador("Isaac", posicion.PIVOT);
		Jugador lucasS = new Jugador("Lucas Salvatierra", posicion.PIVOT);
		Jugador dani = new Jugador("Daniel", posicion.ALA);
		Jugador nico = new Jugador("Nicolás", posicion.ALA);
		Jugador giuseppe = new Jugador("Giuseppe", posicion.ALA);
		Jugador ariel = new Jugador("Ariel", posicion.PIVOT);
		Jugador emmanuel = new Jugador("Emmanuel", posicion.ALA);
		Jugador nacho = new Jugador("Nacho", posicion.PORTERO);
		Jugador aaron = new Jugador("Aarón", posicion.ALA);
		plantilla.put(1, mateo);
		plantilla.put(3, michael);
		plantilla.put(5, carlos);
		plantilla.put(7, lucasT);
		plantilla.put(8, martin);
		plantilla.put(9, isaac);
		plantilla.put(10, lucasS);
		plantilla.put(13, dani);
		plantilla.put(17, nico);
		plantilla.put(18, giuseppe);
		plantilla.put(19, ariel);
		plantilla.put(23, emmanuel);
		plantilla.put(25, nacho);
		plantilla.put(31, aaron);

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
//					plantilla.put(dorsal, nombre);
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
