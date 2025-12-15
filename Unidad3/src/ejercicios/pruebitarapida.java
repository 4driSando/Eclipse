package ejercicios;

public class pruebitarapida {
	
	public static void main(String[] args) {
		
		String b = "Hola";
		Persona a = new Persona("Adrián", "Pérez" , "02733712R" , 19);
		
		System.out.println(b);
		cambiaB(b);
		System.out.println(b);
		
		
		System.out.println(a);
		System.out.println(a.getNombre());
		calcula(a);
		System.out.println(a.getNombre());
	}

	public static void calcula(Persona a) {
		a.setNombre("Iñaki");
	}
	
	public static void cambiaB(String b) {
		b = "Iñaki tontorrón";
	}
}