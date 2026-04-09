package ejerciciosBinarios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ejercicio03_U09 {

	public static void main(String[] args) {

		// Escribe un programa que escriba en un fichero binario una tabla de números
		// int y después lea el contenido del archivo y muestre el contenido de la tabla
		// por consola.

		Socio[] socios = new Socio[5];

		// Escritura
		try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("socios.dat"))) {

			socios[0] = new Socio("125", "Lhanz");
			socios[1] = new Socio("923", "Iñaki");
			socios[2] = new Socio("327", "Céspedes");
			socios[3] = new Socio("922", "Héctor");
			socios[4] = new Socio("856", "Sandoval");

			for (Socio socio : socios) {
				salida.writeObject(socio);
			}

		} catch (IOException ex) {
			System.out.println(ex);
		}

		// Lectura
		try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("socios.dat"));) {

			while (true) {
				Socio socio = (Socio) entrada.readObject();
				System.out.println(socio);
			}

		} catch (EOFException ex) {
			System.out.println("Fin de fichero");
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex);
		}

	}
}
