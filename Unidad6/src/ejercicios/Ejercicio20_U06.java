package ejercicios;

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio20_U06 {

	public static void main(String[] args) {

		int respuesta;
		Scanner sc = new Scanner(System.in);
		HashSet<Empleado> empleados = new HashSet<Empleado>();
		empleados.add(new Empleado("Iñaki", 750));
		empleados.add(new Empleado("Lhanz", 1150));
		empleados.add(new Empleado("Céspedes", 2550));

		do {
			System.out.println("\nMENÚ EMPLEADOS MORROCOTUDOS");
			System.out.println("1. Introducir empleado");
			System.out.println("2. Listar empleados");
			System.out.println("3. Despedir empleado");
			System.out.println("4. Despedir a todos");
			System.out.println("5. Mostrar número de empleados");
			System.out.println("6. Buscar empleado");
			System.out.println("7. Salir");
			respuesta = sc.nextInt();
			sc.nextLine();

			switch (respuesta) {
			case 1:
				System.out.println("Nombre del empleado");
				String nombre = sc.nextLine();
				System.out.println("Sueldo de " + nombre);
				int sueldo = sc.nextInt();
				empleados.add(new Empleado(nombre, sueldo));
				break;

			case 2:
				System.out.println("\nLista Empleados Morrocotudos");
				System.out.println("----------------------------");
				for (Empleado e : empleados) {
					System.out.println(e);
				}
				break;

			case 3:
				System.out.println("Empleado a despedir");
				String nombre2 = sc.nextLine();
				Empleado encontrado = null;
				try {
					for (Empleado e : empleados) {
						if (e.getNombre().equals(nombre2)) {
							encontrado = e;
							break;
						}
					}
					System.out.println("Empleado " + encontrado.getNombre() + " despedido");
					empleados.remove(encontrado);
				} catch (NullPointerException e2) {
					System.out.println("Empleado no encontrado");
				}
				break;

			case 4:
				System.out.println("Despidiendo a todos los empleados...");
				empleados.removeAll(empleados);
				break;

			case 5:
				System.out.println("\nLa empresa morrocotuda tiene " + empleados.size() + " empleados");
				break;

			case 6:
				System.out.println("Empleado a buscar");
				String nombre3 = sc.nextLine();
				System.out.println(buscarEnHashSet(empleados, nombre3));
				break;

			case 7:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opción no válida");
				break;
			}
		} while (respuesta != 7);

		sc.close();

	}

	public static String buscarEnHashSet(HashSet<Empleado> empleados, String nombreBuscar) {
		String esta = "";
		for (Empleado e : empleados) {
			if (e.getNombre().equalsIgnoreCase(nombreBuscar)) {
				System.out.println("Empleado encontrado");
				esta = e.toString();
				break;
			} else {
				System.out.println("Empleado no encontrado");
				break;
			}
		}
		return esta;
	}
}
