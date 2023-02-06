package Bibliotecaa;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FormularioDeDatos {
	private static final String HOST = "localhost";
	private static final String BBDD = "biblioteca";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	
	
	public static void insertarLibro(String Libro){
		Libro libro=  new Libro();
		libro.setId(JOptionPane.showInputDialog(null, "Introduce el id del Libro"));
		
		libro.setTitulo(JOptionPane.showInputDialog(null, "Introduce el Titulo del Libro"));
		libro.setAutor(JOptionPane.showInputDialog(null, "Introduce el Autor del Libro"));
		libro.setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el Numero de paginas del Libro")));
		
		try {
			if (insertarEnLaBBDD(libro)) {
				System.out.println("Libro insertado");
			} else {
				System.out.println("Error al insertar");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}	private static boolean insertarEnLaBBDD(Libro libro) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);

			String sql = "INSERT INTO libros(id, titulo, autor, num_pag) VALUES (?, ?, ?, ?)";
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

	
	
	public static void modificarDatosLibros() {
		Libro libro=  new Libro();
		libro.setId(JOptionPane.showInputDialog(null, "Introduce el id del Libro"));
		
		libro.setTitulo(JOptionPane.showInputDialog(null, "Introduce el Titulo del Libro"));
		libro.setAutor(JOptionPane.showInputDialog(null, "Introduce el Autor del Libro"));
		libro.setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el Numero de paginas del Libro")));
		
		if (modificarEnLaBBDDLibro(libro)) {
			System.out.println("Libro modificado");
		}else {
			System.out.println("Error al modificar");
		}

	}	
	private static boolean modificarEnLaBBDDLibro(Libro libro) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);

			String sql = "UPDATE libros SET titulo=?, autor=?, num_pag=? WHERE id=?";
			PreparedStatement pst = conexion.prepareStatement(sql);
			
			pst.setString(1, libro.getAutor());
			pst.setString(2, libro.getTitulo());
			pst.setInt(3, libro.getNum_pag());
			pst.setString(4, libro.getId());
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
			//impelementar Arraylist de Visor
			
		}
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
		public static Prestamo getDatosDePrestamo(Scanner scan) {
			Prestamo prestamo = new Prestamo();
			System.out.println("Intdoduce un id de Libro");
			prestamo.setId_libro(scan.nextLine());

			System.out.println("Intdoduce un id de socio");
			prestamo.setId_socio(scan.nextLine());
			
			prestamo.setFecha(new Date(0));
			prestamo.setDevuelvo(false); 
			return prestamo;
		}
	
}
