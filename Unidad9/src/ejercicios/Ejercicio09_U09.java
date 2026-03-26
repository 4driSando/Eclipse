package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio09_U09 {

	public static void main(String[] args) {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("Documentos/alumnos_notas.txt"));
			String linea;
			String[] Alumnos = new String[10];
			
			while ((linea = br.readLine()) != null) {
				
			}

			 
		} catch (Exception e) {
			System.err.println("Error leyendo el archivo");
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
