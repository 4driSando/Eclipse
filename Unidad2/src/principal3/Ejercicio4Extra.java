package principal3;

import java.util.Scanner;

public class Ejercicio4Extra {

	public static void main(String[] args) {
		
		/*
		 * Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay
		 * (cuantas ‘a’,cuantas ‘e’, etc.) en una frase introducida por teclado. No se
		 * debe diferenciar entre mayúsculas y minúsculas. Por ejemplo dada la frase “Mi
		 * mama me mima” dirá que hay: • No de A's: 3 • No de E's: 1 • No de I's: 2 • No
		 * de O's: 0 • No de U's: 0
		 */
		
		String frase; 
		char letra;
		int totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase para contar vocales");
		frase = sc.nextLine();
		frase = frase.toLowerCase();
		
		for(int i = 0; i < frase.length(); i++) {
			letra = frase.charAt(i);
			switch (letra) {
			case 'a', 'á':
				totalA++;
			break;
			case 'e', 'é':
				totalE++;
			break;
			case 'i', 'í':
				totalI++;
			break;	
			case 'o', 'ó':
				totalO++;
			break;	
			case 'u', 'ú':
				totalU++;
			break;	
			}
		}
		System.out.println("Nº de A's: " + totalA);
		System.out.println("Nº de E's: " + totalE);
		System.out.println("Nº de I's: " + totalI);
		System.out.println("Nº de O's: " + totalO);
		System.out.println("Nº de U's: " + totalU);
		}
		
		
}
