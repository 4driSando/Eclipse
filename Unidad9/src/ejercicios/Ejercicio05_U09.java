package ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio05_U09 {

	public static void main(String[] args) {
	
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Documentos/NumerosPrimos.txt"));
				
			for (int i = 0; i < 500; i++) {		
				if (i == 2 || i == 3 || i == 5) {
					bw.write(i + "\n");
				} else if (i % 2 == 0) {
				} else if (i % 3 == 0) {
				} else if (i % 5 == 0) {
				} else {
					bw.write(i + "\n");
				}
			}
			
			bw.close();
			
		} catch (IOException e) {
			System.err.println("Error");
		}
		
	}

}
