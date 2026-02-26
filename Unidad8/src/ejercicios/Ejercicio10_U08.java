package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10_U08 {

	public static void main(String[] args) {

		ArrayList<Vehiculo> lista = new ArrayList<>();

		// COCHES
		try {
		    lista.add(new Coche("9576NRT", "Seat Ibiza", 4, true));
		} catch (Exception e) { System.err.println("Error Coche 1: " + e.getMessage()); }

		try {
		    lista.add(new Coche("1147CTR", "Ford Focus", 4, false));
		} catch (Exception e) { System.err.println("Error Coche 2: " + e.getMessage()); }

		// MOTOS
		try {
		    lista.add(new Moto("3456JKL", "Yamaha R6", 2, "Azul"));
		} catch (Exception e) { System.err.println("Error Moto 1: " + e.getMessage()); }

		try {
		    lista.add(new Moto("2942MLR", "Kawasaki Ninja", 2, "Verde"));
		} catch (Exception e) { System.err.println("Error Moto 2: " + e.getMessage()); }

		// BARCOS
		try {
		    lista.add(new Barco("NAOMI", "Yate Deluxe", 30, true));
		} catch (Exception e) { System.err.println("Error Barco 1: " + e.getMessage()); }

		try {
		    lista.add(new Barco("PASAFARDOS", "Lancha Rápida", 12, false));
		} catch (Exception e) { System.err.println("Error Barco 2: " + e.getMessage()); }

		// SUBMARINOS
		try {
		    lista.add(new Submarino("TITAN", "Deep Explorer", 70, 500));
		} catch (Exception e) { System.err.println("Error Submarino 1: " + e.getMessage()); }

		try {
		    lista.add(new Submarino("OCEANO", "Blue Abyss", 55, 800));
		} catch (Exception e) { System.err.println("Error Submarino 2: " + e.getMessage()); }

		// AVIONES
		try {
		    lista.add(new Avion("ILMS123456", "Boeing 737", 180, 12));
		} catch (Exception e) { System.err.println("Error Avion 1: " + e.getMessage()); }

		try {
		    lista.add(new Avion("PSHP654321", "Falcon", 150, 10));
		} catch (Exception e) { System.err.println("Error Avion 2: " + e.getMessage()); }

		// HELICÓPTEROS
		try {
		    lista.add(new Helicotero("TOPO141122", "Rescue One", 6, 4));
		} catch (Exception e) { System.err.println("Error Helicóptero 1: " + e.getMessage()); }

		try {
		    lista.add(new Helicotero("RATA230424", "Sky Patrol", 8, 2));
		} catch (Exception e) { System.err.println("Error Helicóptero 2: " + e.getMessage()); }

		Scanner sc = new Scanner(System.in);
		int respuesta = 0, valor = 0;

		do {
			System.out.println("\nMENÚ VEHÍCULOS MORROCOTUDOS");
			System.out.println("1. Mostrar lista completa");
			System.out.println("2. Mostrar cuántos vehículos hay de cada tipo");
			System.out.println("3. Mostrar coches con aire acondicionado");
			System.out.println("4. Mostrar barcos con motor");
			System.out.println("5. Mostrar submarinos con profundidad superior a un valor");
			System.out.println("6. Demostrar polimorfismo");
			System.out.println("7. Salir");

			try {
				respuesta = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Eso no es un entero");
			}

			switch (respuesta) {

			case 1:
				for (Vehiculo v : lista) {
					System.out.println(v);
				}
				break;

			case 2:
				int coches = 0, motos = 0, barcos = 0, submarinos = 0, aviones = 0, helicoteros = 0;

				for (Vehiculo v : lista) {
					if (v instanceof Coche)
						coches++;
					else if (v instanceof Moto)
						motos++;
					else if (v instanceof Barco)
						barcos++;
					else if (v instanceof Submarino)
						submarinos++;
					else if (v instanceof Avion)
						aviones++;
					else if (v instanceof Helicotero)
						helicoteros++;
				}
				System.out.println("\nCANTIDAD DE VEHÍCULOS POR TIPO");
				System.out.println("Coches: " + coches);
				System.out.println("Motos: " + motos);
				System.out.println("Barcos: " + barcos);
				System.out.println("Submarinos: " + submarinos);
				System.out.println("Aviones: " + aviones);
				System.out.println("Helicoteros: " + helicoteros);
				break;

			case 3:
				System.out.println("\nCOCHES CON AIRE ACONDICIONADO");
				for (Vehiculo v : lista) {
					if (v instanceof Coche) {
						Coche c = (Coche) v;
						if (c.isAc()) {
							System.out.println(c);
						}
					}
				}
				break;

			case 4:
				System.out.println("\nBARCOS CON MOTOR");
				for (Vehiculo v : lista) {
					if (v instanceof Barco) {
						Barco b = (Barco) v;
						if (b.isMotor()) {
							System.out.println(b);
						}
					}
				}
				break;

			case 5:
				System.out.print("Introduce profundidad mínima: ");
				try {
					valor = sc.nextInt();
				} catch (Exception e) {
					System.err.println("Eso no es un entero");
				}

				System.out.println("\nSUBMARINOS CON PROFUNDIDAD SUPERIOR A " + valor);
				for (Vehiculo v : lista) {
					if (v instanceof Submarino) {
						Submarino s = (Submarino) v;
						if (s.getProfMax() > valor) {
							System.out.println(s);
						}
					}
				}
				break;

			case 6:
				for (Vehiculo v : lista) {
					System.out.println("Tipo: " + v.tipoVehiculo());
				}
				break;

			case 7:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción no válida.");
			}

		} while (respuesta != 7);
		sc.close();
	}

}
