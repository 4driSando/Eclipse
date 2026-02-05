package ejercicios;

import java.time.LocalDate;

public class Libro extends Publicacion {

	private String autor;

	public Libro(String codigo, String titulo, LocalDate fechaPublic, int paginas, String autor) throws Exception {
		super(codigo, titulo, fechaPublic, paginas);
		this.setAutor(autor);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) throws Exception {
		if (autor == null) {
			throw new Exception("Autor no puede ser null");
		} else {
			this.autor = autor;
		}
	}

}
