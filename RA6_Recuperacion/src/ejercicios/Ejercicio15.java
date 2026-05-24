package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		// Crear un programa para gestionar el stock de productos en un almacén. Será
		// necesario mantener información del nombre del producto, y las unidades del
		// mismo. Se creará un menú que permita añadir productos, si el producto existe
		// aumenta el stock, si no existe lo crea, eliminar productos, reducir el stock
		// de un producto (teniendo en cuenta que no puede quedar stock negativo),
		// buscar las unidades que hay de un determinado producto, listar todos los
		// productos, y listar todos los productos junto con su stock.

		Scanner sc = new Scanner(System.in);
		ArrayList<Producto> lista = new ArrayList<Producto>();
		int respuesta;

		do {
			System.out.println("Menú morrocotudo");
			System.out.println("1.- Añadir producto");
			System.out.println("2.- Eliminar producto");
			System.out.println("3.- Reducir stock");
			System.out.println("4.- Buscar unidades");
			System.out.println("5.- Listar productos");
			System.out.println("6.- Listar productos junto con stock");
			System.out.println("7.- Salir");
			respuesta = sc.nextInt();
			sc.nextLine();

			switch (respuesta) {
			case 1:
				try {
					System.out.println("Nombre del producto");
					String nombre = sc.nextLine();

					System.out.println(
							"Cantidad (Si el producto ya existe, se sumará la cantidad al stock del producto)");
					int cantidad = sc.nextInt();

					Producto nuevo = new Producto(nombre, cantidad);
					lista.add(nuevo);

					// Corregir manera de buscar por que así no busca

				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}

				break;

			case 2:

				break;

			case 3:

				break;

			case 4:

				break;

			case 5:

				break;

			case 6:
				for (Producto producto : lista) {
					System.out.println(producto);
				}
				break;

			case 7:

				break;

			default:
				break;
			}

		} while (respuesta != 7);

	}

}
