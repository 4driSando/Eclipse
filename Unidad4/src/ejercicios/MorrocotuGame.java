package ejercicios;

import java.util.Scanner;

public class MorrocotuGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion, sube, daño, cura, cambiar;
		
		System.out.println("--- BIENVENIDO AL MORROCOTUGAME ---");
		System.out.print("Introduce el nombre de tu personaje: ");
		String nombreElegido = sc.nextLine();
		
		Personaje personaje1 = new Personaje(1, nombreElegido);	
		System.out.println("¡Personaje creado con éxito!");
		System.out.println(personaje1);

		do {
			System.out.println("\nMenú de opciones:");
			System.out.println("1. Mostrar datos del personaje");
			System.out.println("2. Subir nivel");
			System.out.println("3. Recibir daño");
			System.out.println("4. Curar personaje");
			System.out.println("5. Cambiar rol");
			System.out.println("6. Comprobar si el personaje está vivo");
			System.out.println("0. Salir");
			System.out.print("Elige una opción: ");
			
			opcion = sc.nextInt();

			switch (opcion) {
				case 1:
					System.out.println(personaje1);
					break;
					
				case 2:
					System.out.println("Subir de nivel");
					sube = sc.nextInt();	
					System.out.println(personaje1.subirNivel(sube));
					System.out.println(personaje1);
					break;
					
				case 3:
					System.out.println("Recibir daño");
					daño = sc.nextInt();
					System.out.println(personaje1.recibirDanio(daño));
					System.out.println(personaje1);
					break;
					
				case 4:
					System.out.println("Curar");
					cura = sc.nextInt();
					System.out.println(personaje1.curar(cura));
					System.out.println(personaje1);
					break;
					
				case 5:
					System.out.println("Cambiar rol");
					System.out.println("1. Arquero\n2. Guerrero\n3. Mago");
					cambiar = sc.nextInt();	
					System.out.println(personaje1.cambiarRol(cambiar));
					System.out.println(personaje1);
					break;
					
				case 6:
					System.out.println("Está vivo?");
					System.out.println(personaje1.estaVivob());
					break;
					
				case 0:
					System.out.println("Saliendo del programa...");
					break;
					
				default:
					System.err.println("Esa opción no es válida compañerete");
					break;
			}
			
		} while (opcion != 0);
		
		sc.close();
	}
}