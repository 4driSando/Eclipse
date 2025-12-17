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
			System.out.println("6. Borrar último producto agregado");
			System.out.println("7. Salir");
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
						System.out.print((i + 1) + ". ");
						System.out.println(catálogo[i].mostrarProducto());
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
					if (catálogo[i].getNombre().equals(respuesta2)) {
						System.out.println("Artículo encontrado");
						catálogo[i].mostrarProducto();
					} else {
						System.err.println("Artículo no encontrado");
					}
				}
				break;

			// Vender producto
			case 4:
				System.out.println("Qué artículo desea comprar?");
				for (int i = 0; i < catálogo.length; i++) {
					if (catálogo[i] != null) {
						System.out.print((i + 1) + ". ");
						System.out.println(catálogo[i].mostrarProducto());
					} else {
						System.out.println((i + 1) + ". [Vacío]");
					}
				}
				respuesta2 = sc.next();

				System.out.println("Cuánta cantidad desea comprar?");
				int cantidad = sc.nextInt();
				double total = 0;

				switch (respuesta2) {
				case "1":
					total = catálogo[0].venderArtículo(cantidad);
					break;
				case "2":
					total = catálogo[1].venderArtículo(cantidad);
					break;
				case "3":
					total = catálogo[2].venderArtículo(cantidad);
					break;

				default:
					System.err.println("Número inválido");
					break;
				}
				if (total > 0) {
					System.out.println("Venta realizada. Total a pagar: " + total + "€");
				}
				break;

			// Añadir stock
			case 5:
				System.out.println("A qué artículo le deseas añadir stock?");
				for (int i = 0; i < catálogo.length; i++) {
					if (catálogo[i] != null) {
						System.out.print((i + 1) + ". ");
						System.out.println(catálogo[i].mostrarListaStock());
					} else {
						System.out.println((i + 1) + ". [Vacío]");
					}
				}
				sc.nextLine();
				respuesta2 = sc.nextLine();

				System.out.println("Cuánta cantidad deseas añadir?");
				int añadir = sc.nextInt();

				switch (respuesta2) {
				case "1":
					catálogo[0].añadirStock(añadir);
					break;
				case "2":
					catálogo[1].añadirStock(añadir);
					break;
				case "3":
					catálogo[2].añadirStock(añadir);
					break;
				default:
					System.err.println("Número inválido");
					break;

				}
			}
		} while (respuesta1 != 7);

	}
}