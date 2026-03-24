package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio07_U09 {

	public static void main(String[] args) {
		
		int numMax = Integer.MIN_VALUE;
		int numMin = Integer.MAX_VALUE;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("Documentos/numeros.txt"));
			String linea;

			while ((linea = br.readLine()) != null) {
				int num = Integer.parseInt(linea);
				
				if (num > numMax) {
					numMax = num;
				}
				
				if (num < numMin) {
					numMin = num;
				}
			}
			
			br.close();
			 
		} catch (IOException e) {
			System.err.println("Error leyendo el archivo");
		}
		
		System.out.println("Número máx: " + numMax);
		System.out.println("Número min: " + numMin);
	}
}