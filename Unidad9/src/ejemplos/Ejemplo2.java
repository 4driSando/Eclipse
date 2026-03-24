package ejemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String respuesta = "";

		do {
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("Documentos/Papois.txt"));

				System.out.println("Añade papois (\"exit\" para salir)");
				respuesta = sc.nextLine();
				bw.write(respuesta);

				bw.close();

			} catch (IOException e) {
				System.out.println("No se ha podido leer");
			}

		} while (!respuesta.equalsIgnoreCase("exit"));
		
		sc.close();
	}
}
