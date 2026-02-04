package ejercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04_U08 {

	public static void main(String[] args) {

		ArrayList<Publicacion> bib = new ArrayList<>();
		Libro luna = new Libro("D105", "Luna de Plutón", LocalDate.of(2015, 10, 1), 105, "Dross");
		Libro troll = new Libro("R79", "El LibroTroll", LocalDate.of(2014, 5, 27), 79, "ElRubius");
		Libro secretos = new Libro("G255", "Los Secretos de Youtube", LocalDate.of(2018, 11, 9), 255, "Grefg");
		Revista hola = new Revista("H58", "Hola", LocalDate.of(2001, 9, 11), 58, 115);
		Revista interviu = new Revista("I69", "Interviu", LocalDate.of(2002, 2, 20), 69, 70);
		bib.add(luna);
		bib.add(troll);
		bib.add(secretos);
		bib.add(hola);
		bib.add(interviu);
		
		Scanner sc = new Scanner(System.in);
		int respuesta = 0;
		
		do {
			
		} while (respuesta != 5);
		
		sc.close();
	}

}
