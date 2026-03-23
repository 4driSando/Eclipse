package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio02_U09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ruta;

        do {
            System.out.println("Introduce una ruta:");
            ruta = sc.nextLine();

            if (!ruta.isEmpty()) {
                File f = new File(ruta);

                try {
                    muestraInfoRuta(f);
                } catch (FileNotFoundException e) {
                    System.err.println(e.getMessage());
                }
            }

        } while (!ruta.isEmpty());

        sc.close();
    }

    public static void muestraInfoRuta(File ruta) throws FileNotFoundException {

        if (!ruta.exists()) {
            throw new FileNotFoundException("La ruta no existe");
        }

        if (ruta.isFile()) {
            System.out.println("[A] " + ruta.getName());
        } else if (ruta.isDirectory()) {

            File[] lista = ruta.listFiles();
            Arrays.sort(lista, new ComparaPorNombre());

            for (File f : lista) {
                if (f.isDirectory()) {
                    System.out.println("[*] " + f.getName() + "\t| Tamaño: " + f.length() + "kb \t| Última modificación: " + mostrarFecha(f));
                }
            }

            for (File f : lista) {
                if (f.isFile()) {
                    System.out.println("[A] " + f.getName() + "\t| Tamaño: " + f.length() + "kb \t| Última modificación: " + mostrarFecha(f));
                }
            }
        }
    }
    
    public static Date mostrarFecha(File f) {
		Date fecha = new Date(f.lastModified());
    	return fecha;
    	// SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    }
}

class ComparaPorNombre implements Comparator<File> {

	@Override
	public int compare(File uno, File otro) {
		return Integer.compare(uno.getName().hashCode(), otro.getName().hashCode());
	}
	
}