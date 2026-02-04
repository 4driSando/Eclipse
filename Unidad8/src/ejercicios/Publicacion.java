package ejercicios;

import java.time.LocalDate;

public class Publicacion {

	private String codigo;
	private String titulo;
	private LocalDate fechaPublic;
	private int paginas;
	
	public Publicacion(String codigo, String titulo, LocalDate fechaPublic, int paginas) {
		this.setCodigo(codigo);
		this.setTitulo(titulo);
		this.setFechaPublic(fechaPublic);
		this.setPaginas(paginas);
	}
	
	public String devCodigo() {
		return getTitulo() +" Código: "+ getCodigo();
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
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public LocalDate getFechaPublic() {
		return fechaPublic;
	}
	public void setFechaPublic(LocalDate fechaPublic) {
		this.fechaPublic = fechaPublic;
	}
	
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	
}
