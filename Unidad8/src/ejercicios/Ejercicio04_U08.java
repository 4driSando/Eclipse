package ejercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04_U08 {

	public static void main(String[] args) {
		/**
		 * 1. Crear varias mascotas de distintos tipos (perros, gatos y loros) utilizando valores de prueba. 
		 * 2. Almacenar todas las mascotas en una única estructura de datos. 
		 * 3. Mostrar por pantalla todas las características de cada mascota. 
		 * 4. Hacer que todas las mascotas produzcan su sonido característico. 
		 * 5. Desparasitar a todos los perros del inventario. 
		 * 6. Hacer volar a los loros que puedan hacerlo. 
		 * 7. Volver a mostrar la información de todas las mascotas para comprobar los cambios realizados.
		 */

		ArrayList<Mascota> vet = new ArrayList<Mascota>();
		Perro inaki = new Perro("Iñaki", LocalDate.of(2006, 6, 22), "Caniche", true);
		Gato lhanz = new Gato("Lhanzz", LocalDate.of(2005, 8, 11), true, "Naranja");
		Loro cespedes = new Loro("AlexCes", LocalDate.of(2001, 9, 11), "Guatemala", "Cacatuoidea");
		Loro sando = new Loro("Sandoval", LocalDate.of(2006, 9, 25), "García Noblejas", "Agaporni");
		vet.add(inaki);
		vet.add(lhanz);
		vet.add(cespedes);
		vet.add(sando);
		
		Scanner sc = new Scanner(System.in);
		int respuesta1, respuesta2;
		
		do {
			System.out.println("VETERINARIO MORROCOTUDO");
			System.out.println("1. Mostrar información");
			System.out.println("2. Hacer su sonido característico");
			System.out.println("3. Volar loro");
			System.out.println("4. Desparasitar");
			System.out.println("5. Salir del veterinario");
			respuesta1 = sc.nextInt();
			
			switch (respuesta1) {
			case 1:
				for (Mascota mascotas : vet) {
				    System.out.println(mascotas);
				}
				break;

			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				System.out.println("Saliendo del veterinario mocorrotudo...");
				break;

			default:
				System.err.println("Ese número no es válido");
				break;
			}
			
			// mostrar animal
			// dependiendo del numero que haya cogido
			// sonido
			// desparasitar
			// volar
		} while (respuesta1 != 5);
		
		sc.close();
	}

}
