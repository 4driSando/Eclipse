package ejercicios;

import java.util.Scanner;

public class PersonaMain {

	public static void main(String[] args) {

		String nombre, apellidos, dni;
		int edad;
		Persona p1, p2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu nombre");
		nombre = sc.nextLine();
		System.out.println("Introduce tus apellidos");
		apellidos = sc.nextLine();
		System.out.println("Introduce tu edad");
		edad = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce tu DNI");
		dni = sc.nextLine();

		p1 = new Persona(nombre, apellidos, dni, edad);

		System.out.println("Introduce tu nombre");
		nombre = sc.nextLine();
		System.out.println("Introduce tus apellidos");
		apellidos = sc.nextLine();
		System.out.println("Introduce tu edad");
		edad = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce tu DNI");
		dni = sc.nextLine();

		p2 = new Persona(nombre, apellidos, dni, edad);

		System.out.println(p1);
		System.out.println(p2);

		sc.close();
	}
}
