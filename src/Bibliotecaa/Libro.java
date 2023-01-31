package Bibliotecaa;

public class Libro {
	private String titulo;
	private String autor;
	private int num_pag;
	private String id;
	
	
	
	public  String getId() {
		return id;
	}
	public void setId(String string) {
		this.id = string;
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
	public int getNum_pag() {
		return num_pag;
	}
	public void setNum_pag(int i) {
		this.num_pag = i;
	}
}
