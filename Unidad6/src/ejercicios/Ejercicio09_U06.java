package ejercicios;

import java.util.ArrayList;

public class Ejercicio09_U06 {

	public static void main(String[] args) {
		
		Persona compi = new Persona("Iñaki", 12);
		Persona compi2 = new Persona("Lhanz", 20);
		Persona compi3 = new Persona("Céspedes", 19);
		Persona compi4 = new Persona("Ventresca", 20);
		Persona compi5 = new Persona("Arón", 19);
		Persona compi6 = new Persona("Noelia", 28);
		
		ArrayList<Persona> clase = new ArrayList<>();
		clase.add(compi);
		clase.add(compi2);
		clase.add(compi3);
		clase.add(compi4);
		clase.add(compi5);
		clase.add(compi6);

		for(Persona nombre : clase) {
			System.out.println(nombre);
		}
	}

}
