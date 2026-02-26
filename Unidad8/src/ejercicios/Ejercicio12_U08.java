package ejercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio12_U08 {

	public static void main(String[] args) {

		ArrayList<Producto> productos = new ArrayList<>();
		try {
			ProductoFresco lechuga = new ProductoFresco("Lechuga", LocalDate.of(2026, 3, 5), 101,
					LocalDate.of(2026, 3, 2), "España");
			productos.add(lechuga);
			ProductoFresco tomate = new ProductoFresco("Tomate", LocalDate.of(2026, 3, 10), 102,
					LocalDate.of(2026, 3, 7), "España");
			productos.add(tomate);
			ProductoRefrigerado yogur = new ProductoRefrigerado("Yogur Natural", LocalDate.of(2026, 4, 10), 1001,
					LocalDate.of(2026, 2, 20), "ORG-A1", 30);
			productos.add(yogur);
			ProductoRefrigerado quesoFresco = new ProductoRefrigerado("Queso Fresco", LocalDate.of(2026, 3, 25), 1002,
					LocalDate.of(2026, 2, 18), "ORG-B2", 45);
			productos.add(quesoFresco);
			ProductoRefrigerado leche = new ProductoRefrigerado("Leche Entera", LocalDate.of(2026, 3, 15), 1003,
					LocalDate.of(2026, 2, 22), "ORG-C3", 20);
			productos.add(leche);
			ProductoRefrigerado jamon = new ProductoRefrigerado("Jamón Cocido", LocalDate.of(2026, 4, 5), 1004,
					LocalDate.of(2026, 2, 19), "ORG-D4", 60);
			productos.add(jamon);
			ProductoCongelado pizza = new ProductoCongelado("Pizza Barbacoa", LocalDate.of(2027, 1, 10), 2001,
					LocalDate.of(2026, 2, 5), "Italia", 365);
			productos.add(pizza);
			ProductoCongelado helado = new ProductoCongelado("Helado Vainilla", LocalDate.of(2026, 12, 20), 2002,
					LocalDate.of(2026, 2, 12), "España", 300);
			productos.add(helado);
			ProductoCongelado verduritas = new ProductoCongelado("Verduras Mixtas", LocalDate.of(2027, 3, 15), 2003,
					LocalDate.of(2026, 2, 1), "Bélgica", 540);
			productos.add(verduritas);
			ProductoCongelado filetesMerluza = new ProductoCongelado("Filetes de Merluza", LocalDate.of(2027, 2, 28),
					2004, LocalDate.of(2026, 1, 28), "Noruega", 400);
			productos.add(filetesMerluza);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		int respuesta;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("\nMENÚ PRODUCTOS");
			System.out.println("1. Añadir Producto");
			System.out.println("2. Listar productos");
			System.out.println("3. Listar productos de cada tipo por separado");
			System.out.println("4. Modificar un producto ya existente");
			System.out.println("5. Borrar producto");
			System.out.println("6. Salir");
			respuesta = sc.nextInt();

			switch (respuesta) {
			case 1:
				System.out.println("\nElige producto a añadir");
				System.out.println("1. Producto Fresco");
				System.out.println("2. Producto Refrigerado");
				System.out.println("3. Producto Congelado");
				int respuesta1 = sc.nextInt();
				sc.nextLine();
				switch (respuesta1) {
				case 1: {
					ProductoFresco p1;
					try {
						p1 = (ProductoFresco) preguntarProducto(productos, sc);
						System.out.println("Pais Origen:");
						String pais = sc.nextLine();
						p1.setPaisOrigen(pais);
						System.out.println("Su producto ha sido añadido con éxito");
						System.out.println(p1);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

				}
					break;

				case 2: {
					ProductoRefrigerado p1;
					try {
						p1 = (ProductoRefrigerado) preguntarProducto(productos, sc);
						System.out.println("Código organismo:");
						String codOrg = sc.nextLine();
						p1.setCodOrg(codOrg);
						System.out.println("Tiempo recomendado:");
						int tiempo = sc.nextInt();
						sc.nextLine();
						p1.setTiempoReco(tiempo);
						productos.add(p1);
						System.out.println("Su producto ha sido añadido con éxito");
						System.out.println(p1);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
					break;

				case 3: {
					ProductoCongelado p1;
					try {
						p1 = (ProductoCongelado) preguntarProducto(productos, sc);
						System.out.println("País origen:");
						String pais = sc.nextLine();
						p1.setPaisOrigen(pais);
						System.out.println("Tiempo recomendado:");
						int tiempo = sc.nextInt();
						sc.nextLine();
						p1.setTiempoReco(tiempo);
						productos.add(p1);
						System.out.println("Su producto ha sido añadido con éxito");
						System.out.println(p1);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
					break;

				default: {
					System.out.println("Esa no es una opción válida");

				}
					break;
				}
				break;

			case 2:
				System.out.println("LISTA DE PRODUCTOS");
				for (Producto p : productos) {
					System.out.println(p);
				}
				break;

			case 3:
				System.out.println("PRODUCTOS POR TIPO");
				for (Producto p : productos) {
					if (p instanceof ProductoFresco) {
						System.out.println("\nPRODUCTOS FRESCOS: " + p);
					} else if (p instanceof ProductoRefrigerado) {
						System.out.println("\nPRODUCTOS REFRIGERADOS " + p);
					} else if (p instanceof ProductoCongelado) {
						System.out.println("\nPRODUCTOS CONGELADOS " + p);
					}
				}
				break;

			case 4:
				// paso, osea mucho curro
				break;

			case 5:
				System.out.println("\nPRODUCTOS PARA BORRAR");
				int contador = 0;
				for (Producto p : productos) {
					System.out.println(contador + ". " + p.getNombre());
					contador++;
				}
				int respuesta2 = sc.nextInt();
				System.out.println("El producto " + productos.get(respuesta2).getNombre() + " ha sido eliminado");
				productos.remove(respuesta2);
				break;

			case 6:
				System.out.println("Saliendo de la Distribudora Internacional de Alimentos");
				break;

			default:
				System.out.println("Esa no es una opción válida");
				break;
			}
		} while (respuesta != 6);
		sc.close();
	}

	private static Producto preguntarProducto(ArrayList<Producto> productos, Scanner sc) throws Exception {
		System.out.println("Nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Fecha de caducidad (yyyy-MM-dd): ");
		String fechaCad = sc.nextLine();
		LocalDate fechaC = LocalDate.parse(fechaCad);
		System.out.println("Número de lote:");
		int numLote = sc.nextInt();
		sc.nextLine();
		System.out.println("Fecha de envasado (yyyy-MM-dd): ");
		String fechaEnvasado = sc.nextLine();
		LocalDate fechaE = LocalDate.parse(fechaEnvasado);
		ProductoFresco p1;
		p1 = new ProductoFresco(nombre, fechaC, numLote, fechaE);
		productos.add(p1);
		return p1;
	}

}
