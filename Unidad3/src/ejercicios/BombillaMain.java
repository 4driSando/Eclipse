package ejercicios;

import java.util.Scanner;

public class BombillaMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int bombilla, accion;

		Bombilla b_1 = new Bombilla();
		Bombilla b_2 = new Bombilla();
		Bombilla b_3 = new Bombilla();
		Bombilla b_4 = new Bombilla();
		Bombilla b_5 = new Bombilla();
		Bombilla b_6 = new Bombilla();

		do {
			System.out.println("--------MENÚ--------");
			System.out.println("Elige bombilla (1-6)");
			System.out.println("7. Encender general");
			System.out.println("8. Apagar general");
			System.out.println("9. Salir");
			bombilla = sc.nextInt();

			// Al recibir 9 salta y se acaba
			if (bombilla == 9)
				break;

			// Al recibir 7 enciende general
			if (bombilla == 7) {
				Bombilla.encenderGeneral();
				System.out.println("Interruptor general encendido.");
				continue;
			}

			// Al recibir 8 apaga general
			if (bombilla == 8) {
				Bombilla.apagarGeneral();
				System.out.println("Interruptor general apagado.");
				continue;
			}

			System.out.println("1. Encender");
			System.out.println("2. Apagar");
			System.out.println("3. Ver estado");
			accion = sc.nextInt();

			// Creo bombilla con valor null para darle valor más adelante
			// y poder indicar su estado
			Bombilla seleccionada = null;

			switch (bombilla) {
			case 1:
				seleccionada = b_1;
				break;
			case 2:
				seleccionada = b_2;
				break;
			case 3:
				seleccionada = b_3;
				break;
			case 4:
				seleccionada = b_4;
				break;
			case 5:
				seleccionada = b_5;
				break;
			case 6:
				seleccionada = b_6;
				break;
			default:
				System.err.println("Bombilla NO válida");
				break;
			}

			if (seleccionada != null) {
				switch (accion) {
				case 1:
					seleccionada.encender();
					break;
				case 2:
					seleccionada.apagar();
					break;
				case 3:
					if (seleccionada.estaEncendida()) {
						System.out.println("Estado: Encendida");
					} else {
						System.out.println("Estado: Apagada");
					}
					break;
				default:
					System.err.println("Acción NO válida");
					break;
				}

			}

		} while (true);

		System.out.println("Gracias por usar mi gestión de bombillas morrocotudas");
	}
}
