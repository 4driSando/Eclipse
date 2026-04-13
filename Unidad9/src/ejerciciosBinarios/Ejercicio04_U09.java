package ejerciciosBinarios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio04_U09 {

	public static void main(String[] args) {

		// Introduce por teclado una frase y guárdala en un archivo binario. A
		// continuación, recupérala y muéstrala por pantalla.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase:");

		try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("frase.dat"))) {
			
			String frase = sc.nextLine();
			salida.writeUTF(frase);
			
		} catch (IOException ioe) {
			System.out.println(ioe);
		}

		System.out.println("\nEsta es su frase: ");
		try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("frase.dat"))) {

			while (true) {
				String frase = entrada.readUTF();
				System.out.println(frase);
			}

		} catch (EOFException ex) {
			System.out.println("Fin de fichero");
		} catch (IOException ex) {
			System.out.println(ex);
		}
				
		sc.close();
	}

}
