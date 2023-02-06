package Bibliotecaa;

import java.sql.Date;

public class Prestamo {
	private String id_libro;
	private String id_socio;
	private Date fecha;
	private boolean devuelvo;
	
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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date date) {
		this.fecha = date;
	}
	public boolean getDevuelvo() {
		return devuelvo;
	}
	public void setDevuelvo(boolean b) {
		this.devuelvo = b;
	}
	
}
