package Bibliotecaa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class FormularioDeDatos {
	private static final String HOST = "localhost";
	private static final String BBDD = "biblioteca";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	public static void insertarLibro(String Libro){
		String id;
		String titulo;
		String autor;
		int num_pag;
		
		id=JOptionPane.showInputDialog(null, "Introduce el Libro");
		titulo= JOptionPane.showInputDialog(null, "Introduce el titulo");
		autor= JOptionPane.showInputDialog(null, "Introduce el autor");
		num_pag= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de paginas que posee")); 	
		
		
	}
	
	public static void modificarDatosLibros() {
		Libro libro=  new Libro();
		libro.setId(JOptionPane.showInputDialog(null, "Introduce el id del Libro"));
		
		libro.setTitulo(JOptionPane.showInputDialog(null, "Introduce el Titulo del Libro"));
		libro.setAutor(JOptionPane.showInputDialog(null, "Introduce el Autor del Libro"));
		libro.setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el Numero de paginas del Libro")));
		
		if (modificarEnLaBBDDLibro(libro)) {
			System.out.println("Arbol modificado");
		}else {
			System.out.println("Error al modificar");
		}

	}	
	private static boolean modificarEnLaBBDDLibro(Libro libro) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);

			String sql = "UPDATE libros SET id=?, titulo=?, autor=?, num_pag=?";
			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setString(1, libro.getId());
			pst.setString(2, libro.getAutor());
			pst.setString(3, libro.getTitulo());
			pst.setInt(4, libro.getNum_pag());
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
