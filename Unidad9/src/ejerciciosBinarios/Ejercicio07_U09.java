package ejerciciosBinarios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio07_U09 {

	public static void main(String[] args) {

		// Escribe un texto, línea a línea, de forma que, cada vez que se pulse Intro,
		// se guarde la línea en un archivo binario. El proceso se termina cuando
		// introduzcamos una línea vacía. Después el programa lee el texto completo del
		// archivo y lo muestra por pantalla.

		Scanner sc = new Scanner(System.in);
		String linea;

		System.out.println("Escriba líneas de texto: ");

		try (ObjectOutputStream entrada = new ObjectOutputStream(new FileOutputStream("Lineas.dat"))) {

			while (true) {
				linea = sc.nextLine();
				if (!linea.isEmpty()) {
					entrada.writeUTF(linea);
				} else {
					break;
				}
			}

		} catch (IOException ioe) {
			System.out.println(ioe);
		}

		try (ObjectInputStream salida = new ObjectInputStream(new FileInputStream("Lineas.dat"))) {

			while (true) {
				String linea2 = salida.readUTF();
				System.out.println(linea2);
			}

		} catch (EOFException eof) {
		} catch (IOException ioe) {
		    System.out.println(ioe);
		}

		sc.close();
	}

}
