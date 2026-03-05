package cuentas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase main de la clase cuenta
 * 
 * @author Sandoval
 * @version 1.0
 */
public class TestCuenta {

	static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Método que ingresa o retira dinero del saldo de la cuenta
	 * @param cuenta1 cuenta en la que realizar las opciones
	 * @param cantidad cantidad a retirar o ingresar dinero
	 * @param opcion opción a realizar, ya sea 1 para retirar, 2 para ingresar
	 */
	public static void operativa_cuenta(Cuenta cuenta1, float cantidad, int opcion) {

		if (opcion == 2) {
			try {
				cuenta1.retirar(cantidad);
				System.out.println("Retirada en cuenta");
			} catch (Exception e) {
				System.out.println("Fallo al retirar");
			}
		} else if (opcion == 1) {
			try {
				cuenta1.ingresar(cantidad);
				System.out.println("Ingreso en cuenta");
			} catch (Exception e) {
				System.out.println("Fallo al ingresar");
			}
		}
		System.out.println();
	}

	/**
	 * Main de la clase
	 * @param args args
	 */
	public static void main(String[] args) {

		// Objetos instanciados
		Cuenta cuenta1;
		double saldoActual;
		int opcion = -1;
		cuenta1 = new Cuenta("Juan López", "1000-2365-85-123456789", 2500, 0);
		do {
			try {
				System.out.println("MENÚ DE OPERACIONES");
				System.out.println("-------------------");
				System.out.println("1 - Ingresar");
				System.out.println("2 - Retirar");
				System.out.println("3 - Mostrar");
				System.out.println("0 - Finalizar");

				System.out.println();
				System.out.println("Introduzca una opción:");
				opcion = Integer.parseInt(dato.readLine());

				if (opcion == 1) {
					System.out.println("¿Cuándo dinero ingresar?");
					float ingresar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, ingresar, opcion);
				} else if (opcion == 2) {
					System.out.println("¿Cuándo dinero retirar? ");
					float retirar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, retirar, opcion);
				} else if (opcion == 3) {
					System.out.println("El saldo actual es: " + cuenta1.getSaldo());
					System.out.println();
				} else if (opcion == 0) {
					System.out.println("Finalizamos la ejecución");
				} else {
					System.err.println("Opción erronea");
				}

			} catch (IOException ex) {
				System.out.println("Error: " + ex.getMessage());
			}
		} while (opcion != 0);

		saldoActual = cuenta1.getSaldo();
		System.out.println("El saldo actual es: " + saldoActual);
	}

}