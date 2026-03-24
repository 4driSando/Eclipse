package ejercicios;

import java.io.File;

public class Ejercicio03_U09 {

	public static void main(String[] args) {

		File documentos = new File("Documentos");
		File docs = new File("DOCS");
		documentos.renameTo(docs);

		File fotografias = new File("DOCS/Fotografias");
		File fotos = new File("DOCS/FOTOS");
		fotografias.renameTo(fotos);

		File libros = new File("DOCS/Libros");
		File lecturas = new File("DOCS/LECTURAS");
		libros.renameTo(lecturas);
		
		eliminarExtension(fotos);
		eliminarExtension(lecturas);

	}

	public static void eliminarExtension(File directorio1) {

	    File[] directorio = directorio1.listFiles();

	    if (directorio != null) {
	        for (File f : directorio) {
	            if (f.isFile()) {
	                String nombre = f.getName();
	                int punto = nombre.lastIndexOf(".");

	                if (punto > 0) {
	                    String nuevoNombre = nombre.substring(0, punto);
	                    f.renameTo(new File(f.getParent(), nuevoNombre));
	                }
	            }
	        }
	    }
	}
}
