package adrian_PerezSandoval_ex3Trim_ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaro los ficheros, scanner, entero de opción y el arrayList
		File stock = new File("src\\adrian_PerezSandoval_ex3Trim_ficheros\\stock.dat\\");
		File listaPrecios = new File("src\\adrian_PerezSandoval_ex3Trim_ficheros\\lista_precios.txt\\");
		Scanner sc = new Scanner(System.in);
		int opcion;
		ArrayList<Videojuego> inventario = new ArrayList<Videojuego>();

		// Leo el fichero para mostrar por consola el inventario hasta ahora
		// Esto no me funciona, el resto sí
		try (ObjectInputStream lectura = new ObjectInputStream(new FileInputStream(stock))) {

			while(true) {
				try {
					System.out.println(lectura.readObject());
				} catch (ClassNotFoundException e) {
					System.out.println(e);
				}
			}

		} catch (FileNotFoundException fnfe) {
			System.err.println("Se va a crear un inventario nuevo");
		} catch (IOException ioe) {
			System.out.println(ioe);
		}

		// MENÚ
		do {
			System.out.println("\nInventario de Videojuegos");
			System.out.println("1.- Añadir un nuevo videojuego al inventario");
			System.out.println("2.- Mostrar por pantalla todos los videjuegos en stock");
			System.out.println("3.- Generar un informe de precios en formato de texto");
			System.out.println("4.- Salir de la aplicación y guardar los cambios");
			System.out.println("Escoja opción:");
			opcion = sc.nextInt();
			sc.nextLine();

			// Switch con los distintos case
			switch (opcion) {
			
			// Case 1 para agregar un videojuego al arraylist
			case 1:
				System.out.println("Nombre del videojuego: ");
				String nombre = sc.nextLine();

				System.out.println("Plataforma:");
				String plataforma = sc.nextLine();

				System.out.println("Precio:");
				double precio = sc.nextDouble();

				Videojuego nuevo = new Videojuego(nombre, plataforma, precio);
				inventario.add(nuevo);

				break;

			// Case 2 para mostrar el arraylist
			case 2:
				System.out.println("\nInventario actual");
				for (Videojuego videojuego : inventario) {
					System.out.println(videojuego);
				}
				break;

			// Case 3 para generar el fichero con la lista de los archivos del inventario
			case 3:
				System.out.println("Generando...");

				try (BufferedWriter bw = new BufferedWriter(new FileWriter(listaPrecios))) {

					for (Videojuego videojuego : inventario) {
						bw.write(videojuego.toString() + "\n");
					}

				} catch (IOException ioe) {
					System.out.println(ioe);
				}

				break;

			// Case 4 para salir y guardar el arraylist en un fichero binario
			case 4:

				System.out.println("Saliendo y guardando inventario...");

				try (ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream(stock))) {

					escritura.writeObject(inventario);

				} catch (IOException ioe) {
					System.out.println(ioe);
				}

				break;

			// Case default
			default:
				System.out.println("Opción no válida");
				break;
			}

		} while (opcion != 4);

		sc.close();
	}

}
