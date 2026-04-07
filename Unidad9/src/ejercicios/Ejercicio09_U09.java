package ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class Ejercicio09_U09 {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new FileReader("Documentos/alumnos_notas.txt"));
			TreeMap<String, Double> alumnos = new TreeMap<String, Double>();
			String linea;

			while ((linea = br.readLine()) != null) {
				
				String[] lineaActual = linea.split(" ");
				
				String nombre = lineaActual[0] + " " + lineaActual[1];
				System.out.println(nombre);
				
				int totalNotas = 0;
				double media = 0;
				
				for (int i = 2; i < lineaActual.length; i++) {
					media += Integer.parseInt(lineaActual[i]);
					totalNotas++;
				}
				
				media /= totalNotas;
				
				alumnos.put(nombre, media);
								
			}						
			br.close();			
			
		} catch (FileNotFoundException fnfe) {
			System.err.println("Error leyendo el archivo");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el archivo");
		}
	}
}