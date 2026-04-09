package ejerciciosBinarios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejercicio02_U09 {

	public static void main(String[] args) {

		try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("double.dat"));) {

			while (true) {
				double numero = entrada.readDouble();
				System.out.println(numero + "");
			}

		} catch (EOFException ex) {
			System.out.println("Fin de fichero");
		} catch (IOException ex) {
			System.out.println(ex);
		}

	}

}
