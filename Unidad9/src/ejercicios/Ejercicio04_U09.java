package ejercicios;

import java.io.File;

public class Ejercicio04_U09 {

	public static void main(String[] args) {

		File misCosas = new File("Documentos/MisCosas");
		misCosas.mkdir();
		
		File alfabeto = new File("Documentos/Alfabeto");
		alfabeto.mkdir();
		
		File a = new File("Documentos/Alfabeto/A");
		a.mkdir();
		
		File b = new File("Documentos/Alfabeto/B");
		b.mkdir();
		
		File c = new File("Documentos/Alfabeto/C");
		c.mkdir();
			
		File libros = new File("Documentos/libros");
		File librosNuevos = new File("Documentos/MisCosas/Libros");
		libros.renameTo(librosNuevos);
		
		File fotos = new File("Documentos/Fotografias");
		File fotosNuevas = new File("Documentos/MisCosas/Fotografias");
		fotos.renameTo(fotosNuevas);

	}

}
