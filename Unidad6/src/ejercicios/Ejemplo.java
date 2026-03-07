package ejercicios;

import java.util.Comparator;
import java.util.TreeSet;

public class Ejemplo {

	public static void main(String[] args) {
		// Cuando la clase implementa Comparable, no es necesario hacer nada al crear el
		// TreeSet
		TreeSet<Persona2> personas = new TreeSet<Persona2>();
		// Como quiero usar un comparador distinto al de la clase, debo pasar al
		// constructor una
		// instancia del comparador que voy a utilizar, de debe implementar Comparator
		TreeSet<Persona2> personas2 = new TreeSet<Persona2>(new ComparadorPorNombre());
		TreeSet<Persona2> personas3 = new TreeSet<Persona2>(new ComparadorPorNombreDesc());
		TreeSet<Persona2> personas4 = new TreeSet<Persona2>(new ComparadorEdadNombre());

		
		personas.add(new Persona2("Juan", 30));
		personas.add(new Persona2("Ana", 25));
		personas.add(new Persona2("Pedro", 35));
		personas.add(new Persona2("Maria", 20));
		personas.add(new Persona2("Juan", 30));
		personas.add(new Persona2("Dani", 25));

		System.out.println("Personas con comparable, usando el orden natural definido (por edad): ");
		for (Persona2 persona : personas) {
			System.out.println(persona);
		}

		personas2.add(new Persona2("Juan", 30));
		personas2.add(new Persona2("Ana", 25));
		personas2.add(new Persona2("Pedro", 35));
		personas2.add(new Persona2("Maria", 20));
		personas2.add(new Persona2("Juan", 30));
		personas2.add(new Persona2("Dani", 25));
		System.out.println("Personas con comparator, usando un orden distinto al natural (por nombre): ");
		for (Persona2 persona : personas2) {
			System.out.println(persona);
		}

		personas3.add(new Persona2("Lobato", 19));
		personas3.add(new Persona2("Sandoval", 19));
		personas3.add(new Persona2("Ventresca", 21));
		personas3.add(new Persona2("Lhanz", 20));
		personas3.add(new Persona2("Céspedes", 19));
		personas3.add(new Persona2("Héctor", 19));
		System.out.println("Comparando personas por nombre descendente: ");
		for (Persona2 persona : personas3) {
			System.out.println(persona);
		}

		personas4.add(new Persona2("Pablo Motos", 58));
		personas4.add(new Persona2("Shakira", 50));
		personas4.add(new Persona2("Isabel", 50));
		personas4.add(new Persona2("Lhanz", 20));
		personas4.add(new Persona2("Lobato", 19));
		personas4.add(new Persona2("Sandoval", 19));		
		personas4.add(new Persona2("Aitana", 26));
		personas4.add(new Persona2("Plex", 23));
		personas4.add(new Persona2("Alejandro", 23));
		personas4.add(new Persona2("Maikel Yakson", 81));
		personas4.add(new Persona2("Florentino Pérez", 81));
		personas4.add(new Persona2("Ibai", 26));
		System.out.println("Comparando personas primero por edad y luego por nombre: ");
		for (Persona2 persona : personas4) {
			System.out.println(persona);
		}
	}
}

//Si necesito que la comparaci�n de una clase sea distinta a la que se ha definido como 
//natural en la misma, tengo que crear un comparator. Esta clase se puede crear en el 
//archivo del main, en un archivo espec�fico para ella, o en la propia clase del objeto 
//si queremos que tenga dos tipos de comparaciones
//Debemos implementar la interfaz Comparator, que contiene el m�todo compare, que hace 
//lo mismo que compareTo
class ComparadorPorNombre implements Comparator<Persona2> {
	@Override
	public int compare(Persona2 p1, Persona2 p2) {
		int variable;
		// Importante usar el mismo equal que tenga implementado la clase Persona
		if (p1.equals(p2)) {
			variable = 0;
		} else {// Para comparar dos String tenemos que usar el compare to, asi que devolvemos
				// directamtne lo que nos devuelva
			variable = p1.getNombre().compareTo(p2.getNombre());
		}
		return variable;
	}
}

class ComparadorPorNombreDesc implements Comparator<Persona2> {
	@Override
	public int compare(Persona2 p1, Persona2 p2) {
		int variable;

		if (p1.equals(p2)) {
			variable = 0;
		} else {
			variable = p2.getNombre().compareTo(p1.getNombre());
		}
		return variable;
	}
}

class ComparadorEdadNombre implements Comparator<Persona2> {
	@Override
	public int compare(Persona2 p1, Persona2 p2) {
		int resultado = Integer.compare(p1.getEdad(), p2.getEdad());
		
		if (resultado == 0) {
			resultado = p1.getNombre().compareTo(p2.getNombre());
		}
		
		return resultado;
	}
}