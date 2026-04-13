package ejerciciosBinarios;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio06_U09 {

	public static void main(String[] args) {

		TreeSet<String> nombres = new TreeSet<>();

		// Leer fichero
		try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("nombres.dat"))) {
			while (true) {
				nombres.add(entrada.readUTF());
			}
		} catch (EOFException e) {
			// fin normal
		} catch (IOException e) {
			System.out.println("No hay fichero aún");
		}

		// Pedir nombres
		Scanner sc = new Scanner(System.in);
		String nombre;

		do {
			System.out.println("Introduce un nombre:");
			nombre = sc.next();

			if (!nombre.equalsIgnoreCase("fin")) {
				nombres.add(nombre);
			}

		} while (!nombre.equalsIgnoreCase("fin"));

		sc.close();

		// Guardar fichero
		try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("nombres.dat"))) {

			for (String n : nombres) {
				salida.writeUTF(n);
			}

		} catch (IOException e) {
			System.err.println(e);
		}
	}
}