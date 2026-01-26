package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio14_U06 {

	public static void main(String[] args) {
		/**
		 * Crear un programa para gestionar la plantilla de un equipo de futbol. El
		 * programa debe tener un HashMap con los jugadores actuales de la plantilla, de
		 * forma que la clave sea su número (que es único) y el valor su nombre. 1. Será
		 * posible añadir nuevos jugadores (comprobar que no exista jugador con ese
		 * número para no machacarlo), 2. eliminar jugadores, 3. mostrar todos los
		 * jugadores y 4. buscar si hay actualmente un jugador con el número indicado.
		 * 5. salir
		 */

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
			
			System.out.println("MENÚ");
			System.out.println("1. Añadir nuevo jugador");
			System.out.println("2. Eliminar jugador");
			System.out.println("3. Mostrar todos los jugadores");
			System.out.println("4. Buscar por dorsal");
			System.out.println("5. Salir");
			respuesta = sc.nextInt();
			sc.nextLine();

			switch (respuesta) {
			case 1:
				System.out.print("Nombre del jugador: ");
				nombre = sc.nextLine();
				System.out.print("Dorsal: ");
				dorsal = sc.nextInt();
				if (plantilla.containsKey(dorsal)) {
					System.err.print("Ese dorsal ya está asignado \n");
					} else {
						plantilla.put(dorsal, nombre);
					}
		
				break;
				
			case 2:
				System.out.println("Escribe el dorsal del jugador a eliminar");
				dorsal = sc.nextInt();
				plantilla.remove(dorsal);
				break;
				
			case 3:
				for (Integer dorsales : plantilla.keySet()) {
					System.out.println(dorsales + ". " + plantilla.get(dorsales));
				}
				break;
				
			case 4:
				System.out.println("Escribe el dorsal del jugador que quieres buscar");
				dorsal = sc.nextInt();
				
				break;
			case 5:

				break;

			default:
				break;
			}
		} while (respuesta != 5);

	}

}
