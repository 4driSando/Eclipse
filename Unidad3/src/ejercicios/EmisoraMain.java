package ejercicios;

import java.util.Scanner;

public class EmisoraMain {

	public static void main(String[] args) {

		Emisora e_1 = new Emisora();
		String respuesta;
		Scanner sc = new Scanner(System.in);

		System.out.println("Su radio está en la frecuencia 80Mhz");
		System.out.println("Desea subir o bajar la frecuencia?");

		do {
			System.out.println("(subir=up, bajar=down, \"display\" para mostrar, \"exit\" para terminar)");
			respuesta = sc.next();
			
			switch (respuesta.toLowerCase()) {
			case "up":
				e_1.setFrecuencia(e_1.upF());
				break;

			case "down":
				e_1.setFrecuencia(e_1.downF());
				break;

			case "display":
				e_1.displayF();
				break;
				
			case "exit":
				e_1.exitF();
				break;
					
			default:
				System.err.println("Lo introducido no es válido, vuelva a probar");
				break;
			}
		} while (!respuesta.equals("exit"));
		
		
		sc.close();
	}
}
