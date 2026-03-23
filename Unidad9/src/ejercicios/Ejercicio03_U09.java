package ejercicios;

import java.io.File;

public class Ejercicio03_U09 {

	public static void main(String[] args) {

		File documentos = new File("Documentos");
		File docs = new File("DOCS");
		documentos.renameTo(docs);

		File fotografias = new File("/DOCS/Fotografias");
		File fotos = new File("FOTOS");
		fotografias.renameTo(fotos);

		File libros = new File("/DOCS/Libros");
		File lecturas = new File("LECTURAS");
		libros.renameTo(lecturas);

	}

	public static void eliminarExtension(File directorio1) {

		File[] directorio = directorio1.listFiles();
		
		for (File f : directorio) {
			if(f.isFile()) {
				String nombre = f.getName();
				
				if (nombre.contains(".")) {
					String nuevoNombre = nombre.substring(0);
					
				}
				
			}
		}
	}
}
