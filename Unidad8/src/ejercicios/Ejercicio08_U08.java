package ejercicios;

import java.util.Scanner;

public class Ejercicio08_U08 {

	public static void main(String[] args) {

		CuentaAhorro cA1 = new CuentaAhorro("ES5409-1734-9734", 200, 20);
		CuentaCorriente cC1 = new CuentaCorriente("ES5489-8319-0435", 400, 20);

		Scanner sc = new Scanner(System.in);
		int respuesta1, dinero;

		do {
			System.out.println("\nBANCO MORROCOTUDO");
			System.out.println("-----------------");
			System.out.println("1. Ingresar Dinero");
			System.out.println("2. Retirar Dinero");
			System.out.println("3. Traspasar Dinero");
			System.out.println("4. Consultar Saldo con Interés Anual");
			System.out.println("5. Consultar Cuenta");
			System.out.println("5. Salir");
			respuesta1 = sc.nextInt();

			switch (respuesta1) {
			case 1:
				System.out.println("Introduce cantidad de dinero a ingresar");
				dinero = sc.nextInt();
				cC1.ingresarDinero(dinero);
				break;

			case 2:
				System.out.println("Introduce cantidad de dinero a retirar");
				dinero = sc.nextInt();
				cC1.retirarDinero(dinero);
				break;

			case 3:
				System.out.println("Introduce cantidad de dinero a traspasar a la cuenta de ahorro");
				dinero = sc.nextInt();
				cC1.traspasarDinero(dinero, cA1);
				break;
			case 4:
				System.out.println(cC1.calcularInteres());
				System.out.println(cA1.calcularInteres());
				break;
				
			case 5:
				System.out.println(cC1);
				System.out.println(cA1);
				break;
				
			case 6:
				System.out.println("Saliendo del banco morrocotudo...");

				break;
			default:
				System.out.println("Opción no válida");
				break;
			}

		} while (respuesta1 != 6);
		
		sc.close();

	}

}
