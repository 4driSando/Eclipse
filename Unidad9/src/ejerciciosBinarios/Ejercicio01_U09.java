package ejerciciosBinarios;

import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio01_U09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("double.dat"))) {

			System.out.println("Introduce un doble: ");
			double numero = sc.nextDouble();
			salida.writeDouble(numero);
			System.out.println("Escrito con éxito");

		} catch (EOFException eof) {
			System.out.println("Final del fichero :)");
		} catch (IOException ioe) {
			System.out.println(ioe);
		}

		sc.close();

	}
}
