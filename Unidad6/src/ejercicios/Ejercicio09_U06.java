package ejercicios;

public class Ejercicio09_U06 {

	public static void main(String[] args) {
		
		Persona compi = new Persona("Iñaki", 19);
		Persona compi2 = new Persona("Iñaki", 18);
		
		System.out.println(compi);
		System.out.println(compi2);
		System.out.println(compi.equals(compi2));

	}

}
