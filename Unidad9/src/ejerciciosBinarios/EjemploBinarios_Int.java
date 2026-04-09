package ejerciciosBinarios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EjemploBinarios_Int {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("numeros.dat"))) {
			System.out.print("Introduce entero: ");

			int numero = s.nextInt();
			while (numero >= 0) {
				salida.writeInt(numero);
				System.out.print("Introduce entero: ");
				numero = s.nextInt();
			}
		} catch (IOException ex) {
			System.out.println(ex);
		}
		try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("numeros.dat"));) {
			while (true) {
				int numero = entrada.readInt();
				System.out.println(numero + "");
			}
		} catch (EOFException ex) {
			System.out.println("Fin de fichero");
		} catch (IOException ex) {
			System.out.println(ex);
		}
		
		s.close();
	}
}
