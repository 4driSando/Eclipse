package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		// Implementa el control de acceso al área restringida de un programa. Se debe
		// pedir un nombre de usuario y una contraseña. Si el usuario introduce los
		// datos correctamente, el programa dirá “Ha accedido al área restringida”. El
		// usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
		// el programa dirá “Lo siento, no tiene acceso al área restringida”. Los
		// nombres de usuario con sus correspondientes contraseñas deben estar
		// almacenados en una estructura de la clase HashMap.

		HashMap<String, String> area = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		int respuesta;

		do {
			System.out.println("\nMenú de acceso");
			System.out.println("1. Registrarse");
			System.out.println("2. Iniciar sesión");
			System.out.println("3. Eliminar cuenta");
			System.out.println("4. Salir");
			respuesta = sc.nextInt();

			switch (respuesta) {

			case 1:
				System.out.print("Nombre de usuario: ");
				String username = sc.next();
				System.out.print("Contraseña: ");
				String psswd = sc.next();
				area.put(psswd, username);
				break;

			case 2:
				// Arreglar esto
				int contador = 0;
				do {
				System.out.print("Nombre de usuario: ");
				String usernamePrueba = sc.next();
					if (area.containsValue(usernamePrueba)) {
						int contador2 = 0;
						do {
							System.out.print("Contraseña: ");
							String psswdPrueba = sc.next();
							if (area.containsKey(psswdPrueba)) {
								System.out.println("Acceso permitido!");
							} else {
								System.err.println("Contraseña Incorrecta, vuelva a intentarlo");
								contador2++;
							}

						} while (contador2 < 3);
					}
				} while (contador < 3);

				break;

			case 3:

				break;

			case 4:

				break;

			default:
				break;
			}

		} while (respuesta != 4);

	}

}
