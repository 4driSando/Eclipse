package ejercicios;

import java.util.Scanner;

public class PruebasExpresiones {

	public static void main(String[] args) {

		String respuesta;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 20; i++) {
		
		System.out.println("Escribe una palabra entre 5 y 8 letras");
		respuesta = sc.nextLine();
		if (respuesta.matches("\\w{5,8}")) {
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}

		System.out.println("3 letras, 5 números y un guión");
		respuesta = sc.nextLine();
		if (respuesta.matches("[a-zA-Z]{3}[0-9]{5}[-]{1}")) {
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		
		
		System.out.println("Comprobar que contenga hola u Hola");
		respuesta = sc.nextLine();
		if (respuesta.matches(".*hola.*")) {
			System.out.println("Hola u hola detectado");
		} else {
			System.out.println("Incorrecto");
		}
		
		
		System.out.println("Comprobar que no hay ni hola, ni Hola");
		respuesta = sc.nextLine();
		if (!respuesta.matches("!.*Hola.*|.*hola.*")) {
			System.out.println("Hola u hola detectado");
		} else {
			System.out.println("Incorrecto");
		}
			
		System.out.println("Comprobar hola 3 veces");
		respuesta = sc.nextLine();
		if (respuesta.matches("(.*hola.*){3}")) {
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		
		System.out.println("Comprobar que empiece por hola y acabe por Pepe");
		respuesta = sc.nextLine();
		if (respuesta.matches("^hola.*Pepe$")) {
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		}
		sc.close();
	}

}
