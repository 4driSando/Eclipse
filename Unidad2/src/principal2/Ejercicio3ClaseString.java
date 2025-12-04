package principal2;

import java.util.*;

public class Ejercicio3ClaseString {

	public static void main(String[] args) {

		String palabra;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una palabra para saber su primera y última letra:");
		palabra = sc.next();
		char primera = palabra.charAt(0);
		char ultima = palabra.charAt(palabra.length() - 1);

		System.out.println("La primera letra es " + primera + " y la última es " + ultima);
	}
}
