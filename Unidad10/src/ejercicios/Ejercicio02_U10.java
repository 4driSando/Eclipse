package ejercicios;

import java.util.Random;

public class Ejercicio02_U10 {

	public static void main(String[] args) {
		
		Contenedor<Integer> cont = new Contenedor<Integer>(null);
		Random rand = new Random();
		
		cont.insertarAlFinal(1);
		
		for (int i = 0; i < 30; i++) {
			int aleatorio = rand.nextInt(10); // 0-9
			cont.insertarAlPrincipio(aleatorio);
		}
		
		cont.ordenar();
		System.out.println(cont);
		
		// Revisar por que no funciona
	}

}
