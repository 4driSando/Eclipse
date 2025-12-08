package ejercicios;

import java.util.Scanner;

public class EntradasMain {

	public static void main(String[] args) {

		int respuesta, respuesta2;
		Scanner sc = new Scanner(System.in);
		Entradas fsur = new Entradas("Fondo Sur", 500, 10);
		Entradas fnorte = new Entradas("Fondo Norte", 700, 10);
		Entradas palta = new Entradas("Preferencia Alta", 300, 25);
		Entradas pbaja = new Entradas("Preferencia Baja", 250, 40);

		do {
			System.out.println("--------------");
			System.out.println("-----MENÚ-----");
			System.out.println("1. Mostrar número de entradas libres que hay en cada zona");
			System.out.println("2. Mostrar precio por entrada en cada zona");
			System.out.println("3. Vender entradas");
			System.out.println("4. Salir");
			respuesta = sc.nextInt();

			switch (respuesta) {
			case 1:
				System.out.println("--------------");
				System.out.println("----QUEDAN----");
				System.out.println("1. Fondo Norte");
				System.out.println("2. Fondo Sur");
				System.out.println("3. Preferencia Alta");
				System.out.println("4. Preferencia Baja");
				respuesta2 = sc.nextInt();

				switch (respuesta2) {
				case 1:
					fnorte.mostrarEntradas();
					break;
				case 2:
					fsur.mostrarEntradas();
					break;
				case 3:
					palta.mostrarEntradas();
					break;
				case 4:
					pbaja.mostrarEntradas();
					break;
				default:
					System.err.println("Número inválido compañerete");
					break;
				}
				break;

			case 2:
				System.out.println("--------------");
				System.out.println("----PRECIO----");
				System.out.println("1. Fondo Norte: 10€");
				System.out.println("2. Fondo Sur: 10€");
				System.out.println("3. Preferencia Alta: 25€");
				System.out.println("4. Preferencia Baja: 40€");

				break;

			case 3:
				System.out.println("------------------");
				System.out.println("----ELIGE ZONA----");
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
					total = fnorte.venderEntradas(cantidad);
					break;
				case 2:
					total = fsur.venderEntradas(cantidad);
					break;
				case 3:
					total = palta.venderEntradas(cantidad);
					break;
				case 4:
					total = pbaja.venderEntradas(cantidad);
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

		} while (respuesta != 4);

		System.out.println("Gracias por usar el gestor de entradas del Gipsy Colliseum");
		
		sc.close();
	}

}
