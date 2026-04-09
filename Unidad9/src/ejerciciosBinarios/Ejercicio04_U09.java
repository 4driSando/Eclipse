package ejerciciosBinarios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio04_U09 {

	public static void main(String[] args) {

		// Introduce por teclado una frase y guárdala en un archivo binario. A
		// continuación, recupérala y muéstrala por pantalla.
		
		Scanner sc = new Scanner(System.in);
		try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("frase.dat"))) {
			
			String frase = sc.nextLine();
			salida.writeUTF(frase);
			
		} catch (IOException ioe) {
			System.out.println(ioe);
		}

		
		sc.close();
	}

}
