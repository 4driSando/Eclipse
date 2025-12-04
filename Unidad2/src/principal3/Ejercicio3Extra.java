package principal3;

import java.util.Scanner;

public class Ejercicio3Extra {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida por teclado tres cadenas de texto: nombre y dos
		 * apellidos. Luego mostrará un código de usuario (en mayúsculas) formado por la
		 * concatenación de las tres primeras letras de cada uno de ellos. Por ejemplo
		 * si se introduce “Juan”, “Moreno” y “Carmona” mostrará “JUAMORCAR”.
		 * 
		 */
		
		String nombre, apellido1, apellido2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre completo para crearte un usuario");
		System.out.println("Nombre");
		nombre = sc.next();
		nombre = nombre.toUpperCase();
		
		System.out.println("Primer apellido");
		apellido1 = sc.next();
		apellido1 = apellido1.toUpperCase();
		
		System.out.println("Segundo apellido");
		apellido2 = sc.next();
		apellido2 = apellido2.toUpperCase();
		
		System.out.println("Tu nombre de usuario es " + nombre.substring(0, 3) + apellido1.substring(0, 3) + apellido2.substring(0, 3));
	}

}
