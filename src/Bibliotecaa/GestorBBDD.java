package Bibliotecaa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;


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
			String id=JOptionPane.showInputDialog(null, "Inserte la id del libro a eliminar");

			Libro eliminar = new Libro();
			eliminar.setId(id);			
			if (eliminarDelaBBDD(id)) {
				System.out.println("Eliminado correctamente");
			} else {
				System.out.println("Error en la eliminacion");
			}
		}

		private static boolean eliminarDelaBBDD(String id) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conexion = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);

				String sql = "DELETE FROM libros WHERE id = ?";
				PreparedStatement pst = conexion.prepareStatement(sql);
				pst.setString(1, id);
				pst.execute();
				return true;

			} catch (ClassNotFoundException e) {
				System.out.println("Driver no cargado, falta el jar");
				e.printStackTrace();
				return false;
			} catch (SQLException e) {
				System.out.println("Fallo en la conexion");
				e.printStackTrace();
				return false;
			}
		}
	
	public static void getLibro(){
		
		
	}
	
}
