package ejercicios;

public class Ejercicio1_U10 {

	public static void main(String[] args) {
		
		Contenedor<String> cont = new Contenedor<String>();
		
		cont.insertarAlPrincipio("Hola");
		
		System.out.println(cont);
		
		cont.insertarAlPrincipio("Papoi");
		
		System.out.println(cont);


	}

}
