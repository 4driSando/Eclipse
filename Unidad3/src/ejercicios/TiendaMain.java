package ejercicios;

import java.util.Scanner;

public class TiendaMain {

	public static void main(String[] args) {

		Artículo[] catálogo = new Artículo[3];
		Scanner sc = new Scanner(System.in);
		int respuesta1;
		
		System.out.println("TIENDA MORROCOTUDA DE SANDOVAL");
		do {
			System.out.println("Qué quieres hacer");
			System.out.println("1. Agregar producto");
			System.out.println("2. Mostrar todos los productos");
			System.out.println("3. Buscar producto por nombre");
			System.out.println("4. Comprar producto");
			System.out.println("5. Añadir stock a un producto");
			System.out.println("6. Salir");
			respuesta1 = sc.nextInt();
			
			switch (respuesta1) {
			case 1:
				System.out.println();
				break;
			}

			
		}while(respuesta1 != 6);
	}

}
