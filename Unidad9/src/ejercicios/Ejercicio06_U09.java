package ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio06_U09 {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new FileReader("Documentos/NumerosPrimos.txt"));
			String linea = "";

			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			
			br.close();
			 
		} catch (FileNotFoundException e) {
			System.err.println("Error");
		} catch (IOException e) {
			System.err.println("Error");
		}

	}

}
