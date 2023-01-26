package Bibliotecaa;

public class Prestamo {
	private String id_libro;
	private String id_socio;
	private String fecha;
	private String devuelvo;
	
	public String getId_libro() {
		return id_libro;
	}
	public void setId_libro(String id_libro) {
		this.id_libro = id_libro;
	}
	public String getId_socio() {
		return id_socio;
	}
	public void setId_socio(String id_socio) {
		this.id_socio = id_socio;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDevuelvo() {
		return devuelvo;
	}
	public void setDevuelvo(String devuelvo) {
		this.devuelvo = devuelvo;
	}
	
}
