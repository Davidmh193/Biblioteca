package Bibliotecaa;

import java.sql.SQLException;

public class GestorBBDD extends Conector{
	private static final String HOST = "localhost";
	private static final String BBDD = "biblioteca";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	

	public void conectar() {
		super.conectar();
	}
	
	public static void insertarLibro(String Libro){
	FormularioDeDatos.modificarDatosLibros();
	}
	
	public static void eliminarLibro(){
	FormularioDeDatos.eliminarLibro();
	}
	public static void modificarLibros() {
	FormularioDeDatos.modificarDatosLibros();
	}
	public static void VerLibros(){
		Visor.imprimirLibrosEnPantalla(null);
	}
	
	
}
