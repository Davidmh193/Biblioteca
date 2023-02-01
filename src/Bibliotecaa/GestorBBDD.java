package Bibliotecaa;

public class GestorBBDD extends Conector{
	private static final String HOST = "localhost";
	private static final String BBDD = "biblioteca";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	
	public static void insertarLibro(String Libro){
	FormularioDeDatos.modificarDatosLibros();
	
	
	
	}
	/* Sirve para Eliminar las cosas */
	public static void eliminarLibro(){
	FormularioDeDatos.eliminarLibro();
	}
	public static void modificarLibros() {
	FormularioDeDatos.modificarDatosLibros();
	}
	
	
	
}
