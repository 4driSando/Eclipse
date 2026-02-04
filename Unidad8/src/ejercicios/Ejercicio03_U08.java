package ejercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03_U08 {

	public static void main(String[] args) {
		
		ArrayList<Mascota> vet = new ArrayList<Mascota>();
		Perro inaki = new Perro("Iñaki", LocalDate.of(2006, 6, 22), "Caniche", true);
		Gato lhanz = new Gato("Lhanzz", LocalDate.of(2005, 8, 11), true, "Naranja");
		Loro cespedes = new Loro("AlexCes", LocalDate.of(2001, 9, 11), "Guatemala", "Cacatuoidea");
		Loro sando = new Loro("Sandoval", LocalDate.of(2006, 9, 25), "García Noblejas", "Agaporni");
		vet.add(inaki);
		vet.add(lhanz);
		vet.add(cespedes);
		vet.add(sando);

		Scanner sc = new Scanner(System.in);
		int respuesta1 = 0, respuesta2 = 0, respuesta3 = 0;

		do {
			System.out.println("\nVETERINARIO MORROCOTUDO");
			System.out.println("1. Mostrar información");
			System.out.println("2. Hacer su sonido característico");
			System.out.println("3. Volar loro");
			System.out.println("4. Desparasitar");
			System.out.println("5. Salir del veterinario");
			try {
				respuesta1 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Tienes que introducir un número entero");
				sc.next();
			}
			switch (respuesta1) {
			case 1:
				for (Mascota mascotas : vet) {
					System.out.println(mascotas);
				}
				break;

			case 2:
				System.out.println("A quién quieres escuchar?");
				for (int i = 0; i < vet.size(); i++) {
					System.out.println((i + 1) + ". " + vet.get(i));
				}
				try {
					respuesta2 = sc.nextInt();
				} catch (InputMismatchException e) {
					System.err.println("Eso no es un entero");
				}

				try {
					System.out.println(vet.get(respuesta2 - 1).sonidoCaracteristico());
				} catch (IndexOutOfBoundsException e) {
					System.err.println("No hay tantas mascotas");
				}

				break;

			case 3:
				System.out.println("Quién quieres que vuele?");
				for (int i = 0; i < vet.size(); i++) {
					System.out.println((i + 1) + ". " + vet.get(i));
				}
				
				try {
					respuesta3 = sc.nextInt();
				} catch (InputMismatchException e) {
					System.err.println("Eso no es un entero");
				}
				try {
				    Mascota m = vet.get(respuesta3 - 1);

				    if (m instanceof Loro) {
				        System.out.println(((Loro) m).volar());
				    } else {
				        System.out.println("La mascota seleccionada no es un loro");
				    }

				} catch (IndexOutOfBoundsException e) {
				    System.out.println("Número fuera de rango");
				}

				break;

			case 4:
				System.out.println("A quién quieres desparasitar?");
				for (int i = 0; i < vet.size(); i++) {
					System.out.println((i + 1) + ". " + vet.get(i));
				}
				try {
					respuesta3 = sc.nextInt();
				} catch (InputMismatchException e) {
					System.err.println("Eso no es un entero");
				}

				try {
					Mascota m = vet.get(respuesta3 - 1);
					if (m instanceof Perro) {
						((Perro) m).desparasitar();
						System.out.println(m.getNombre() + " ha sido desparasitado correctamente");
					} else {
						System.err.println("Esa mascota seleccionada no es un perrete, coleguita");
					}

				} catch (IndexOutOfBoundsException e) {
					System.err.println("No hay tantas mascotas");
				}

				break;

			case 5:
				System.out.println("Saliendo del veterinario mocorrotudo...");
				break;

			default:
				break;
			}

		} while (respuesta1 != 5);

		sc.close();
	}

}
