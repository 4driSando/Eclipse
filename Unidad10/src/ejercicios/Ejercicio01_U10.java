package ejercicios;

public class Ejercicio01_U10 {

	public static void main(String[] args) {
		
		Contenedor<String> cont = new Contenedor<String>(args);
		
		cont.extraerDelFinal();
		cont.insertarAlPrincipio("Zorro");
		cont.insertarAlFinal("Adri");
		cont.insertarAlFinal("Lhanzzz");
		cont.insertarAlPrincipio("Cesputa");
		
		cont.extraerDelFinal();
		
		cont.extraerDelPrincipio();
		
		
//		cont.ordenar();
		
		System.out.println(cont);

	}

}
