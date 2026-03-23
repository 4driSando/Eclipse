package ejemplos;

import java.io.File;

public class Ejemplo1 {

	public static void main(String[] args) {

		File rutaFotoLhanz = new File("Papois/Lhanz.jpg");
		File carpetas = new File("Fotos");
		
		System.out.println(rutaFotoLhanz.isAbsolute());
		

	}

}
