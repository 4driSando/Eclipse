package adrian_perezsandoval_examen2Trimestre;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) throws Exception {

		// Declaración de Objetos y variables
		ArrayList<Integer> historial = new ArrayList<Integer>();
		TarjetaTransporte t1 = new TarjetaTransporte("Mari Carmen", 20, historial);
		int respuesta1 = 0, respuesta2 = 0, respuesta3 = 0;
		Scanner sc = new Scanner(System.in);

		// Do while con el menú
		do {
			System.out.println("\nMENÚ Tarjeta de Transporte");
			System.out.println("--------------------------");
			System.out.println("1. Recargar saldo");
			System.out.println("2. Registrar viaje");
			System.out.println("3. Mostrar información de la tarjeta");
			System.out.println("4. Salir");
			// Capturo la excepción comprobando que sea un int
			try {
				respuesta1 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Eso no es un entero");
				sc.next();
			}

			switch (respuesta1) {
			case 1:
				// Case para recargarle el saldo a la tarjeta
				System.out.println("Importe a recargar");

				// Capturo la excepción comprobando que sea un int
				try {
					respuesta2 = sc.nextInt();
				} catch (InputMismatchException e) {
					System.err.println("Eso no es un entero");
				}

				// Comprobaciones necesarias para recargar el saldo
				if (respuesta2 > 0) {
					// Recargo tarjeta y lo añado al historial
					t1.recargarTarjeta(respuesta2);
					historial.add(respuesta2);
				} else if (respuesta2 <= 0) {
					System.err.println("No se puede recargar con valores negativos");
				}

				// Imprimo el saldo
				System.out.println("Tu saldo es de " + t1.getSaldo() + "€");
				break;

			case 2:
				System.out.println("Importe a restar (valores negativos)");

				// Capturo la excepción comprobando que sea un int
				try {
					respuesta3 = sc.nextInt();
				} catch (InputMismatchException e) {
					System.err.println("Eso no es un entero");
				}

				// Comprobaciones para registrar viajes

				// Compruebo que la respuesta sea menor que 0 para poder restar
				if (respuesta3 < 0) {
					// Registro viaje
					t1.registrarViaje(respuesta3);
					// Si el saldo es positivo lo añado al historial
					if (t1.getSaldo() > 0) {
						historial.add(respuesta3);
					} else {
						System.err.println("Saldo no puede ser negativo");
					}
				} else if (respuesta3 >= 0) {
					System.err.println("No se pueden registrar viajes con valores positivos");
				}

				break;

			case 3:
				// Imprimo el toString de la tarjeta
				System.out.println(t1);
				break;

			case 4:
				// Salgo del menú
				System.out.println("Saliendo...");
				break;

			default:
				System.err.println("Ese número no es válido");
				break;
			}
		} while (respuesta1 != 4);
		sc.close();
	}
}
