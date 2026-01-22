package ejercicios;

import java.util.HashMap;

public class PruebaHashMap {

	public static void main(String[] args) {
		
		HashMap<Double, Persona> Map = new HashMap<>();
		
		Persona compi = new Persona("Iñaki", 12);
		Persona compi2 = new Persona("Lhanz", 20);
		Persona compi3 = new Persona("Céspedes", 19);
		Persona compi4 = new Persona("Ventresca", 20);
		Persona compi5 = new Persona("Arón", 19);
		Persona compi6 = new Persona("Noelia", 28);
		Persona compi7 = new Persona("Sandoval", 19);
		
		Map.put(1.5, compi);
		Map.put(26.4, compi2);
		Map.put(0.6, compi3);
		Map.put(12.89, compi4);
		Map.put(4.20, compi5);
		Map.put(79.0, compi6);
		Map.put(null, compi7);
		Map.put(56.65, compi);
		
		
		for(Double clave : Map.keySet()) {
			System.out.println("Clave: " + clave + "\t Alumno: " + Map.get(clave));
		}
		
		System.out.println(Map.entrySet());

	}

}
