package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio15_U06 {

	public static void main(String[] args) {

		HashMap<String, Integer> almacen = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		int respuesta, stock;
		String nombre;

		do {
			System.out.println("\nALMACÉN MORROCOTUDO");
			System.out.println("1. Añadir producto");
			System.out.println("2. Eliminar producto");
			System.out.println("3. Reducir stock");
			System.out.println("4. Examinar stock");
			System.out.println("5. Listar productos");
			System.out.println("6. Listar productos junto con stock");
			System.out.println("7. Salir");
			System.out.print("Elige opción: ");
			respuesta = sc.nextInt();
			sc.nextLine();

			switch (respuesta) {

			case 1:
				System.out.print("Nombre del producto: ");
				nombre = sc.nextLine();
				System.out.print("Stock a añadir: ");
				stock = sc.nextInt();

				if (almacen.containsKey(nombre)) {
					almacen.put(nombre, almacen.get(nombre) + stock);
				} else {
					almacen.put(nombre, stock);
				}
				System.out.println("Producto actualizado.");
				break;

			case 2:
				System.out.print("Producto a eliminar: ");
				nombre = sc.nextLine();

				if (almacen.remove(nombre) != null) {
					System.out.println("Producto eliminado.");
				} else {
					System.err.println("El producto no existe.");
				}
				break;

			case 3:
				System.out.print("Producto: ");
				nombre = sc.nextLine();

				if (almacen.containsKey(nombre)) {
					System.out.print("Cantidad a reducir: ");
					stock = sc.nextInt();

					int stockActual = almacen.get(nombre);

					if (stock <= stockActual) {
						almacen.put(nombre, stockActual - stock);
						System.out.println("Stock reducido.");
					} else {
						System.err.println("No se puede dejar stock negativo.");
					}
				} else {
					System.err.println("El producto no existe.");
				}
				break;

			case 4:
				System.out.print("Producto a consultar: ");
				nombre = sc.nextLine();

				if (almacen.containsKey(nombre)) {
					System.out.println("Stock: " + almacen.get(nombre) + " unidades");
				} else {
					System.err.println("El producto no existe.");
				}
				break;

			case 5:
				if (almacen.isEmpty()) {
					System.err.println("No hay productos.");
				} else {
					for (String producto : almacen.keySet()) {
						System.out.println("- " + producto);
					}
				}
				break;

			case 6:
				if (almacen.isEmpty()) {
					System.err.println("No hay productos.");
				} else {
					for (String producto : almacen.keySet()) {
						System.out.println("- " + producto + ": " + almacen.get(producto) + " unidades");
					}
				}
				break;

			case 7:
				System.out.println("Gracias por usar el almacén morrocotudo");
				break;

			default:
				System.err.println("Opción no válida.");
			}

		} while (respuesta != 7);

		sc.close();
	}
}
