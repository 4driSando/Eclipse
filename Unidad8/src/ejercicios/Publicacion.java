package ejercicios;

import java.time.LocalDate;

public class Publicacion {

	private String codigo;
	private String titulo;
	private LocalDate fechaPublic;
	private int paginas;

	public Publicacion(String codigo, String titulo, LocalDate fechaPublic, int paginas) throws Exception {
		this.setCodigo(codigo);
		this.setTitulo(titulo);
		this.setFechaPublic(fechaPublic);
		this.setPaginas(paginas);
	}

	public String devCodigo() {
		return getTitulo() + " Código: " + getCodigo();
	}

	public String devAñoPub() {
		return getTitulo() + " Año de publicación: " + getFechaPublic();
	}

	public String devNumPags() {
		return getTitulo() + " Nº de páginas: " + getPaginas();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) throws Exception {
		if (codigo == null || codigo != "") {
			this.codigo = codigo;
		} else {
			throw new Exception("El código no puede ser null");
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) throws Exception {
		if (titulo == null || titulo != "") {
			this.titulo = titulo;
		} else {
			throw new Exception("El título no puede ser null");
		}
	}

	public LocalDate getFechaPublic() {
		return fechaPublic;
	}

	public void setFechaPublic(LocalDate fechaPublic) throws Exception {
		if (fechaPublic == null) {
			this.fechaPublic = fechaPublic;
		} else {
			throw new Exception("La fecha de publicación no puede ser null");
		}
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) throws Exception {
		if (paginas > 0) {
			this.paginas = paginas;			
		} else {
			throw new Exception("El número de las páginas no puede ser negativo");
		}
	}

}
