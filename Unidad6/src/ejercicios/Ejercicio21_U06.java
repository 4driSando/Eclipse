package ejercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio21_U06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int respuesta;

		// Colecciones instanciadas
		TreeSet<Alumno> autistas = new TreeSet<Alumno>();
		TreeSet<Alumno> autistas2 = new TreeSet<Alumno>(new CompararPorNombre());
		TreeSet<Alumno> autistas3 = new TreeSet<Alumno>(new ComparadorCurso());
		ArrayList<Alumno> autism = new ArrayList<Alumno>();

		// Alumnos instanciados
		Alumno iñaki = new Alumno("Iñaki Lovato Martín", 19, 1);
		Alumno lhanz = new Alumno("Lhanz Palma Briones", 20, 1);
		Alumno sandoval = new Alumno("Adrián Pérez Sandoval", 19, 1);
		Alumno ventresca = new Alumno("José Antonio Ventresca Rojas", 20, 2);
		Alumno hector = new Alumno("Héctor Moreno Santiso", 20, 2);
		Alumno cespedes = new Alumno("Alejandro Céspedes", 20, 2);
		Alumno samuel = new Alumno("Samuel Jon Pérez Waldie", 19, 1);
		Alumno hanser = new Alumno("Hanser Onelix Pérez Osorno", 19, 2);

		// Alumnos agregados a las colecciones
		autism.add(cespedes);
		autism.add(ventresca);
		autism.add(samuel);
		autism.add(hanser);
		autism.add(iñaki);
		autism.add(lhanz);
		autism.add(sandoval);
		autism.add(hector);

		for (Alumno a : autism) {
			autistas.add(a);
			autistas2.add(a);
			autistas3.add(a);
		}

		// do while con el menú
		do {
			System.out.println("\nMENÚ DE COLECCIONES");
			System.out.println("1. Mostrar todos los alumnos del ArrayList");
			System.out.println("2. Mostrar todos los alumnos del TreeSet");
			System.out.println("3. Mostrar todos los alumnos del ArrayList ordenados por nombre");
			System.out.println("4. Mostrar todos los alumnos del TreeSet ordenados por nombre");
			System.out.println("5. Mostrar todos los alumnos del ArrayList ordenados por curso, nombre");
			System.out.println("6. Mostrar todos los alumnos del TreeSet ordenados por curso, nombre");
			System.out.println("7. Salir");
			respuesta = sc.nextInt();

			switch (respuesta) {
			case 1:
				System.out.println("\nTodos los alumnos del ArrayList");
				for (Alumno a : autism) {
					System.out.println(a);
				}
				break;

			case 2:
				System.out.println("\nTodos los alumnos del TreeSet");
				for (Alumno a : autistas) {
					System.out.println(a);
				}
				break;

			case 3:
				System.out.println("\nTodos los alumnos del ArrayList ordenados por nombre");
				autism.sort(new CompararPorNombre());
				for (Alumno a : autism) {
					System.out.println(a);
				}
				break;

			case 4:
				System.out.println("\nTodos los alumnos del TreeSet ordenados por nombre");
				for (Alumno a : autistas2) {
					System.out.println(a);
				}
				break;

			case 5:
				System.out.println("\nTodos los alumnos del ArrayList ordenados por curso, nombre");
				autism.sort(new ComparadorCurso());
				for (Alumno a : autism) {
					System.out.println(a);
				}
				break;

			case 6:
				System.out.println("\nTodos los alumnos del TreeSet ordenados por curso, nombre");
				for (Alumno a : autistas3) {
					System.out.println(a);
				}
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

}

class CompararPorNombre implements Comparator<Alumno> {
	public int compare(Alumno a1, Alumno a2) {
		int variable;

		if (a1.equals(a2)) {
			variable = 0;
		} else {
			variable = a1.getNombre().compareTo(a2.getNombre());
		}
		return variable;
	}
}

class ComparadorCurso implements Comparator<Alumno> {
	@Override
	public int compare(Alumno a1, Alumno a2) {
		int resultado = Integer.compare(a1.getCurso(), a2.getCurso());

		if (resultado == 0) {
			resultado = a1.getNombre().compareTo(a2.getNombre());
		}

		return resultado;
	}
}