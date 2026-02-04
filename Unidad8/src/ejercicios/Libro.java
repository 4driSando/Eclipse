package ejercicios;

import java.time.LocalDate;

public class Libro extends Publicacion {

	private String autor;
	
	public Libro(String codigo, String titulo, LocalDate fechaPublic, int paginas, String autor) {
		super(codigo, titulo, fechaPublic, paginas);
		this.setAutor(autor);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
