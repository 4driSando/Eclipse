package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio15_U06 {

	public static void main(String[] args) {
		/**
		 * Crear un programa para gestionar el stock de productos en un almacén. Será
		 * necesario mantener información del nombre del producto, y las unidades del
		 * mismo. Se creará un menú que permita 1. añadir productos, 1,2 si el producto
		 * existe aumenta el stock, si no existe lo crea, 2. eliminar productos, 3.
		 * reducir el stock de un producto (teniendo en cuenta que no puede quedar stock
		 * negativo), 4. buscar las unidades que hay de un determinado producto, 5.
		 * listar todos los productos, y 6. listar todos los productos junto con su
		 * stock.
		 *
		 *
		 */

		HashMap<String, Integer> almacen = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int respuesta, stock;
		String nombre;

		do {
			System.out.println("ALMACÉN MORROCOTUDO");
			System.out.println("1. Añadir producto");
			System.out.println("2. Elminar producto");
			System.out.println("3. Reducir stock");
			System.out.println("4. Examinar stock");
			System.out.println("5. Listar productos");
			System.out.println("6. Listar productos junto con stock");
			System.out.println("7. Salir");
			respuesta = sc.nextInt();
			sc.nextLine();

			switch (respuesta) {

			case 1:
				System.out.print("Introduzca el nombre del producto: ");
				nombre = sc.nextLine();
				System.out.print("Introduzca su stock: ");
				stock = sc.nextInt();
				almacen.put(nombre, stock);
				
				
				break;
				
			case 2:
				System.out.print("Introduzca el producto a eliminar: ");
				nombre = sc.nextLine();
				almacen.remove(nombre);
				break;
			
			case 3:
				System.out.print("Introduce un producto:");
				nombre = sc.nextLine();
				System.out.print("Introduce cuánto stock quieres reducir: ");
				stock = sc.nextInt();
				break;
			
			case 4:
				// Preguntar por producto e indicar stock
				break;
			
			case 5:
				for (String productos : almacen.keySet()) {
					System.out.println("- " + productos);
				}
				break;
			
			case 6:
				for (String productos : almacen.keySet()) {
					System.out.println("- " + productos + " " + almacen.get(productos) + " unidades");
				}
				break;
			
			case 7:
				System.out.println("Gracias por usar mi almacén morrocotudo :)");
				break;

			default:
				System.err.println("Ese número no es válido compañerete");
				break;
			}

		} while (respuesta != 7);
	}

}
