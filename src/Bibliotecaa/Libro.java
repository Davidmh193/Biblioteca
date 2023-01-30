package Bibliotecaa;

public class Libro {
	private String titulo;
	private String autor;
	private String num_pag;
	private int id;
	
	
	
	public  int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getNum_pag() {
		return num_pag;
	}
	public void setNum_pag(String num_pag) {
		this.num_pag = num_pag;
	}
}
