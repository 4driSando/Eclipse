package ejercicios;

import java.util.Scanner;

public class TiendaMain {

	public static void main(String[] args) {

		Artículo[] catálogo = new Artículo[3];
		Scanner sc = new Scanner(System.in);
		int respuesta1;
		String respuesta2;

		System.out.println("TIENDA MORROCOTUDA DE SANDOVAL");
		do {
			System.out.println("Qué quieres hacer?");
			System.out.println("1. Agregar producto");
			System.out.println("2. Mostrar todos los productos");
			System.out.println("3. Buscar producto por nombre");
			System.out.println("4. Comprar producto");
			System.out.println("5. Añadir stock a un producto");
			System.out.println("6. Salir");
			respuesta1 = sc.nextInt();

			switch (respuesta1) {
			// Agregar producto
			case 1:
				boolean insertado = false;

				for (int i = 0; i < catálogo.length; i++) {
					if (catálogo[i] == null) {
						catálogo[i] = new Artículo(null, 0, 0);
						System.out.println("Nombre:");
						sc.nextLine();
						catálogo[i].setNombre(sc.nextLine());
						System.out.println("Precio:");
						catálogo[i].setPrecio(sc.nextDouble());
						System.out.println("Stock:");
						catálogo[i].setStock(sc.nextInt());
						insertado = true;
						break;
					}
				}

				if (!insertado) {
					System.err.println("Error: el catálogo está lleno");
				}
				break;

			// Mostrar todos los productos
			case 2:
				for (int i = 0; i < catálogo.length; i++) {
					if (catálogo[i] != null) {
						System.out.print((i + 1) + ".");
						catálogo[i].mostrarProducto();
					} else {
						System.out.println((i + 1) + ". [Vacío]");
					}
				}
				break;

			// Buscar producto --- No funciona
			case 3:
				System.out.println("Introduzca el artículo deseado:");
				sc.nextLine();
				respuesta2 = sc.nextLine();
				respuesta2.toLowerCase();
				for (int i = 0; i < catálogo.length; i++) {
					if (catálogo[i].getNombre() == respuesta2) {
						catálogo[i].mostrarProducto();
					} else {
						System.err.println("Artículo no encontrado");
					}
					break;

				
				}
			case 4:
				System.out.println("Qué artículo desea comprar?");
				for (int i = 0; i < catálogo.length; i++) {
					if (catálogo[i] != null) {
						System.out.print((i + 1) + ".");
						catálogo[i].mostrarLista();
					} else {
						System.out.println((i + 1) + ". [Vacío]");
					}
				}
				respuesta2 = sc.next();
				if (respuesta2.equals("1")) {
					// vender artículo 1
				} else if (respuesta2.equals("2")) {
					// vender artículo 2
				} else if (respuesta2.equals("3")) {
					// vender artículo 3
				} else {
					// syse: 
				}
				break; 
			}
			

		} while (respuesta1 != 6);

	}
}
