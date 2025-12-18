package ejercicios;

import java.util.Scanner;

public class MorrocotuGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sube, daño, cura, cambiar;
		
		Personaje sandoval = new Personaje(1, "Sandoval");	
		System.out.println(sandoval);
		
		System.out.println("Subir de nivel");
		sube = sc.nextInt();	
		System.out.println(sandoval.subirNivel(sube));
		System.out.println(sandoval);
		
		System.out.println("Recibir daño");
		daño = sc.nextInt();
		System.out.println(sandoval.recibirDanio(daño));
		System.out.println(sandoval);
		
		System.out.println("Curar");
		cura = sc.nextInt();
		System.out.println(sandoval.curar(cura));
		System.out.println(sandoval);
		
		System.out.println("Está vivo?");
		System.out.println(sandoval.estaVivob());
		
		System.out.println("Cambiar rol");
		System.out.println("1. Arquero\n2. Guerrero\n3. Mago");
		cambiar = sc.nextInt();	
		System.out.println(sandoval.cambiarRol(cambiar));
		System.out.println(sandoval);
		
		
		sc.close();
	}

}
