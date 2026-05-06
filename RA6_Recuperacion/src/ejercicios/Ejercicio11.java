package ejercicios;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		HashMap<String, String> mapa = new HashMap<String, String>();
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
				mapa.put(psswd, username);
				break;

			case 2:
				int contador = 0;
				do {
					System.out.print("Nombre de usuario: ");
					String usernamePrueba = sc.next();
					if (mapa.containsValue(usernamePrueba)) {
						int contador2 = 0;
						do {
							System.out.print("Contraseña: ");
							String psswdPrueba = sc.next();
							if (mapa.containsKey(psswdPrueba)) {
								System.out.println("Acceso permitido!");
								break;
							} else {
								System.err.println("Contraseña Incorrecta, vuelva a intentarlo");
								contador2++;
							}
						} while (contador2 != 3);
						break;
					} else {
						System.err.println("Nombre de usuario no encontrado\n");
						contador++;
						if (contador == 3) {
							System.err.println("Límite de errores alcanzado");
						}
					}
				} while (contador != 3);
				break;

			case 3:
				System.out.println("\n");
				int i = 1;
				for (Entry<String, String> entry : mapa.entrySet()) {
					System.out.println(i + ". " + entry.getValue());
					i++;
				}
				int contador1 = 0;
				do {
					System.out.println("Usuario a eliminar: ");
					String userRmv = sc.next();
					if (mapa.containsValue(userRmv)) {
						int contador2 = 0;
						do {
							System.out.print("Contraseña: ");
							String psswdPrueba = sc.next();
							if (mapa.containsKey(psswdPrueba)) {
								System.out.println("Usuario eliminado correctamente!");
								mapa.remove(psswdPrueba);
								break;
							} else {
								System.err.println("Contraseña Incorrecta, vuelva a intentarlo");
								contador2++;
							}
						} while (contador2 != 3);
						break;
					} else {
						System.err.println("Nombre de usuario no encontrado\n");
						contador1++;
						if (contador1 == 3) {
							System.err.println("Límite de errores alcanzado");
						}
					}
				} while (contador1 != 3);

				break;

			case 4:
				System.out.println("Gracias por usar el gestor de cuentas morrocotudo!\nSaliendo...");
				break;

			default:
				System.out.println("Opción no válida");
				break;
			}

		} while (respuesta != 4);

		sc.close();

	}

}
