package ejercicios;

import java.util.Scanner;

public class EntradasArraysMain {

	public static void main(String[] args) {

		int respuesta1, respuesta2;
		Scanner sc = new Scanner(System.in);
		Entradas[] zonas = new Entradas[4];
		zonas[0] = new Entradas("Fondo Norte", 500, 10);
		zonas[1] = new Entradas("Fondo Sur", 700, 10);
		zonas[2] = new Entradas("Preferencia Alta", 300, 25);
		zonas[3] = new Entradas("Preferencia Baja", 250, 40);

		do {
			System.out.println("--------------");
			System.out.println("MENÚ");
			System.out.println("1. Mostrar número de entradas libres que hay en cada zona");
			System.out.println("2. Mostrar precio por entrada en cada zona");
			System.out.println("3. Vender entradas");
			System.out.println("4. Salir");
			respuesta1 = sc.nextInt();

			switch (respuesta1) {

			case 1:
				System.out.println("--------------");
				System.out.println("ENTRADAS RESTANTES");
				for (int i = 0; i <= 3; i++) {
					zonas[i].mostrarEntradas();
				}
				break;

			case 2:
				System.out.println("--------------");
				System.out.println("PRECIO");
				for (int i = 0; i <= 3; i++) {
					zonas[i].mostrarPrecio();
				}
				break;

			case 3:

				System.out.println("------------------");
				System.out.println("ELIGE ZONA PARA COMPRAR");
				System.out.println("1. Fondo Norte");
				System.out.println("2. Fondo Sur");
				System.out.println("3. Preferencia Alta");
				System.out.println("4. Preferencia Baja");
				respuesta2 = sc.nextInt();
				System.out.println("¿Cuántas entradas quieres?");

				int cantidad = sc.nextInt();
				double total = 0;

				switch (respuesta2) {
				case 1:
					total = zonas[0].venderEntradas(cantidad);
					break;
				case 2:
					total = zonas[1].venderEntradas(cantidad);
					break;
				case 3:
					total = zonas[2].venderEntradas(cantidad);
					break;
				case 4:
					total = zonas[3].venderEntradas(cantidad);
					break;
				default:
					System.err.println("Número inválido");
					break;
				}
				if (total > 0) {
					System.out.println("Venta realizada. Total a pagar: " + total + "€");
				}
				break;

			default:
				break;
			}

		} while (respuesta1 != 4);

		System.out.println("Gracias por usar el gestor de entradas del Gipsy Colliseum");	
		sc.close();

	}

}
